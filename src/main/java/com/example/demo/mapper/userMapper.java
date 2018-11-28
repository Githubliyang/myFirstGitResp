package com.example.demo.mapper;

import com.example.demo.dao.user;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * Created by li on 2018/10/16.
 */

@Mapper
public interface userMapper {
    List<user> listAlluser();
    List<user> selectUserByPage(@Param(value="startPos") Integer startPos, @Param(value="pageSize") Integer pageSize);
    long getUserCount();
    Integer deleteUserById(int id);
    List<user> findTypeUser();
}
