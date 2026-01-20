package com.studentAttendance.studentAttendance.Service;

import com.studentAttendance.studentAttendance.Model.Educator;
import com.studentAttendance.studentAttendance.Repository.EducatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//creates a bean
@Service
public class EducatorService {
    //automatic dependency injection
    @Autowired
    private EducatorRepository educatorRepository;

    public Educator saveEducator(Educator educator){
        return educatorRepository.save(educator);
    }
}
