package com.swpatil.Database;

import com.swpatil.Database.Inheritance.SuperClass.Mentor;
import com.swpatil.Database.Inheritance.SuperClass.MentorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateInheritanceApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(HibernateInheritanceApplication.class, args);
	}

	MentorRepository mentorRepository;

	public HibernateInheritanceApplication(MentorRepository mentorRepository) {
		this.mentorRepository = mentorRepository;
	}

	@Override
	public void run(String... args) throws Exception {

		Mentor mentor = new Mentor();
		mentor.setEmail("Mentor@gmail.com");
		mentor.setId(20L);
		mentor.setName("Praj");
		mentor.setSalary(400000L);
		mentorRepository.save(mentor);
	}
}
