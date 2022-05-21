package com.rakib.documentuploadfetch.service.serviceImpl;

import com.rakib.documentuploadfetch.entity.Document;
import com.rakib.documentuploadfetch.entity.Employee;
import com.rakib.documentuploadfetch.repository.EmployeeRepository;
import com.rakib.documentuploadfetch.service.DocumentService;
import com.rakib.documentuploadfetch.service.EmployeeService;
import com.rakib.documentuploadfetch.util.ResponseBuilder;
import dto.Response;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final DocumentService documentService;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository, DocumentService documentService) {
        this.employeeRepository = employeeRepository;
        this.documentService = documentService;
    }

    @Override
    public Response saveEmployee(Employee employee, MultipartFile file, String docName) {
        employee = employeeRepository.save(employee);
        Document document = documentService.saveDocument(docName, file, Employee.class, employee.getId());
        if (employee != null && document != null) {
            return ResponseBuilder.getSuccessResponse(HttpStatus.OK, "Successfull save", null);
        }
        return null;
    }


}
