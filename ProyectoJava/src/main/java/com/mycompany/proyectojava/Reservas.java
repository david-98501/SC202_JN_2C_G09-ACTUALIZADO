/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectojavaactualizacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class Reservas {
    
    private boolean[] habitaciones;

    public Reservas() {
        habitaciones = new boolean[7];
        for (int i = 0; i < 5; i++) habitaciones[i] = true;
        habitaciones[5] = false;
        habitaciones[6] = false;
    }

    public void reservarHabitacion() {
        JOptionPane.showMessageDialog(null, "Bienvenido a reservacion de habitaciones\nIngrese un numero del 1 al 7");

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Numero de habitacion"));

        if (numero >= 1 && numero <= 7) {
            int posicion = numero - 1;
            if (habitaciones[posicion]) {
                habitaciones[posicion] = false;
                JOptionPane.showMessageDialog(null, "Habitacion " + numero + " reservada con exito.");
            } else {
                JOptionPane.showMessageDialog(null, "La habitacion esta ocupada.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Numero invalido.");
        }
    }
    
    
}
