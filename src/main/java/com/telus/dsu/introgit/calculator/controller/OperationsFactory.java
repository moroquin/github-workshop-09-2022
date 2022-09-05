package com.telus.dsu.introgit.calculator.controller;

public enum OperationsFactory {
    SUM;

    public static OperationController getOperationController(OperationsFactory operation) {
        switch (operation) {
            case SUM:
                return new SumController();
            default:
                return null;
        }
    }
}
