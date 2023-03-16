package org.medhead.emergencySystem.apiHospital.model;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "hospitals")
public class Hospital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "longitude")
    private Long longitude;

    @Column(name = "latitude")
    private Long latitude;

    @Column(name = "bedsQuantity")
    private Long bedsQuantity;

    @Column(name= "bedsAvailable")
    private Long bedsAvailable;

    @Column(name = "speciality")
    private String speciality;

}
