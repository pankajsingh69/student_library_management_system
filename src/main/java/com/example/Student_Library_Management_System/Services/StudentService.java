package com.example.Student_Library_Management_System.Services;

import com.example.Student_Library_Management_System.Enums.CardStatus;
import com.example.Student_Library_Management_System.Model.Card;
import com.example.Student_Library_Management_System.Model.Student;
import com.example.Student_Library_Management_System.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public String createStudent(Student student){


        Card card = new Card();
        card.setCardStatus(CardStatus.ACTIVATED);
        card.setStudent(student);   // we have to set student variable
        student.setCard(card);

        studentRepository.save(student);  // card will automatically saved because it's bidirectional mapping
        return "Student and Card added successfully";
        // as soon as student is created the card should also be generated on it's own
    }
}
