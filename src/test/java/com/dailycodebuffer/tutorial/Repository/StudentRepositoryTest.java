package com.dailycodebuffer.tutorial.Repository;

import com.dailycodebuffer.tutorial.Entity.Guardian;
import com.dailycodebuffer.tutorial.Entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent(){
        Student student = Student.builder()
                .emailId("telmangadimov1@gmail.com")
                .firstName("Telman")
                .lastName("Gadimov")
                //.guardianName("Eldar")
                //.guardianEmail("eldar@gmail.com")
                //.guardianMobile("999999999999")
                .build();

        studentRepository.save(student);
    }


    @Test
    public void saveStudentWithGuardian() {

        Guardian guardian = Guardian.builder()
                .name("Eldar")
                .email("eldar1975@gmail.com")
                .mobile("99888838")
                .build();

        Student student = Student.builder()
                .firstName("Telman")
                .emailId("telmangadimov2@gmail.com")
                .lastName("Gadimov")
                .guardian(guardian).build();


        studentRepository.save(student);
    }

    @Test
    public void printAllStudent() {
        List<Student> studentList =
                studentRepository.findAll();
        System.out.println("studentList = " + studentList);
    }
}