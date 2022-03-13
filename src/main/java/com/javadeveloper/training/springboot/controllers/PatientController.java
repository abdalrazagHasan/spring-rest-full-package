package com.javadeveloper.training.springboot.controllers;

import com.javadeveloper.training.springboot.entities.patient.Patient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {

    private final List<Patient> patients = Arrays.asList(new Patient(),new Patient());

    @GetMapping(path = "/getAllPatient")
    public ResponseEntity<List<Patient>> getAllPatients(){
        return ResponseEntity.ok(patients);
    }

}
