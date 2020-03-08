package com.example.demo.promise;

import com.example.demo.gun.Gun;
import com.sun.istack.Nullable;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity (name = "tb_promise")
@Data
@IdClass(TimePK.class)
public class Promise implements Serializable {
    @Id
    @Column(unique = true)
 //   @GeneratedValue(strategy = GenerationType.AUTO)
    @JoinColumn
    private String ID_PROMISE;

    private String DATE_PROMISE_RELEASE;
    @Id
    private String ID_PERMIT;
    @Id
    private String PESEL;
    private String PROMISE_STATUS;

    @OneToOne
    @Nullable
    private Gun gun;

}
