package com.SpBoot.SprProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.SpBoot.SprProject.Controller", 
	"com.SpBoot.SprProject.Entity", 
	"com.SpBoot.SprProject.JpaRepository"})
public class SprProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprProjectApplication.class, args);
	}

}
