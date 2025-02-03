package com.example.duoProject.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String password;
    private String username;
    private String firstname;
    private String surname;
    private String years;
}
