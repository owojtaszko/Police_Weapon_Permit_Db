package com.example.demo.gun;

import com.example.demo.cardOwner.TimePK;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
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
    private String ID_SERIA;
    private String YEAR_PROD;
    private String DATE_GUN_REGISTRATION;
    @Id
    private String ID_CARD;
    private String LAST_PROMISE;
    private String GUN_STATUS;
    @Id
    private String PESEL;
}
