package com.itheima.dao;

import com.itheima.user.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserDao {

    @Select("select * from t_user where id = #{id}")
    User findById( int id);
}
