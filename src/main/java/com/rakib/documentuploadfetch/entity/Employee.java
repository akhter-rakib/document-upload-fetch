package com.rakib.documentuploadfetch.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Employee extends BaseEntity {
    private String empName;
}
