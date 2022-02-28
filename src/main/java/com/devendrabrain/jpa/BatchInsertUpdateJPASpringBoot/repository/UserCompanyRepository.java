package com.devendrabrain.jpa.BatchInsertUpdateJPASpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devendrabrain.jpa.BatchInsertUpdateJPASpringBoot.entity.UserCompany;

public interface UserCompanyRepository extends JpaRepository<UserCompany, Long>{

}
