package com.my.cloud.db_service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.my.cloud.db_service.model.Quote;

public interface QuotesRepository extends JpaRepository<Quote, Integer> {

	List<Quote> findByUserName(String username);

}
