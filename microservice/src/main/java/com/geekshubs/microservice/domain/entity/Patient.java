package com.geekshubs.microservice.domain.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name="PATIENTS")
public class Patient implements Serializable {

    private static final Long serialVersionUUid=1L;

    @Id
    @Column(name="uuid",length = 16, unique = true, nullable = false)
    private String uuid = UUID.randomUUID().toString();

    @Column
    private String name;

    @Column
    private String lastName;

    @Column
    private LocalDate birthDate;

    @Column
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateCreated;

}
