package com.example.demo.owner;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity(name = "tb_owner")
@Table
@Data
public class Owner implements Serializable {
@Id
@Column(unique = true)
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
