package com.telus.dsu.introgit.calculator.controller;

import java.util.LinkedList;
import java.util.List;

public class SumController extends OperationController {

    @Override
    public void execute() {
        result = 0;
        for (int num : data) {
            result+=num;
        }
        
    }

    @Override
    protected List<String> initDataDescrition() {
        List<String> dataDescription = new LinkedList<>();
        dataDescription.add("Ingrese el primer numero a sumar: ");
        dataDescription.add("Ingrese el segundo numero a sumar: ");

        return dataDescription;
    }
    
}
