

import java.util.List; 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arang
 */
class Producto {
    String codigoProducto;
    String nombre;
    String categoria;
    double precio;
    int cantidadStock;
    String fechaUltimaReposicion;

public Producto(String codigoProducto, String nombre, String categoria, double precio, int cantidadStock, String fechaUltimaReposicion) {
        this.codigoProducto = codigoProducto;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
        this.fechaUltimaReposicion = fechaUltimaReposicion;
    }
};


public class leerProductos {
    
    /**
     *
     * @param nombreArchivo
     * @return
     */
    public static List<Producto> leerArchivoProductos() {
        
        List<Producto> productos;
        productos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("/Files/Productos/"))) {
            String linea;
            br.readLine(); // Omitir la primera línea de encabezados
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split("\\|");
                Producto producto = new Producto(
                    campos[0],
                    campos[1],
                    campos[2],
                    Double.parseDouble(campos[3]),
                    Integer.parseInt(campos[4]),
                    campos[5]
                );
                productos.add(producto);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return productos;
    }
    
}
