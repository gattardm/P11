package org.medhead.emergencysystem.apiHospital.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="hospitals")
public class Hospital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "longitude")
    private String longitude;

    @Column(name = "latitude")
    private String latitude;

    @Column(name = "beds_quantity")
    private String beds_quantity;

    @Column(name = "beds_available")
    private String beds_available;

    @Column(name = "speciality")
    private String speciality;

}
