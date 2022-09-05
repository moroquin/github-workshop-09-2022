package com.telus.dsu.introgit.calculator.presenter;

import java.util.LinkedList;
import java.util.List;

import com.telus.dsu.introgit.calculator.controller.OperationController;
import com.telus.dsu.introgit.calculator.controller.OperationsFactory;
import com.telus.dsu.introgit.util.Console;
import com.telus.dsu.introgit.util.Limit;

public class OperationPresenter {

    public void doMenu() {

        int menuOption = 0;
        Limit menuLimit = new Limit(0, 1);

        do {
            Console.printTitle("Bienvenido a calculadora");
            Console.printSubTitle("seleccione la operacion");
            Console.printText("1) Sum");
            Console.printText("0) Salir");

            menuOption = Console.getInt("seleccione la opcion que desea utilizar", menuLimit);

            if (menuOption!=0){
                switch (menuOption) {
                    case 1:
                        executeOperation(OperationsFactory.getOperationController(OperationsFactory.SUM));
                        break;
                
                    default:
                        Console.printSubTitle("Opcion no encontrada");
                        break;
                }
            }

        } while (menuOption != 0);
    }

    private void executeOperation(OperationController operationController){
        List<Integer> data = obtainData(operationController);
        operationController.setData(data);
        operationController.execute();
        presentResult(operationController);
    }

    private void presentResult(OperationController operationController) {
        Console.printTitle("Resultado de la operacion     "+ operationController.getResult());
        Console.printText("Presione enter para continuar");
        Console.waitForEnter();
    }

    private List<Integer> obtainData(OperationController operationController){
        List<Integer> data = new LinkedList<>();
        Limit limit = new Limit(0, 100);
        for (String dataDesc : operationController.getDataDescriptionList()) {
            data.add(Console.getInt(dataDesc, limit));
        }

        return data;
    }

}
