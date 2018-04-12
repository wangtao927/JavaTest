package com.sunshine.list;

import java.util.ArrayList;

/**
 * Created by wangtao on 2018/4/11.
 */
public class TestList {

    public static void main(String[] args) {

        ArrayList<User> arrayList = new ArrayList();
        arrayList.add(new User("name1", 1));
        arrayList.add(new User("name2", 2));
        arrayList.add(new User("name3", 3));
        arrayList.add(new User("name4", 4));
        arrayList.add(new User("name5", 5));
        System.out.println(arrayList);
        for (User u : arrayList) {

            u.setAge(u.getAge()+10);
        }
        System.out.println(arrayList);


        ArrayList<String> alist = new ArrayList<>();
        alist.add("1");
        alist.add("2");
        alist.add("3");
        for (String s : alist) {
            s += "10";
        }
        System.out.println(alist);

        ArrayList<Integer> alist1 = new ArrayList<>();
        alist1.add(1);
        alist1.add(2);
        alist1.add(3);
        for (Integer a : alist1) {
            a +=10;
        }
        System.out.println(alist1);
    }


}
class User {

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User() {
    }

    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
