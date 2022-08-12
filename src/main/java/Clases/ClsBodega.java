/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.LinkedList;

/**
 *
 * @author PC
 */
public class ClsBodega {

// Encapsulamiento
    private String codigo;
    private String ciudad;
    private String nombre;
    private double capacidad;

    private LinkedList<ClsTapaBoca> listaTapabocas = new LinkedList<ClsTapaBoca>();
    private ClsResponsable responsable;
    
    
     public ClsBodega(String codigo, String ciudad, String nombre, double capacidad, ClsResponsable responsable) {
        this.codigo = codigo;
        this.ciudad = ciudad;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.responsable = responsable;
    }


    public void registrarEntrada(ClsTapaBoca tapaboca) {
        this.listaTapabocas.add(tapaboca);
    }

    public void registrarSalida(String codigoTapaboca) {

        for (ClsTapaBoca tapaboca : this.listaTapabocas) {

            if (tapaboca.getCodigo().equals(codigoTapaboca)) {
                //getcodigo para acceder al elmento por que es privado
                this.listaTapabocas.remove(tapaboca);
                break;
            }
        }
    }

    public String mostrarInventario() {
        String inventario = "";
        for (ClsTapaBoca tapaboca : this.listaTapabocas) {
            inventario += "Código:" + tapaboca.getCodigo() + ", Color: "+ tapaboca.getColor() + "\n";
        }
        
        return inventario;
    }

   
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public void modificarDatosPrincipales(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;

    }

    public ClsResponsable getResponsable() {
        return responsable;
    }

    public void setResponsable(ClsResponsable responsable) {
        this.responsable = responsable;
    }
        
}
