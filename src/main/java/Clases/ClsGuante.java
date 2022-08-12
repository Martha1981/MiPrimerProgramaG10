/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author PC
 */
public class ClsGuante extends ClsProducto {
    
    private double descuento;

    public ClsGuante(double descuento, String codigo, String material, String vencimiento, String color, String estado, int precio, double iva) {
        super(codigo, material, vencimiento, color, estado, precio, iva);
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    
    
}


