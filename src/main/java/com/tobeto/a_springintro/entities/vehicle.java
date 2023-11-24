package com.tobeto.a_springintro.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Table(name="vehicles")
@Entity
@Getter
@Setter
public class vehicle {
@Id
    @Column(name = "vehicle_id")
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int vehicleId;


@Column(name="brand")
private String brand;

@Column(name="bought_date")
private LocalDate boughtDate;


@Column(name="ıs_available")
private Boolean isAvailable;

@ManyToOne
    @JoinColumn(name="cost_id")
    private cost cost;

    @OneToMany(mappedBy ="vehicle")
    @JsonIgnore
    private List<rent>rents;














}
