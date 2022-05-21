package com.rakib.documentuploadfetch.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Document extends BaseEntity {
    private String docName;
    private String docLocation;
    private String docType;
    private String entity;
    private Long entityRowId;

}
