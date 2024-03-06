/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases_cine;

/**
 *
 * @author Armando Bautista
 */
public class Sala {
    
    private int numero;
    private int capacidad;
    private String tipo;
    private String equipamiento;

    public Sala(int numero, int capacidad, String tipo, String equipamiento) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.tipo = tipo;
        this.equipamiento = equipamiento;
    }

    public int getNumero() {
        return numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public String getEquipamiento() {
        return equipamiento;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEquipamiento(String equipamiento) {
        this.equipamiento = equipamiento;
    }
    
    
}
