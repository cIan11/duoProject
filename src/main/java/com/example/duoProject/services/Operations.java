package com.example.duoProject.services;

import org.springframework.stereotype.Service;

@Service
public class Operations {
    public double plus(double number1, double number2){
        return number1 + number2;
    }
    public double divide(double number1, double number2){
        if (number2 == 0){
            throw new IllegalArgumentException("Делитель не может быть равен 0");
        }
        return number1/number2;
    }
    //реализуй вычитание и умножение по такой же логике
    //exception у тебя не будет, всё как мое сложение
}
