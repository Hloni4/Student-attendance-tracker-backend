package com.studentAttendance.studentAttendance.Model;

import jakarta.persistence.*;
import lombok.Data;

//lombok annotation, creates getters, setters, toString(), hashCode() methods
@Data
//makes class a database table
@Entity(name = "Educator")
public class Educator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

//specifies the actual name of the column in the database table
    @Column(nullable = false)
    private String SubjectName;

    @Column(nullable = false)
    private String EducatorName;
}
