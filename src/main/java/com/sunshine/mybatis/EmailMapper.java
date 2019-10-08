package com.sunshine.mybatis;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by wangtao on 2018/2/24.
 */
public interface EmailMapper {


    @Select ("SELECT * FROM email WHERE id = #{id}")
    Email selectEmail(int id);

    @Select("select * from email limit 10")
    List<Email> selectList();

    @Insert("insert into email (user_id, status, phone, account, password, email_type) " +
            "values(#{userId}, #{status}, #{phone}, #{account}, #{password}, #{emailType})")
    int insertEmail(Email email);
}
