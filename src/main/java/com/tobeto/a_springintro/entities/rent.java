package com.tobeto.a_springintro.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDate;


@Table(name="rents")
@Entity
@Getter
@Setter
public class rent {
    @Id
    @Column(name="rent_id")
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rentId;

    @Column(name="date_rented")
private LocalDate dateRented;


    @Column(name="date_returned")
private LocalDate dateReturned;




    @Column(name="is returned")
private  Boolean  isReturned;


@ManyToOne
    @JoinColumn(name="staff_id")
    private staff staff;


    @ManyToOne
    @JoinColumn(name="customer_id")
    private customer customer;


    @ManyToOne
    @JoinColumn(name="vehicle_id")
    private vehicle vehicle;



}
