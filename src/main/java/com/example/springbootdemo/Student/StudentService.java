package com.example.springbootdemo.Student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(1L, "Isaac", "isaactsui2000@gmail.com", LocalDate.of(2000, Month.MARCH, 21), 21)
        );
    }
}
