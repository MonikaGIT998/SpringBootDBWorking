package com.SpBoot.SprProject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RestController;

import com.SpBoot.SprProject.Entity.StudentEntity;
import com.SpBoot.SprProject.JpaRepository.StudentRepository;

@Component
@RestController
	public class SpringController {
		
		@Autowired
		private StudentEntity student;
		
		@Autowired
		private StudentRepository studentRepo;
		
			@GetMapping("/welcome")
			public String getMesg()
			{
				return "hello";
			}

			
			@GetMapping("/id")
			public List<StudentEntity> getId()
			{
				return  (List<StudentEntity>) studentRepo.findAll();
			}
		

}
