/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author PC
 */
public class ClsTapaBoca extends ClsProducto{
    
    
    private String certificado;
    

    public ClsTapaBoca(String certificado, String codigo, String material, String vencimiento, String color, String estado, int precio, double iva) {
        super(codigo, material, vencimiento, color, estado, precio, iva);
        //super hace referencia al constructor del padre
        this.certificado = certificado;
    }
    
    
    public String getCertificado() {
        return certificado;
    }

    public void setCertificado(String certificado) {
        this.certificado = certificado;
    }

    
    
    
}
