package com.studentAttendance.studentAttendance.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

//lombok annotation, creates getters, setters, toString(), hashCode() methods
@Data
//makes class a database table
@Entity(name = "attendance")
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "subjectId")
    private Educator SubjectId;

//specifies the actual name of the column in the database table
    @Column(nullable = false)
    private String StudentName;

    @Column(nullable = false)
    private String Status;

    @Column(nullable = false)
    private Date Date;

}

