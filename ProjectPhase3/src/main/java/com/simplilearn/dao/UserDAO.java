package com.simplilearn.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.simplilearn.entity.UserEntity;


@Repository
public class UserDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<UserEntity> getUsers() {
		return jdbcTemplate.query("select * from users", new RowMapper<UserEntity>() {
			
			@Override
			public UserEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
				UserEntity user = new UserEntity();
				user.setId(rs.getInt(1));
				user.setUsername(rs.getString(2));
				user.setPassword(rs.getString(3));
				user.setEmail(rs.getString(4));
				return user;
			}
		});
	}
}
