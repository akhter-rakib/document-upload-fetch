package com.rakib.documentuploadfetch.controller;

import com.rakib.documentuploadfetch.annotation.ApiController;
import com.rakib.documentuploadfetch.entity.Employee;
import com.rakib.documentuploadfetch.service.EmployeeService;
import com.rakib.documentuploadfetch.util.UrlConstraint;
import dto.Response;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@ApiController
@RequestMapping(UrlConstraint.EmployeeManagement.ROOT)
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping(UrlConstraint.EmployeeManagement.CREATE)
    public Response saveEmployee(@ModelAttribute Employee employee, @RequestParam("file") MultipartFile file,
                                 @RequestParam(name = "docName") String docName) {
        return employeeService.saveEmployee(employee, file, docName);
    }
}
