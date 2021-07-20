package com.grbn.azure.helloword.controller;

import com.grbn.azure.helloword.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static com.grbn.azure.helloword.util.FakerUtil.*;

@RestController
public class MessageController {

  @GetMapping("/getMessage")
  public String getInitialMessage() {
    return "Application deployed successfully";
  }

  @GetMapping("/students")
  public List<Student> getStudentList(@RequestParam("count") int count) {
    List<Student> students = new ArrayList<>();
    if (count == 0) {
      System.out.println("setting default value 10");
      count = 10;
    }
    for (int i = 0; i < count; i++) {
      Student student = new Student(getId(), getName(), getAddress());
      students.add(student);
    }
    return students;
  }
}
