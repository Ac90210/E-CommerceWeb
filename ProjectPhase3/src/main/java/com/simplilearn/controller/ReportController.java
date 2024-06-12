package com.simplilearn.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.entity.UserEntity;
import com.simplilearn.model.EProduct;
import com.simplilearn.model.EProduct.Category;
import com.simplilearn.model.PurchaseReport;
import com.simplilearn.service.EProductService;
import com.simplilearn.service.PurchaseReportService;
import com.simplilearn.service.UserService;

@RestController
@RequestMapping("/api/reports")
public class ReportController {
	
	@Autowired
	PurchaseReportService purchaseReportService;
	
	 @GetMapping("/filtered")
	    public ResponseEntity<List<PurchaseReport>> getFilteredReports(
	            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date,
	            @RequestParam Category category) {
	        List<PurchaseReport> reports = purchaseReportService.getReportsByDateAndCategory(date, category);
	        return ResponseEntity.ok(reports);
	    }
	

}
