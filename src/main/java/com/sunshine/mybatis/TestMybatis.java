package com.sunshine.mybatis;

import com.sunshine.designpatterns.Test;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by wangtao on 2018/2/24.
 */
public class TestMybatis {

    public static void main(String[] args) throws IOException {
        TestMybatis testMybatis = new TestMybatis();
        String resource = "mybatis-config.xml";
//        InputStream inputStream = new FileInputStream(resource);
//        InputStream inputStream = TestMybatis.class.getClassLoader().getResourceAsStream(resource);
        InputStream inputStream = Resources.getResourceAsStream(resource);

        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession session = sqlSessionFactory.openSession();
        try {
            EmailMapper mapper = session.getMapper(EmailMapper.class);

            Email email = mapper.selectEmail(2);
            System.out.println(email);
            // 第二次查询，直接查询的是内存， 没有查询数据库
            email = mapper.selectEmail(2);
            System.out.println(email);
            mapper.insertEmail(testMybatis.getNewEmail());
            //数据库有更新后， 又重新查询数据库
            email = mapper.selectEmail(2);
            System.out.println(email);
            List<Email> emailList = mapper.selectList();
            System.out.println(emailList);

//            session.commit();
        } finally {
            session.close();
        }
    }

    private Email getNewEmail() {
        Email email = new Email();
        email.setAccount("account1");
        email.setEmailConfigId(1);
        email.setPassword("pwd");
        email.setPhone("138xxxxxxxx");
        email.setEmailType(1);
        return email;
    }
}
