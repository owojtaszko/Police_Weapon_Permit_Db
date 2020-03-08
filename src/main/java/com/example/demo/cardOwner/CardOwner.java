package com.example.demo.cardOwner;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "tb_card_owner")
@IdClass(TimePK.class)
@Data
public class CardOwner implements Serializable {
    @Id
    @Column(unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String ID_CARD;

    @Id
    private String PESEL;
}