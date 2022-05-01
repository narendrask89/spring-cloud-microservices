package com.nandu.it.labs.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nandu.it.labs.microservices.domain.PropertyAccessBean;
import com.nandu.it.labs.microservices.domain.PropertyAccessValue;

@RestController
@RequestMapping("/access")
public class PropertyFileAccessController {

	@Autowired
	private PropertyAccessBean accessBean;
	
	@GetMapping("/access-property-file")
	public PropertyAccessValue getAccessPropertyFile() {
		return new PropertyAccessValue(accessBean.getName(), accessBean.getDesc());
	}
}
