package com.nandu.it.labs.microservices.domain;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductStockBean {

	private Long id;
	
	private String productName;
	
	private BigDecimal productPrice;
	
	private String productAvailability;
	
	private double discountOffer;
	
	private int port;
	
}
