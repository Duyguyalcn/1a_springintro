package com.tobeto.a_springintro.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Table(name="staffs")
@Entity
@Getter
@Setter
public class staff {


    @Id

    @Column(name="staff_id")
            @GeneratedValue(strategy = GenerationType.IDENTITY)
private int staffId;




    @Column(name="first_name")
private String firstname;




    @Column(name="last_name")
private String lastname;



    @Column(name="salary")
    private BigDecimal salary;


@ManyToOne
    @JoinColumn(name= "address_id")
private address address;

@OneToMany(mappedBy ="staff")
@JsonIgnore
    private List<rent>rents;






}
