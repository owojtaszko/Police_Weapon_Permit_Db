package com.example.demo.owner;

import com.example.demo.cardOwner.CardOwner;
import com.example.demo.permit.Permit;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "tb_owner")
@Table
@Data
public class Owner implements Serializable {
    @Id
    @Column(unique = true, nullable = false)
    private String PESEL;
    @Column(nullable = false)
    private String NAME;
    @Column(nullable = false)
    private String SURNAME;
    @Column(nullable = false)
    private String STREET;
    @Column(nullable = false)
    private String HOUSE_NUMBER;
    @Column(nullable = true)
    private String FLAT_NUMBER;
    @Column(nullable = false)
    private String CITY;
    @Column(nullable = false)
    private String REGION;
    @Column(nullable = false)
    private String BIRTH_DATE;
    @Column(nullable = false)
    private String BIRTH_CITY;

//    @ManyToMany(cascade = CascadeType.ALL) //Wielu posiadaczy może mieć wiele pozwoleń
//    @JoinTable(
//            name = "OWNER_PERMIT",
//            joinColumns = @JoinColumn(name = "PESEL"),
//            inverseJoinColumns = @JoinColumn(name = "KIND_PERMIT")
//    )
//    @Transient
//    private Set<Permit> permits;


}
