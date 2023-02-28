package tienda;

import java.util.Scanner;
import tienda.persistencia.ControladoraPersistencia;

public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ControladoraPersistencia controlPersis = new ControladoraPersistencia();
        
        
        
        
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("\n_______________________   MENÚ PRINCIPAL   _______________________\n");
        System.out.println("a) Lista el nombre de todos los productos que hay en la tabla producto.\n"
                + "b) Lista los nombres y los precios de todos los productos de la tabla producto.\n"
                + "c) Listar aquellos productos que su precio esté entre 120 y 202.\n"
                + "d) Buscar y listar todos los Portátiles de la tabla producto.\n"
                + "e) Listar el nombre y el precio del producto más barato.\n"
                + "f) Ingresar un producto a la base de datos.\n"
                + "g) Ingresar un fabricante a la base de datos\n"
                + "h) Editar un producto con datos a elección.");
        String op = leer.next();
        do {
            switch (op.toLowerCase()) {
                case "a":

                    break;
                case "b":

                    break;
                case "c":

                    break;
                case "d":

                    break;
                case "e":

                    break;
                case "f":

                    break;
                case "g":

                    break;
                case "h":

                    break;

            }

        } while (true);
    }

}
