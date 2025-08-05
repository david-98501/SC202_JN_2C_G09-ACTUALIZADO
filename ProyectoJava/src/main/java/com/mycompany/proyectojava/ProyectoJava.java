/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectojava;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class ProyectoJava {

    public static void main(String[] args) {
        System.out.println("Hello World!");
                int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuantos clientes desea registrar"));

        Registro rg = new Registro(cantidad);
        Productos pd = new Productos(cantidad);
        Facturacion ft = new Facturacion();
        Reservas rs = new Reservas();

        rg.registrarClientes();

        for (int i = 0; i < rg.getCantidad(); i++) {
            boolean activo = true;
            while (activo) {
                String opciones = "Cliente #" + (i + 1) + "\n" +
                        "1. Comprar paquetes\n" +
                        "2. Reservar habitacion\n" +
                        "3. Mostrar facturas\n" +
                        "4. Paquetes adicionales\n" +
                        "Cualquier otro numero para salir";

                int eleccion = Integer.parseInt(JOptionPane.showInputDialog(opciones));

                switch (eleccion) {
                    case 1: pd.escogerDia(i); break;
                    case 2: rs.reservarHabitacion(); break;
                    case 3: ft.mostrarTodasLasFacturas(rg); break;
                    case 4: pd.paquetesAdicionales(i); break;
                    default: activo = false;
                }
            }
        }

        rg.mostrarClientes();
    }
    }

