package com.rakib.documentuploadfetch.repository;

import com.rakib.documentuploadfetch.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
