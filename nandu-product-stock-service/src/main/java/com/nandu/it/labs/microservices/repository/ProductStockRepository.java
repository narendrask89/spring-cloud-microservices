package com.nandu.it.labs.microservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nandu.it.labs.microservices.entity.ProductStock;

public interface ProductStockRepository extends JpaRepository<ProductStock, Long> {

	ProductStock findByProductNameAndProductAvailability(String productName, String productAvailability);
}
