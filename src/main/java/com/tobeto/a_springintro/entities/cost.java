package com.tobeto.a_springintro.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;



import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Table(name="costs")
@Entity
@Getter
@Setter
public class cost { @Id
    @Column(name="cost_id")  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int costId;
@Column(name="cost_per_day")
private BigDecimal cosPerDay;


@Column(name="deposit")
private BigDecimal deposit;

@OneToMany(mappedBy ="cost" )
@JsonIgnore
    private List<vehicle>vehicles;











}