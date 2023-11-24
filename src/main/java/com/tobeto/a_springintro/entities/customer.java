package com.tobeto.a_springintro.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Table(name="customers")
@Entity
@Getter
@Setter
public class customer {
@Id

    @Column(name="customer_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;

    @Column(name = "birth_date")
    private LocalDate birthDate;


    @Column(name="first_name")
    private String firstName;


    @Column(name = "last_name")
private String lastName;







@ManyToOne
    @JoinColumn(name = "address_id")
private address address;

    @OneToMany(mappedBy ="customer")
    @JsonIgnore
    private List<rent>rents;
















}
