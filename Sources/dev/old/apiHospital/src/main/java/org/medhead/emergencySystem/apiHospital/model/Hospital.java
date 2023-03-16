package org.medhead.emergencySystem.apiHospital.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "hospitals")
public class Hospital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="longitude")
    private String longitude;

    @Column(name="latitude")
    private String latitude;

    @Column(name="bedsQuantity")
    private String bedsQuantity;

    @Column(name="bedsAvailable")
    private String bedsAvailable;

    @Column(name="speciality")
    private String speciality;

}
