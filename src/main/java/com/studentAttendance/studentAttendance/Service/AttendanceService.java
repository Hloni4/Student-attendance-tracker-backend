package com.studentAttendance.studentAttendance.Service;

import com.studentAttendance.studentAttendance.Model.Attendance;
import com.studentAttendance.studentAttendance.Repository.AttendanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//creates a bean
@Service
public class AttendanceService {

    //automatic dependency injection
    @Autowired
    private AttendanceRepository attendanceRepository;

    public Attendance saveAttendance(Attendance attendance){
        return attendanceRepository.save(attendance);
    }

//    public List<Attendance> getAttendanceByStudentId(Integer studentId){
//        return attendanceRepository.findById(subjectId);
//    }


    public List<Attendance> getAttendanceBySubjectId(Integer subjectId) {
        return attendanceRepository.findBySubjectId(subjectId);
    }
}
