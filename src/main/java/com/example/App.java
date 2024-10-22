package com.example;

import com.example.model.Student;
import com.example.dao.studentDAO;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.sql.SQLException;

public class App {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        studentDAO studentDAO = new studentDAO();

        Date birthDate = new GregorianCalendar(1990, Calendar.JANUARY, 1).getTime();
        Student student = new Student("John", "johndoe@gmail.com", birthDate);

        studentDAO.insertStudent(student);
        studentDAO.printStudents();
    }
}
