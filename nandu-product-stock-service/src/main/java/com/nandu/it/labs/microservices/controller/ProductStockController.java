package com.nandu.it.labs.microservices.controller;

import java.util.Objects;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nandu.it.labs.microservices.domain.ProductStockBean;
import com.nandu.it.labs.microservices.entity.ProductStock;
import com.nandu.it.labs.microservices.repository.ProductStockRepository;

@RestController
public class ProductStockController {

	@Autowired
	private Environment environment;

	@Autowired
	private ProductStockRepository productStockRepository;

	@GetMapping("/check-product-stock/productName/{productName}/productAvailability/{productAvalablity}")
	public ProductStockBean checkProductStock(@PathVariable String productName,
			@PathVariable String productAvalablity) {

		ProductStock productStock = productStockRepository.findByProductNameAndProductAvailability(productName,
				productAvalablity);

		ProductStockBean productStockBean = new ProductStockBean();
		if (!Objects.isNull(productStock)) {
			BeanUtils.copyProperties(productStock, productStockBean);
		}

		productStockBean.setPort(Integer.parseInt(environment.getProperty("server.port")));

		return productStockBean;
	}
}
