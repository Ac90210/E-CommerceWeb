package com.simplilearn.model;

import java.time.LocalDate;

import com.simplilearn.entity.UserEntity;

public class PurchaseReport {
	
	    private Long id;
	    
	    @ManyToOne
	    @JoinColumn(name = "user_id")
	    private UserEntity user;

	    @ManyToOne
	    @JoinColumn(name = "product_id")
	    private EProduct product;

	    private int quantity;

	    private LocalDate date;

	    public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public UserEntity getUser() {
			return user;
		}

		public void setUser(UserEntity user) {
			this.user = user;
		}

		public EProduct getProduct() {
			return product;
		}

		public void setProduct(EProduct product) {
			this.product = product;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		public LocalDate getDate() {
			return date;
		}

		public void setDate(LocalDate date) {
			this.date = date;
		}

		

}
