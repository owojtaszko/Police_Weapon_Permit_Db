package com.example.demo.permit;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;

@Entity(name = "tb_gun_permit")
@IdClass(TimePK.class)
@Data
public class Permit implements Serializable {
    @Id
    private String ID_PERMIT;
    private String DATE_PERMIT_RELEASE;
    private String ISSUING_AUTHORITY;
    private String KIND_PERMIT;
    @Id
    private String PESEL;


}
