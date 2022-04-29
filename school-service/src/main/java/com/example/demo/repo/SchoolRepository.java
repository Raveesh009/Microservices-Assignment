package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.School;

@Repository
public interface SchoolRepository extends JpaRepository<School,Integer> {
     @Query
	public School findBySchoolName(String schoolName);
}
