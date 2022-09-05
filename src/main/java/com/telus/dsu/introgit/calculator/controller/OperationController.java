package com.telus.dsu.introgit.calculator.controller;

import java.util.List;

public abstract class OperationController {

    private List<String> dataDescription;
    protected List<Integer> data;
    protected int result;



    public OperationController() {
        dataDescription = initDataDescrition();
    }

    protected abstract List<String> initDataDescrition();

    public List<String> getDataDescriptionList(){
        return dataDescription;
    }

    public void setData(List<Integer> data) {
        this.data = data;
    }

    public abstract void execute();

    public int getResult() {
        return result;
    }
    
}
