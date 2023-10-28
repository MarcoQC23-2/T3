/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase;

import Interface.ActualizarPrecio;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mco_a
 */
public class Inventario {
    private List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void actualizarPrecioMasivo(float nuevoPrecio) {
        for (Producto producto : productos) {
            if (producto instanceof ActualizarPrecio) {
                ((ActualizarPrecio) producto).actualizarPrecio(nuevoPrecio);
            }
        }
    }
}
