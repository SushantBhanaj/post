package com.marketingappdaru.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketingappdaru.entity.Lead;

public interface LeadRepository extends JpaRepository<Lead,Long> {

}
