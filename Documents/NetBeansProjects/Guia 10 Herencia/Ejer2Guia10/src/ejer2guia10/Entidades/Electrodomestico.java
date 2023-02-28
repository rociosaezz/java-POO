package ejer2guia10.Entidades;

import java.util.Scanner;

/**
 * precio, color,consumo energético (letras entre A y F) y peso.
 */
public abstract class Electrodomestico {

    protected Integer precio;
    protected String color;
    protected char consumoEnergetico;
    protected Double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Integer precio, String color, char consumoEnergetico, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Precio = $" + precio + "\tColor = " + color + "\tConsumo Energetico = " + consumoEnergetico + "\tPeso = " + peso + "kg.";
    }

    private void comprobarConsumoEnergetico(char letra, Electrodomestico e) {
        if (letra == 'A' || letra == 'a' || letra == 'B' || letra == 'b' || letra == 'C' || letra == 'c' || letra == 'D' || letra == 'd' || letra == 'E' || letra == 'e' || letra == 'F' || letra == 'f') {
            e.setConsumoEnergetico(letra);
        } else {
            e.setConsumoEnergetico('F');
        }
    }


    /*• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.*/
    private void comprobarColor(String colorin, Electrodomestico e) {
        switch (colorin.toLowerCase()) {
            case "blanco":
                e.setColor(colorin);
                break;
            case "negro":
                e.setColor(colorin);
                break;
            case "rojo":
                e.setColor(colorin);
                break;
            case "azul":
                e.setColor(colorin);
                break;
            case "gris":
                e.setColor(colorin);
            default:
                e.setColor("blanco");
        }
    }


    /*    Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.*/
    public void crearElectrodomestico(Electrodomestico e) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("¿Qué consumo energético elige para su electrodoméstico? A-F");
        String letra = leer.next();
        comprobarConsumoEnergetico(letra.charAt(0), e);
        System.out.println("¿De qué color quiere su electrodoméstico?");
        e.setColor(leer.next());
        comprobarColor(e.getColor(), e);
        System.out.println("¿Cuánto pesa?");
        e.setPeso(leer.nextDouble());
        e.setPrecio(1000);

    }
//• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del precio. Esta es la lista de precios

    public Integer precioFinal(Electrodomestico e) {
        e.setPrecio(1000);
        if (e.getConsumoEnergetico() == 'A' || e.getConsumoEnergetico() == 'a') {
            e.setPrecio(e.getPrecio() + 1000);
        }
        if (e.getConsumoEnergetico() == 'B' || e.getConsumoEnergetico() == 'b') {
            e.setPrecio(e.getPrecio() + 800);
        }
        if (e.getConsumoEnergetico() == 'C' || e.getConsumoEnergetico() == 'c') {
            e.setPrecio(e.getPrecio() + 600);
        }
        if (e.getConsumoEnergetico() == 'D' || e.getConsumoEnergetico() == 'd') {
            e.setPrecio(e.getPrecio() + 500);
        }
        if (e.getConsumoEnergetico() == 'E' || e.getConsumoEnergetico() == 'e') {
            e.setPrecio(e.getPrecio() + 300);
        }
        if (e.getConsumoEnergetico() == 'F' || e.getConsumoEnergetico() == 'f') {
            e.setPrecio(e.getPrecio() + 100);
        }
        if (e.getPeso() < 19) {
            e.setPrecio(e.getPrecio() + 100);
        }
        if (e.getPeso() > 19 && e.getPeso() < 50) {
            e.setPrecio(e.getPrecio() + 500);
        }
        if (e.getPeso() > 49 && e.getPeso() < 80) {
            e.setPrecio(e.getPrecio() + 800);
        }
        if (e.getPeso() >= 80) {
            e.setPrecio(e.getPrecio() + 1000);
        }
        return e.getPrecio();
    }
}
