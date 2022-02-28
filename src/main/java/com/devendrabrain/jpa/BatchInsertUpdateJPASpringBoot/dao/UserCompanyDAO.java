package com.devendrabrain.jpa.BatchInsertUpdateJPASpringBoot.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.devendrabrain.jpa.BatchInsertUpdateJPASpringBoot.entity.UserCompany;
import com.devendrabrain.jpa.BatchInsertUpdateJPASpringBoot.repository.UserCompanyRepository;

@Repository
public class UserCompanyDAO {

	@Autowired
	UserCompanyRepository companyRepository;
	
	public UserCompany create(UserCompany userCompany) {
		return companyRepository.save(userCompany);
	}
	
	public List<UserCompany> findAll() {
		return companyRepository.findAll();
	}
	
	public List<UserCompany> saveAll(List<UserCompany> companies){
		return companyRepository.saveAll(companies);
	}
}
