package com.javadeveloper.training.springboot.controllers;

import com.javadeveloper.training.springboot.entities.patient.Patient;
import com.javadeveloper.training.springboot.entities.staff.Staff;
import com.javadeveloper.training.springboot.services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("staff/")
public class StaffController {

    private final StaffService staffService;

    @Autowired
    public StaffController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping(path = "/getAllInformation",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Staff> getAllInformation(){
        return ResponseEntity.ok(new Staff());
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Staff> whatever(){
        return ResponseEntity.ok(new Staff());
    }
}
