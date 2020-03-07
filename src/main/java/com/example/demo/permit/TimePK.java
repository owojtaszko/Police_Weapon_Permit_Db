package com.example.demo.permit;


import java.io.Serializable;

public class TimePK implements Serializable {

    protected String ID_PERMIT;
    protected String PESEL;


    public TimePK() {}

    public TimePK(String ID_PERMIT, String PESEL) {
        this.ID_PERMIT = ID_PERMIT;
        this.PESEL = PESEL;
    }

}

