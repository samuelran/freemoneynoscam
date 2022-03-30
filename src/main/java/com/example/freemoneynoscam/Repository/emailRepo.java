package com.example.freemoneynoscam.Repository;
import com.example.freemoneynoscam.Models.email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class emailRepo {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<email> fetchAll(){
        String sql="SELECT * FROM emaildb.email;";
        RowMapper<email> rowMapper= new BeanPropertyRowMapper<>(email.class);
        return jdbcTemplate.query(sql,rowMapper);
    }
    public email addEmail(email userEmail){
        String sql = "insert into email values(0,?)";
        jdbcTemplate.update(sql,userEmail.getEmailString());
        return null;
    }
}
