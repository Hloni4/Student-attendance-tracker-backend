package com.studentAttendance.studentAttendance.Controller;

import com.studentAttendance.studentAttendance.Model.Educator;
import com.studentAttendance.studentAttendance.Repository.EducatorRepository;
import com.studentAttendance.studentAttendance.Service.EducatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//handles web requests and sends back JSON responses
@RestController
//defines base path
@RequestMapping
public class EducatorController {

    //automatic dependency injection
    @Autowired
    private EducatorService educatorService;

    //used to create new educator
    @PostMapping
    public Educator createEducator(@RequestBody Educator educator) {
        return educatorService.saveEducator(educator);
    }

}
