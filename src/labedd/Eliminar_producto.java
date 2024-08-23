/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labedd;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Janus
 */
public class Eliminar_producto {
    
    public static void eliminar_producto(String cod_eliminar){
        try{
            File Productos = new File ("Productos.txt");
            BufferedReader pr = new BufferedReader(new FileReader(Productos));
            File fichero = new File("Productos2.txt");
            FileWriter outFile = new FileWriter(fichero,false);
            PrintWriter Productos2 = new PrintWriter(outFile);
            String line=null;
            Boolean hay=false;
            while ((line=pr.readLine()) != null){
                String temp[]=line.split("\t");
                if (temp[0].equalsIgnoreCase(cod_eliminar)){
                    hay=true;
                }else{
                    Productos2.println(line);
                }
            }
            pr.close();
            Productos2.close();
            if(hay==false){
                System.out.println("El producto no existe.");
                fichero.delete();
            }else{
                System.out.println("El producto ha sido eliminado.");
                Productos.delete();
                File rn = new File ("Productos.txt");
                boolean renombrar = fichero.renameTo(rn);
            }
        }catch (IOException ex) {
            System.out.println("Error eliminando el producto.");
            ex.printStackTrace();
        }
    }
    
    
   
}
