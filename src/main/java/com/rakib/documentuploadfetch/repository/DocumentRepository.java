package com.rakib.documentuploadfetch.repository;

import com.rakib.documentuploadfetch.entity.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Document, Long> {
    Document findByIdAndIsActiveTrue(Long id);

    int countByDocLocation(String location);
}
