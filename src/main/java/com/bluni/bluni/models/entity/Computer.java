package com.bluni.bluni.models.entity;
import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Computer implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column
    private String procesador;

    @Column
    private String color;

    @Column
    private String ram;

    @Column
    private String board;

    @Column
    private String disco_duro;

    @Column
    private String grafica;

    @Column
    private String marca;

    @Column
    private String ubicacion;

    @Column
    private String mac;

    @Column
    private String modelo;

    @Column
    private String tipo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public String getDisco_duro() {
        return disco_duro;
    }

    public void setDisco_duro(String disco_duro) {
        this.disco_duro = disco_duro;
    }

    public String getGrafica() {
        return grafica;
    }

    public void setGrafica(String grafica) {
        this.grafica = grafica;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "ComputerController{" +
                "id=" + id +
                ", procesador='" + procesador + '\'' +
                ", color='" + color + '\'' +
                ", ram='" + ram + '\'' +
                ", board='" + board + '\'' +
                ", disco_duro='" + disco_duro + '\'' +
                ", grafica='" + grafica + '\'' +
                ", marca='" + marca + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", mac='" + mac + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
