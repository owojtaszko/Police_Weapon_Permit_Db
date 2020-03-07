package com.example.demo.cardOwner;


import java.io.Serializable;

public class TimePK implements Serializable {
    protected String ID_CARD;
    protected String PESEL;

    public TimePK() {}

    public TimePK(String ID_CARD, String PESEL) {
        this.ID_CARD = ID_CARD;
        this.PESEL = PESEL;
    }

}