package com.rakib.documentuploadfetch.controller;

import com.rakib.documentuploadfetch.annotation.ApiController;
import com.rakib.documentuploadfetch.service.DocumentService;
import com.rakib.documentuploadfetch.util.UrlConstraint;
import dto.Response;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@ApiController
@RequestMapping(UrlConstraint.DocumentManagement.ROOT)
public class DocumentController {
    private final DocumentService documentService;

    public DocumentController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @PostMapping(UrlConstraint.DocumentManagement.CREATE)
    public Response saveDoc(@RequestParam(name = "docName") String docName, @RequestParam("file") MultipartFile file) {
        return documentService.saveDoc(docName, file);
    }
}
