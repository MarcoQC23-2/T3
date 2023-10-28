/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase;

/**
 *
 * @author mco_a
 */
public class Ropa extends Producto {
    private String talla;
    private String tipodeprenda;

    public Ropa(String nombre, float precio, String talla, String tipodeprenda) {
        super(nombre, precio);
        this.talla = talla;
        this.tipodeprenda = tipodeprenda;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getTipodeprenda() {
        return tipodeprenda;
    }

    public void setTipodeprenda(String tipodeprenda) {
        this.tipodeprenda = tipodeprenda;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public float obtenerPrecio() {
        return precio;
    }
}
