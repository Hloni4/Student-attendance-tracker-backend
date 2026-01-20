package com.studentAttendance.studentAttendance.Controller;

import com.studentAttendance.studentAttendance.Model.Attendance;
import com.studentAttendance.studentAttendance.Repository.EducatorRepository;
import com.studentAttendance.studentAttendance.Service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//handles web requests and sends back JSON responses
@RestController
//defines base path
@RequestMapping
public class AttendanceController {

    //automatic dependency injection
    @Autowired
    private AttendanceService attendanceService;

    //creating new attendance record
    @PostMapping
    public Attendance createAttendance(@RequestBody Attendance attendance){
        return attendanceService.saveAttendance(attendance);
    }

    //for getting attendance records using the subjectId
    @GetMapping
    public List<Attendance> getAttendanceBySubjectId(Integer subjectId){
        return attendanceService.getAttendanceBySubjectId(subjectId);
    }
}
