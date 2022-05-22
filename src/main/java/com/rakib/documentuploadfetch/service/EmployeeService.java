package com.rakib.documentuploadfetch.service;

import com.rakib.documentuploadfetch.entity.Employee;
import dto.Response;
import org.springframework.web.multipart.MultipartFile;

public interface EmployeeService {
    Response saveEmployee(Employee employee, MultipartFile file, String docName);
}
