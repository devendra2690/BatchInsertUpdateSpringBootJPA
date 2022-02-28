package com.devendrabrain.jpa.BatchInsertUpdateJPASpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.devendrabrain.jpa.BatchInsertUpdateJPASpringBoot.entity.UserCompany;
import com.devendrabrain.jpa.BatchInsertUpdateJPASpringBoot.service.UserCompanyService;

@RestController
public class UserCompanyController {

	@Autowired
	private UserCompanyService companyService;
	
	@PostMapping("/create")
	public List<UserCompany> create(@RequestBody List<UserCompany> userCompany) {		
		return companyService.create(userCompany);
	}
	
	@GetMapping("/findAll")
	public List<UserCompany> findAll() {		
		return companyService.findAll();
	}
}
