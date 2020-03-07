package com.example.demo.owner;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity(name = "tb_owner")
@Data
public class Owner implements Serializable {
@Id
    private String PESEL;
    private String NAME;
    private String SURNAME;
    private String STREET;
    private String HOUSE_NUMBER;
    private String FLAT_NUMBER;
    private String CITY;
    private String REGION;
    private String BIRTH_DATE;
    private String BIRTH_CITY;

}
