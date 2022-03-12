package com.javadeveloper.training.springboot.repos.staff;

import com.javadeveloper.training.springboot.entities.staff.Staff;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends CrudRepository<Staff,Long> {
}
