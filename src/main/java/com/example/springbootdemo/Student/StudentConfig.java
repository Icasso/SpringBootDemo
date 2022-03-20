package com.example.springbootdemo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.MARCH;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student isaac = new Student("Isaac", "isaac@gmail.com", LocalDate.of(2000, MARCH, 21));
            Student alex = new Student("Alex", "alex@gmail.com", LocalDate.of(2004, MARCH, 21));

            repository.saveAll(List.of(isaac, alex));
        };
    };
}
