package com.sunshine.cache.local;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class TestCacheBuilder {

    private static Map<String, User> userMap = new HashMap<>();

    public TestCacheBuilder() {
        initUserMap();
    }

    private void initUserMap() {
        userMap.put("1", new User("1", "zhangsna"));
        userMap.put("2", new User("2", "zhangsna2"));
        userMap.put("3", new User("3", "zhangsna3"));
    }

    LoadingCache<String, User> localUserCache= CacheBuilder.newBuilder().expireAfterWrite(5000, TimeUnit.SECONDS)
            .maximumSize(10).build(new CacheLoader<String, User>() {

                @Override
                public User load(String s) throws Exception {
                    return getUserById(s);
                }
            });

    private User getUserById(String id) {
        // 从DB查询
        return userMap.get(id);
    }

    public User getUserByCode(String code) {
        try {
            return localUserCache.get(code);
        } catch (ExecutionException e) {
            System.out.println("exception " + e);
            return null;
        }
    }

  public static void main(String[] args) {
    //
      TestCacheBuilder testCacheBuilder = new TestCacheBuilder();
      User user = testCacheBuilder.getUserByCode("2");
      System.out.println(user);
      user = testCacheBuilder.getUserByCode("4");
      System.out.println(user);
  }
}

class User {
    private String id;
    private String name;

    public User() {
    }

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
