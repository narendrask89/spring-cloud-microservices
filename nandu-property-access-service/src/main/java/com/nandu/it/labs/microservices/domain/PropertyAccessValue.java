package com.nandu.it.labs.microservices.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PropertyAccessValue {

	private String name;
	
	private String desc;
}
