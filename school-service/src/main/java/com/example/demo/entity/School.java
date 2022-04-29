package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@Entity
@Table(name="school_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class School {
    
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int schoolId;
	private String schoolName;
}
