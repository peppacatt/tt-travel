package com.baby.tt.dao;


import com.baby.tt.common.po.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {
    @Select("SELECT * from tab_user where id = #{id}")
    public User selectUserById(int id);

    @Select("SELECT * from tab_user where username = #{username}")
    public User selectUserByName(String username);

    @Insert("insert into tab_user(username,password,name,birthday,sex,telephone,email)" +
            "values(#{username},#{password},#{name},#{birthday},#{sex},#{telephone},#{email})")
    public int insertUser(User user);

    @Select("select * from tab_user where username=#{username} and password=#{password}")
    public User login(String username, String password);
}
