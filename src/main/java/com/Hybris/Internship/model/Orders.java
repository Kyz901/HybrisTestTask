package com.Hybris.Internship.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
@RequiredArgsConstructor

@ToString
@Getter
@Setter
@Entity
@Table(name = "orders")
public class Orders implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "status")
    private String status;
    @Column(name = "created_at")
    private String createdAt;
}
