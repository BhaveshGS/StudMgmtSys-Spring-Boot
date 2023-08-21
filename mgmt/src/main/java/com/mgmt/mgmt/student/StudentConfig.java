package com.mgmt.mgmt.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student bhavesh= new Student(
                1L,
				"bhavesh",
				LocalDate.of(2001, 7, 30),
				"bh@gmail.com"
			);
            Student gs= new Student(
                2L,
				"gs",
				LocalDate.of(2001, 7, 30),
				"gs@gmail.com"
			);

            repository.saveAll(
                List.of(bhavesh,gs)
            );
        };
    }
}
