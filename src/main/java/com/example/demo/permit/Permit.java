package com.example.demo.permit;

import com.example.demo.owner.Owner;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "tb_gun_permit")
@IdClass(TimePK.class)
@Data
public class Permit implements Serializable {
    @Id
    @Column(unique = true)
 //   @GeneratedValue(strategy = GenerationType.AUTO)
    private String ID_PERMIT;

    private String DATE_PERMIT_RELEASE;
    private String ISSUING_AUTHORITY;
    private String KIND_PERMIT;
    @Id
    private String PESEL;

    @OneToOne
    @JoinColumn(name = "PESEL", insertable = false, updatable = false)
    private Owner owner;
}