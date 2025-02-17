package com.chamanpreet.splitwise.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @CreatedDate
    @Temporal(value = TemporalType.TIMESTAMP)
    private LocalDateTime createdOn;
    @LastModifiedDate
    @Temporal(value = TemporalType.TIMESTAMP)
    private LocalDateTime updatedOn;
}
