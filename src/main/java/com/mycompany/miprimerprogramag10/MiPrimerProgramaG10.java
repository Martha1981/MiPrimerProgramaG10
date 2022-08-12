/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.miprimerprogramag10;

/**
 *
 * @author PC
 */

import Clases.*;
//importa todo lo que hay en el paquete clases
import javax.swing.JOptionPane;

/**
 *
 * @author David Pérez arias
 */
public class MiPrimerProgramaG10 {

    public static void main(String[] args) {

        /*
        ClsBodega bodega = new ClsBodega();
        ClsBodega bodega2 = new ClsBodega("BOD01", "Barranquilla");
        
        ClsBodega bodega3 = new ClsBodega("BOD02", "Medellín", "Bodega la 51", 23.45);
        System.out.println("La capacidad de la bodega 1 es: " + bodega.capacidad);
        System.out.println("La capacidad de la bodega 2 es: " + bodega2.capacidad);
        
        System.out.println("La capacidad de la bodega 3 es: " + bodega3.capacidad);
        
        
        ClsTapaBoca tapaboca = new ClsTapaBoca("TAPA01", "rojo", 5000);
        
        System.out.println("El precio del tapabocas es:" + tapaboca.precio);
        
        
        ClsResponsable responsable = new ClsResponsable();
        responsable.nombre = "Julio";
        responsable.telefono = "5774883";
        
        
        ClsResponsable responsable = new ClsResponsable("30000", "David",
                "Operario", "320", "davidmintic@");
        ClsBodega bodega = new ClsBodega("BOD01", "Manizales", "La 51", 1000, responsable);
        
        
        ClsTesorero tesorero = new ClsTesorero("xxx");
        tesorero.obtenerValorCuenta();
        
       
        ClsTapaBoca tapaboca = new ClsTapaBoca("T1", "Rojo", 5000);
        bodega.registrarEntrada(tapaboca);
        ClsTapaBoca tapaboca2 = new ClsTapaBoca("T2", "verde", 3000);
        bodega.registrarEntrada(tapaboca2);
        ClsTapaBoca tapaboca3 = new ClsTapaBoca("T3", "Azul", 7000);
        bodega.registrarEntrada(tapaboca3);
        System.out.println(bodega.mostrarInventario());
        */
        
        
        ClsValidador validador = new ClsValidador();
        
        String entradaUsuario = JOptionPane.showInputDialog(null, "Ingrese número", "Título para andres", 3);
        
        if(validador.esNumero(entradaUsuario)) {
            int numero = Integer.parseInt(entradaUsuario);
        
        } else {
            JOptionPane.showMessageDialog(null, "El dato que ingresaste no es númerico");
        }
        

    }
}
