package com.example.demo.cardOwner;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;

@Entity(name = "tb_card_owner")
@IdClass(TimePK.class)
@Data
public class CardOwner implements Serializable {
    @Id
    private String ID_CARD;
    @Id
    private String PESEL;
}
