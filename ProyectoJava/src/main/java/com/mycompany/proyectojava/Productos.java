/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectojava;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class Productos {
    
    public static int[] sumaProductos;

    public Productos(int cantidad) {
        sumaProductos = new int[cantidad];
    }

    public void escogerDia(int cliente) {
        String mensaje = "Paquetes disponibles:\n" +
                "1. Semana completa (50000)\n" +
                "2. 3 dias y 2 noches (70000)\n" +
                "3. VIP (10000)\n" +
                "4. Todo incluido + recreativas (120000)";
        JOptionPane.showMessageDialog(null, mensaje);

        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del paquete deseado"));

        switch (opcion) {
            case 1: sumaProductos[cliente] += Facturacion.semanaCompleta; break;
            case 2: sumaProductos[cliente] += Facturacion.dosNoches; break;
            case 3: sumaProductos[cliente] += Facturacion.vip; break;
            case 4: sumaProductos[cliente] += Facturacion.recreativas; break;
            default: JOptionPane.showMessageDialog(null, "Seleccion incorrecta.");
        }
    }

    public void paquetesAdicionales(int cliente) {
        String mensaje = "Paquetes adicionales:\n1. Camping (10000)\n2. Senderismo (25000)";
        JOptionPane.showMessageDialog(null, mensaje);

        int seleccion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion deseada"));

        if (seleccion == 1) {
            sumaProductos[cliente] += Facturacion.camping;
            JOptionPane.showMessageDialog(null, "Camping agregado.");
        } else if (seleccion == 2) {
            sumaProductos[cliente] += Facturacion.senderismo;
            JOptionPane.showMessageDialog(null, "Senderismo agregado.");
        } else {
            JOptionPane.showMessageDialog(null, "No se agregaron adicionales.");
        }
    }
    
}
