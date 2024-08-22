package com.neoteric.fullstackdemo.function;

public class Car {
    private String brandName;
    private String modelName;

    public Car(String brandName,String modelName){
        this.brandName=brandName;
        this.modelName=modelName;


    }

    public String getBrandName() {
        return this.brandName;
    }

    public String getModelName() {
        return this.modelName;
    }
}
