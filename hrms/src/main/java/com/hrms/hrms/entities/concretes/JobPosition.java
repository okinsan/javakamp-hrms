package com.hrms.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="job_positions")
public class JobPosition {
	
	@Column(name="id")
	private int id;
	
	@Column(name="position")
	private String position;
	
	public JobPosition(int id, String position) {
		super();
		this.id = id;
		this.position = position;
	}
}
