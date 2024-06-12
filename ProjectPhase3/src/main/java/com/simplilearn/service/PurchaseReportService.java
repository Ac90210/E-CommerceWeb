package com.simplilearn.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.dao.PurchaseReportDAO;
import com.simplilearn.model.EProduct.Category;

@Service
public class PurchaseReportService {

	@Autowired
	  PurchaseReportDAO purchaseReportDAO;

	    public PurchaseReportService(PurchaseReportDAO purchaseReportDAO) {
	        this.purchaseReportDAO = purchaseReportDAO;
	    }

	    public List<PurchaseReport> getReportsByDateAndCategory(LocalDate date, Category category) {
	        return purchaseReportDAO.findByDateAndCategory(date, category);
	    }
}
