package com.prashanthIt;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.prashanthIt.dao.StudentRepo;
import com.prashanthIt.entity.Student;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		StudentRepo studentRepo = context.getBean(StudentRepo.class);

		Student entity = new Student();

		entity.setStudentId(104);
		entity.setStudentName("Bhagath Singh");
		entity.setStudentEmail("Bhagath@AshokIt.in");
		entity.setStudentAge(28);

		Student save = studentRepo.save(entity);

		System.out.println("Record updated successfully:" + save);

		/*
		 * Optional<Student> findById = studentRepo.findById(104); if
		 * (findById.isPresent()) { System.out.println(findById.get()); } else {
		 * System.out.println("Record not found"); }
		 */

		/*
		 * Iterable<Student> findAll = studentRepo.findAll(); findAll.forEach(s -> {
		 * System.out.println(s); });
		 */

		/*
		 * Iterable<Student> findAllById = studentRepo.findAllById(Arrays.asList(101,
		 * 102, 104)); findAllById.forEach(s -> { System.out.println(s); });
		 */

		studentRepo.deleteById(101);
	}

}
