package com.example.demo.service.cityService;

import com.example.demo.dao.cityDao.City;
import com.example.demo.dataSource.DatabaseContextHolder;
import com.example.demo.dataSource.DatabaseType;
import com.example.demo.mapper.cityMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by li on 2018/11/27.
 */
@Service
public class cityService {
    @Resource
    private cityMapper citymapper;

    public List<City> listAllcity() {
        DatabaseContextHolder.setDatabaseType(DatabaseType.test);
        return citymapper.listAllcity();
    }
}