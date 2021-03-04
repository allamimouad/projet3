package com.bezkoder.spring.datajpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.spring.datajpa.model.Cours;

public interface TutorialRepository extends JpaRepository<Cours, Long> {
	
	List<Cours> findByPublished(boolean published);
	List<Cours> findByTitleContaining(String title);
	
}
