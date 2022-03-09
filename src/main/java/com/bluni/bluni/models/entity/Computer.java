package com.bluni.bluni.models.entity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@ToString
public class Computer implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Getter @Setter @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column @Getter @Setter
    private String procesador;

    @Column @Getter @Setter
    private String color;

    @Column @Getter @Setter
    private String ram;

    @Column @Getter @Setter
    private String board;

    @Column @Getter @Setter
    private String disco_duro;

    @Column @Getter @Setter
    private String grafica;

    @Column @Getter @Setter
    private String marca;

    @Column @Getter @Setter
    private String ubicacion;

    @Column @Getter @Setter
    private String mac;

    @Column @Getter @Setter
    private String modelo;

    @Column @Getter @Setter
    private String tipo;
}
