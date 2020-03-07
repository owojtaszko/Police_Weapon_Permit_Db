package com.example.demo.promise;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;

@Entity (name = "tb_promise")
@Data
@IdClass(TimePK.class)
public class Promise implements Serializable {
    @Id
    private String ID_PROMISE;
    private String DATE_PROMISE_RELEASE;
    @Id
    private String ID_PERMIT;
    @Id
    private String PESEL;
    private String PROMISE_STATUS;

}
