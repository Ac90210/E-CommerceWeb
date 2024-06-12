package com.simplilearn.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.simplilearn.entity.UserEntity;
import com.simplilearn.model.EProduct;
import com.simplilearn.model.EProduct.Category;
import com.simplilearn.model.PurchaseReport;

public class PurchaseReportDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	List<PurchaseReport> findByDateAndCategory(LocalDate date, Category category);
	

}
