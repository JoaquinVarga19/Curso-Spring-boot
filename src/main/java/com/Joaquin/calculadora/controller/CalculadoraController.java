package com.Joaquin.calculadora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Joaquin.calculadora.service.CalculadoraService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.Joaquin.calculadora.model.OperationRequest;  
import org.springframework.http.ResponseEntity;


@Controller
@RestController
@RequestMapping("/calculator")
public class CalculadoraController {

    @Autowired
    private CalculadoraService calculadoraService;

    @PostMapping("calculate")
    public ResponseEntity<Double> calculate(@RequestBody OperationRequest request) {

        double result = calculadoraService.calculate(request.getN1(), request.getN2(), request.getOperation());
        return ResponseEntity.ok(result);
    }
}
