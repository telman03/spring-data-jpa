package com.dailycodebuffer.tutorial.Repository;

import com.dailycodebuffer.tutorial.Entity.Course;
import com.dailycodebuffer.tutorial.Entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TeacherRepositoryTest {
    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public void saveTeacher(){
        Course courseDBA =
                Course.builder()
                        .title("DBA")
                        .credit(5)
                        .build();

        Course courseJava =
                Course.builder()
                        .title("Java")
                        .credit(5)
                        .build();

        Teacher teacher =
                Teacher.builder()
                        .firstName("Alexey")
                        .lastName("Rykhalskiy")
                        //.courses(List.of(courseDBA, courseJava))
                        .build();

        teacherRepository.save(teacher);
    }
}
