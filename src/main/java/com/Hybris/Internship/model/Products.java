package com.Hybris.Internship.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
@RequiredArgsConstructor

@ToString
@Getter
@Setter
@Entity
@Table(name = "products")
public class Products implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private Double price;
    @Column(name = "status")
    private String status;
    @Column(name = "create_at")
    private String createAt;




}

