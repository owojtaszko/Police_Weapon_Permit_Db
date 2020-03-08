package com.example.demo.gun;

import com.example.demo.cardOwner.CardOwner;
import com.example.demo.cardOwner.TimePK;
import com.example.demo.promise.Promise;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "tb_gun")
@IdClass(TimePK.class)
@Data
public class Gun implements Serializable {

    @Id
    private String ID_PROMISE;
    private String KIND_GUN;
    private String BRAND;
    private String MODEL;
    private String CALIBER;
    @Id
    @Column(unique = true)
    private String ID_SERIA;
    private String YEAR_PROD;
    private String DATE_GUN_REGISTRATION;
    @Id
    private String ID_CARD;
    private String LAST_PROMISE;
    private String GUN_STATUS;
    @Id
    @JoinColumn
    private String PESEL;

    @OneToOne // Jedna broń może być na tylko jedną promesę??
    private Promise promise;

    @ManyToOne // Wiele sztuk broni może być wpisane do jednej legitymacji
    private CardOwner cardOwner;


}
