package com.example.demo.mapper;

import com.example.demo.dao.cityDao.City;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by li on 2018/11/27.
 */
@Mapper
public interface cityMapper {
    List<City> listAllcity();
}
