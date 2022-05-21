package com.rakib.documentuploadfetch.service;


import com.rakib.documentuploadfetch.entity.BaseEntity;
import com.rakib.documentuploadfetch.entity.Document;
import dto.Response;
import org.springframework.web.multipart.MultipartFile;

public interface DocumentService {

    Response saveDoc(String docName, MultipartFile file);

    Document saveDocument(String docName, MultipartFile file, Class<? extends BaseEntity> modelClass, Long rowId);
}
