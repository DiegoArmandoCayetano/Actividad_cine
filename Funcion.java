/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases_cine;

/**
 *
 * @author Armando Bautista
 */
public class Funcion {
    
    private int hora_inicio;
    private String nombre;
    protected int sala;
    protected int silla_disponible;
    private double precio;

    public Funcion(int hora_inicio, String nombre, int sala, int silla_disponible, double precio) {
        this.hora_inicio = hora_inicio;
        this.nombre = nombre;
        this.sala = sala;
        this.silla_disponible = silla_disponible;
        this.precio = precio;
    }

    public int getHora_inicio() {
        return hora_inicio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSala() {
        return sala;
    }

    public int getSilla_disponible() {
        return silla_disponible;
    }

    public double getPrecio() {
        return precio;
    }

    public void setHora_inicio(int hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public void setSilla_disponible(int silla_disponible) {
        this.silla_disponible = silla_disponible;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
