package org.example.Ayudas;

import java.time.LocalDate;

public class Licor {

    private String nombre;
    private String tipo;
    private String marca;
    private LocalDate fechacaducidad;
    private Double porcentajeAlcohol;

    public Licor() {
    }

    public Licor(String nombre, String tipo, String marca, LocalDate fechacaducidad, Double porcentajeAlcohol) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.marca = marca;
        this.fechacaducidad = fechacaducidad;
        this.porcentajeAlcohol = porcentajeAlcohol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public LocalDate getFechacaducidad() {
        return fechacaducidad;
    }

    public void setFechacaducidad(LocalDate fechacaducidad) {
        this.fechacaducidad = fechacaducidad;
    }

    public Double getPorcentajeAlcohol() {
        return porcentajeAlcohol;
    }

    public void setPorcentajeAlcohol(Double porcentajeAlcohol) {
        this.porcentajeAlcohol = porcentajeAlcohol;
    }
}
