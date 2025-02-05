package com.example.duoProject.entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
public class Calculator {
    private double number1;
    private double number2;
    private String operation;
    private double result;
}
