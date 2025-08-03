/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectojava;

/**
 *
 * @author Dell
 */
public class Facturacion {
    import javax.swing.*;

public class Facturacion {

    public static float iva = 0.13f;
    public static int semanaCompleta = 50000;
    public static int dosNoches = 70000;
    public static int vip = 10000;
    public static int recreativas = 120000;
    public static int senderismo = 25000;
    public static int camping = 10000;

    public void mostrarTodasLasFacturas(Registro rg) {
        for (int i = 0; i < rg.getCantidad(); i++) {
            float subtotal = Productos.sumaProductos[i];
            float total = subtotal * (1 + iva);
            String factura = "Factura del cliente #" + (i + 1) + "\n" +
                    "Estimado " + rg.getNombres()[i] + "\n" +
                    "Subtotal: " + subtotal + "\n" +
                    "IVA (13%): " + String.format("%.2f", subtotal * iva) + "\n" +
                    "Total a pagar: " + String.format("%.2f", total) + "\n" +
                    "Correo: " + rg.getCorreos()[i] + "\n" +
                    "Celular: " + rg.getCelulares()[i];
            JOptionPane.showMessageDialog(null, factura);
        }
    }
}
    
}
