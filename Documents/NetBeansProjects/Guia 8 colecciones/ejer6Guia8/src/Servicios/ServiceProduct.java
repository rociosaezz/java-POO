  /**Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.*/
package Servicios;

import Entidades.Product;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ServiceProduct {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Product agregarProducto(){
        Product nuevoProducto = new Product();
        System.out.println("Ingrese el nombre del producto: ");
        nuevoProducto.setProducto(leer.next());
        System.out.println("Ingrese el precio del producto: ");
        nuevoProducto.setPrecio(leer.nextDouble());
    return  nuevoProducto;
            }
    
    
    
    public void  listaProductos (HashMap <String, Double> listaProductos){
        String option ="s";
        do {
            Product nuevo = agregarProducto();
                do {
                System.out.println("¿Desea agregar otro producto? s/n");
                option = leer.next();

            } while (!(option.equalsIgnoreCase("s") || (option.equalsIgnoreCase("n"))));
                
            listaProductos.put(nuevo.getProducto(), nuevo.getPrecio());
        } while(option.equalsIgnoreCase("s"));  
    }
    public void mostrarProductos(HashMap <String, Double> listaProductos){
        for (Map.Entry<String, Double> entry : listaProductos.entrySet()) {
            System.out.println("Producto = "+ entry.getKey()+ " \t Precio = "+  entry.getValue());
            
        }
    }
    
    //modificar su precio
    public void modificarPrecio(HashMap <String, Double> listaProductos){        
         String option ="s", produc;
         Double nuevoPrecio;
         do {
             do {
                System.out.println("¿Desea modificar algún precio? s/n");
                option = leer.next();
            } while (!(option.equalsIgnoreCase("s") || (option.equalsIgnoreCase("n"))));
              if ("n".equals(option)) {
                 mostrarProductos(listaProductos);
                 break;
             }
             System.out.println("Ingrese el nombre del producto para modificar el precio");
             produc = leer.next();
            
             if (listaProductos.containsKey(produc)) {
                 System.out.println("¿Qué precio desea colocarle?");
                 nuevoPrecio = leer.nextDouble();
            listaProductos.put(produc, nuevoPrecio);
            } else {
            System.out.println("El producto no se encuentra en Stock");
        }
        } while(option.equalsIgnoreCase("s"));  
        

    }
    //eliminar un producto 
    public void eliminarProducto(HashMap <String, Double> listaProductos){
     String option ="s", produc;
         do {
             do {
                System.out.println("¿Desea eliminar un producto? s/n");
                option = leer.next();
            } while (!(option.equalsIgnoreCase("s") || (option.equalsIgnoreCase("n"))));
             if ("n".equals(option)) {
                 mostrarProductos(listaProductos);
                 break;
             }
             System.out.println("Ingrese el nombre del producto para eliminar");
             produc = leer.next();
             
             if (listaProductos.containsKey(produc)) {                 
            listaProductos.remove(produc);
            } else {
            System.out.println("El producto no se encuentra en Stock");
        }
        } while(option.equalsIgnoreCase("s"));     
    }
    
    }
//y mostrar los productos que tenemos con su precio


