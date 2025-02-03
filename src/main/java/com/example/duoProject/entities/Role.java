package com.example.duoProject.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String role_name;
}
