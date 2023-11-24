package com.tobeto.a_springintro.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Table(name="addresses")
@Entity
@Data
public class address {
@Id
@Column(name ="address_id")
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int addressId;

@Column(name="street_name")
    private String streetName;

@Column(name="city")
    private String city;

@Column(name = "country")
    private String country;

@Column(name="zipcode")
private int zipCode;






@JsonIgnore
@OneToMany(mappedBy = "address")
private List< customer> customers;
 @JsonIgnore
    @OneToMany(mappedBy = "address")
    private List< staff> staffs;



}
