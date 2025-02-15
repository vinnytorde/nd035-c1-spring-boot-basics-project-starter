package com.udacity.jwdnd.course1.cloudstorage.mapper;

import com.udacity.jwdnd.course1.cloudstorage.model.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {
  @Insert(
      "insert into USERS (firstname, lastname, username, password, salt) values (#{firstName}, #{lastName}, #{username}, #{password}, #{salt})")
  @Options(useGeneratedKeys = true, keyProperty = "userId")
  void create(User user);

  @Select("select * from USERS where username = #{username}")
  User findByUsername(String username);
}
