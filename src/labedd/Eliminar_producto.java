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
import java.util.Scanner;

/**
 *
 * @author Janus
 */
public class Eliminar_producto {
    
    public static void eliminar_producto(String cod_eliminar){
        try{
            File Productos = new File ("src/Files/Productos.txt");
            BufferedReader pr = new BufferedReader(new FileReader(Productos));
            File fichero = new File("src/Files/Productos2.txt");
            FileWriter outFile = new FileWriter(fichero,false);
            PrintWriter Productos2 = new PrintWriter(outFile);
            
            File Proveedores = new File ("src/Files/Proveedores.txt");
            BufferedReader pv = new BufferedReader(new FileReader(Proveedores));
            File fichero2 = new File("src/Files/Proveedores2.txt");
            FileWriter outFile2 = new FileWriter(fichero2,false);
            PrintWriter Proveedores2 = new PrintWriter(outFile2);
            
            String line=null;
            String line2=null;
            
            Boolean hay=false;
            while ((line=pr.readLine()) != null){
                String temp[]=line.split("\t");
                if (temp[0].equalsIgnoreCase(cod_eliminar)){
                    hay=true;
                }else{
                    Productos2.println(line);
                }
            }
            while ((line2=pv.readLine()) != null){
                String temp2[]=line2.split("\t");
                if (temp2[2].equalsIgnoreCase(cod_eliminar)){
                    hay=true;
                }else{
                    Proveedores2.println(line2);
                }
            }
            pr.close();
            Productos2.close();
            pv.close();
            Proveedores2.close();
            
            if(hay==false){
                System.out.println("El producto no existe.");
                fichero.delete();
                fichero2.delete();
                
            }else{
                System.out.println("El producto ha sido eliminado.");
                Productos.delete();
                Proveedores.delete();
                
                File rn = new File ("src/Files/Productos.txt");
                boolean renombrar = fichero.renameTo(rn);
                
                File rn2 = new File ("src/Files/Proveedores.txt");
                boolean renombrar2 = fichero2.renameTo(rn2);
            }
        }catch (IOException ex) {
            System.out.println("Error eliminando el producto.");
            ex.printStackTrace();
        }
    }
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el codigo del producto que desea eliminar: ");
    String cod_eliminar= sc.nextLine();
    eliminar_producto(cod_eliminar);
    sc.close();
    }    
   
}
