package com.Joaquin.calculadora.service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {
    
    public double calculate(double n1, double n2, String operation) {
        
        switch (operation) {
            case "sumar":
                return n1 + n2;
            }
            
        switch (operation) {
            case "restar":
                return n1 - n2;
            }
            
        switch (operation) {
            case "multiplicar":
                return n1 * n2;
            }

        switch (operation) {
            case "division":
                if (n1 == 0 || n2 == 0) {
                    throw new IllegalArgumentException("No se puede dividir entre cero");  
                }
                return n1 / n2;
            default: 
            throw new IllegalArgumentException("No se reconoce la operacion"+ operation);
        }
    }
}
