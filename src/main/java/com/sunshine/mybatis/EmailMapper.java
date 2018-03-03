package com.sunshine.mybatis;

import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by wangtao on 2018/2/24.
 */
public interface EmailMapper {


    @Select ("SELECT * FROM email WHERE id = #{id}")
    Email selectEmail(int id);

    @Select("select * from email limit 1")
    List<Email> selectList();
}
