package com.studentAttendance.studentAttendance.Repository;

import com.studentAttendance.studentAttendance.Model.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AttendanceRepository extends JpaRepository<Attendance, Integer> {
    List<Attendance> findBySubjectId(Integer subjectId);
}
