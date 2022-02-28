package com.devendrabrain.jpa.BatchInsertUpdateJPASpringBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devendrabrain.jpa.BatchInsertUpdateJPASpringBoot.dao.UserCompanyDAO;
import com.devendrabrain.jpa.BatchInsertUpdateJPASpringBoot.entity.UserCompany;

@Service
public class UserCompanyService {

	@Autowired
	UserCompanyDAO companyDAO;

	public List<UserCompany> create(List<UserCompany> userCompany) {
		
		return companyDAO.saveAll(userCompany);
	}

	public List<UserCompany> findAll() {
		List<UserCompany> usercompany = companyDAO.findAll();		
		return usercompany;
	}
}
