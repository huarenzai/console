package com.console.service.impl;

import com.console.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/10/27.
 */
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public void test() {
        List<Map<String, Object>> list = jdbcTemplate.queryForList("select * FROM test");
        System.out.println(list);
    }
}
