package com.olegel.testmvp;

import com.olegel.testmvp.interfaces.IModel;



public class Model implements IModel {
    @Override
    public String firstName() {
        return "Hello";
    }

    @Override
    public String lastName() {
        return "Word";
    }
}
