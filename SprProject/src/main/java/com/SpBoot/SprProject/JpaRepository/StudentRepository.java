package com.SpBoot.SprProject.JpaRepository;

import javax.persistence.Id;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.SpBoot.SprProject.Entity.StudentEntity;

@Component
@Repository

public interface StudentRepository extends CrudRepository<StudentEntity, Id> {

}
