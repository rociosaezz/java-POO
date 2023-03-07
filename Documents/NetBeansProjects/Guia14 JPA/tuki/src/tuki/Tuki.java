package tuki;

import java.util.logging.Level;
import java.util.logging.Logger;
import tuki.services.Menu;

public class Tuki {

    public static void main(String[] args) {
        System.out.println("holis");
        Menu menu = new Menu();
        try {
            menu.ejecutar();
        } catch (Exception ex) {
            Logger.getLogger(Tuki.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
