package com.sit.lqg.rhupdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service

public abstract class ServiceImpl implements Service{
    @Autowired
    private JdbcTemplate jdbcTemplate = null;

    private void getMemberMapper(){

    }


}
