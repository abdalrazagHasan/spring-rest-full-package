package com.javadeveloper.training.springboot.services;

import com.javadeveloper.training.springboot.entities.staff.Staff;
import com.javadeveloper.training.springboot.repos.staff.StaffRepository;
import org.springframework.stereotype.Service;

@Service
public class StaffService {

    private final StaffRepository staffRepository;

    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public Staff getAllInformation(){
        return staffRepository.findById(1L).get();
    }
}
