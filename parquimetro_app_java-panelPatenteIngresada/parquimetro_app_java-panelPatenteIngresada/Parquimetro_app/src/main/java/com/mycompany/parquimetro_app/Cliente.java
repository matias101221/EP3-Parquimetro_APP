package com.mycompany.parquimetro_app;

import java.util.Date;

public class Cliente {
    private String patente;
    private String nombre;
    private String rut;
    private String horaEntrada;
    private double cobroAcumulado;  // Nuevo campo para almacenar el cobro acumulado

    public Cliente(String patente, String nombre, String rut, String horaEntrada) {
        this.patente = patente;
        this.nombre = nombre;
        this.rut = rut;
        this.horaEntrada = horaEntrada;
        this.cobroAcumulado = 0.0;  // Inicializar el cobro acumulado en 0.0 al inicio
        
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public double getCobroAcumulado() {
        return cobroAcumulado;
    }

    public void setCobroAcumulado(double cobroAcumulado) {
        this.cobroAcumulado = cobroAcumulado;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    
 
}