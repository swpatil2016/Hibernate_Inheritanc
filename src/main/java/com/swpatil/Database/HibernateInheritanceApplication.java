package com.swpatil.Database;

import com.swpatil.Database.Inheritance.JoinTable.Mentor;
import com.swpatil.Database.Inheritance.JoinTable.MentorRepository;
import com.swpatil.Database.Inheritance.JoinTable.Student;
import com.swpatil.Database.Inheritance.JoinTable.StudentRepository;
import com.swpatil.Database.Inheritance.Table_Per_Class.TA;
import com.swpatil.Database.Inheritance.Table_Per_Class.TaRepository;
import com.swpatil.Database.Inheritance.Table_Per_Class.User;
import com.swpatil.Database.Inheritance.Table_Per_Class.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class HibernateInheritanceApplication implements CommandLineRunner{
	public static void main(String[] args) {
		SpringApplication.run(HibernateInheritanceApplication.class, args);
	}

	MentorRepository mentorRepository;
	StudentRepository studentRepository;

	public HibernateInheritanceApplication(MentorRepository mentorRepository, StudentRepository studentRepository) {
		this.mentorRepository = mentorRepository;
		this.studentRepository = studentRepository;
	}

	@Override
	public void run(String... args) throws Exception {

		Student student = new Student();
		student.setEmail("mayur@gmail.com");
		student.setName("Mayur");
		student.setBatch("nov");
		student.setPsp(23.25);

		studentRepository.save(student);
	}}

