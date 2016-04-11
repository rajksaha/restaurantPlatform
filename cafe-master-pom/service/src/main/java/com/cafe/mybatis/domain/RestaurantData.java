package com.cafe.mybatis.domain;

import java.math.BigDecimal;

public class RestaurantData {
	
	private Integer restaurantID;
	private String restaurantName;
	private Integer useGst;
	private BigDecimal gstRate;

	public Integer getRestaurantID() {
		return restaurantID;
	}
	public void setRestaurantID(Integer restaurantID) {
		this.restaurantID = restaurantID;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public Integer getUseGst() {
		return useGst;
	}
	public void setUseGst(Integer useGst) {
		this.useGst = useGst;
	}

	public BigDecimal getGstRate() {
		return gstRate;
	}

	public void setGstRate(BigDecimal gstRate) {
		this.gstRate = gstRate;
	}
}
