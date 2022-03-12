package com.javadeveloper.training.springboot.repos.patient;

import com.javadeveloper.training.springboot.entities.patient.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends CrudRepository<Patient,Long> {
}
