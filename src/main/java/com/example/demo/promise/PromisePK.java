package com.example.demo.promise;

import java.io.Serializable;

public class PromisePK implements Serializable {

    protected String ID_PERMIT;
    protected String ID_PROMISE;
    protected String PESEL;


    public PromisePK() {}

    public PromisePK(String ID_PERMIT, String ID_PROMISE, String PESEL) {

        this.ID_PERMIT = ID_PERMIT;
        this.ID_PROMISE = ID_PROMISE;
        this.PESEL = PESEL;
    }

}