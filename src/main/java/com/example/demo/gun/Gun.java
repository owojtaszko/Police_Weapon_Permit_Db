package com.example.demo.gun;

import com.example.demo.cardOwner.TimePK;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity(name = "tb_gun")
@IdClass(TimePK.class)
@Data
public class Gun implements Serializable {

    @Id
    @NotNull
    @Column(length = 12)
    private String ID_PROMISE;
    @NotNull
    @Column(length = 45)
    private String KIND_GUN;
    @NotNull
    @Column(length = 45)
    private String BRAND;
    @NotNull
    @Column(length = 45)
    private String MODEL;
    @NotNull
    @Column(length = 45)
    private String CALIBER;
    @Id
    @NotNull
    @Column(unique = true)
    private String ID_SERIA;
    @DateTimeFormat(pattern = "yyyy")
    private String YEAR_PROD;
    @NotNull
    @Column(length = 45)
    private String DATE_GUN_REGISTRATION;
    @Id
    @NotNull
    @Column(length = 45)
    private String ID_CARD;
    @NotNull
    @Column(unique = true, length = 12)
    private String LAST_PROMISE;
    @NotNull
    @Column(length = 45)
    private String GUN_STATUS;
    @Id
    @NotNull
    @Column(length = 11)
    private String PESEL;

//    @OneToOne // Jedna broń może być na tylko jedną promesę??
//    private Promise promise;
//
//    @ManyToOne // Wiele sztuk broni może być wpisane do jednej legitymacji
//    private CardOwner cardOwner;


}
