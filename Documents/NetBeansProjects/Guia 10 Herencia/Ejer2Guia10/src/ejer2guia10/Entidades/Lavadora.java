package ejer2guia10.Entidades;
import java.util.Scanner;

public class Lavadora extends Electrodomestico {

    private Integer carga;

    public Lavadora() {
    }

    public Lavadora(Integer carga) {
        this.carga = carga;
    }

    public Lavadora(Integer carga, Integer precio, String color, char consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
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

    public void crearLavadora(Electrodomestico e) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Se creará un Lavarropas");
        super.crearElectrodomestico(e);
        System.out.println("¿De cuantos kilos de carga quiere su lavarropas?");
        this.setCarga(leer.nextInt());
    }

    /*Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.*/

    @Override
    public String toString() {
        System.out.println("LAVARROPAS \nCon carga de = " + carga);
        return super.toString();

    }

    @Override
    public Integer precioFinal(Electrodomestico e) {
        super.precioFinal(e);
        if (this.getCarga() > 30) {
            e.setPrecio(e.getPrecio() + 500);
        }
        return e.getPrecio();
    }

}
