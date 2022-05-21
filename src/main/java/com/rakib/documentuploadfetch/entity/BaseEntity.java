package com.rakib.documentuploadfetch.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(updatable = false)
    private LocalDateTime createdAt;
    @Column(updatable = false)
    private Long createdBy;
    private LocalDateTime updatedAt;
    private Long updatedBy;
    private Boolean isActive;

    @PrePersist
    public void prePersist() {
        this.isActive = Boolean.TRUE;
        this.createdAt = LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate() {
        this.updatedAt = LocalDateTime.now();
    }
}
