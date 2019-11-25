package com.skyrain.community.mapper;

import com.skyrain.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Insert("INSERT INTO user (name,account_id,token,gmt_create,gmt_modified,avatar_url) values (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified},#{avatar_url})")
    void insert(User user);

    @Select("SELECT * FROM user WHERE token = #{token}")
    User findByToken(String token);
}
