package com.edward.springbootmybaties.mapper;

import com.edward.springbootmybaties.bean.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {

    @Select("select * from user where id=#{id}")
    public User getUserById(Integer id);

    @Delete("delete * from user where id=#{id}")
    public int deleteUserById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into user(username,password) values(#{username},#{password})")
    public int insertUser(User user);

    @Update("update user set username=#{username},password=#{password}")
    public int updateUser(User user);


}
