package com.example.demo.gun;

import java.io.Serializable;

public class TimePK implements Serializable {

    protected String ID_PROMISE;
    protected String ID_SERIA;
    protected String ID_CARD;
    protected String PESEL;


    public TimePK() {}

    public TimePK(String ID_PROMISE, String ID_SERIA, String ID_CARD, String PESEL) {
        this.ID_PROMISE = ID_PROMISE;
        this.ID_SERIA = ID_SERIA;
        this.ID_CARD = ID_CARD;
        this.PESEL = PESEL;
    }

}
