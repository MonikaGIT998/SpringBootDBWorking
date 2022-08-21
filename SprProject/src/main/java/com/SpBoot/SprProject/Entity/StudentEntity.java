package com.SpBoot.SprProject.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
	@Entity
	@Table(name="student")
	public class StudentEntity {

		
		@Column(name="Id")
		@Id
		public int id;
		
		@Column(name="Name")
		public String name;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

//		@Override
//		public String toString() {
//			return "StudentEntity [id=" + id + ", name=" + name + "]";
//		}

		
		public StudentEntity() {
			super();
			// TODO Auto-generated constructor stub
		}

		public StudentEntity(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

		
		
	}

