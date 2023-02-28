package ejer2guia10.Entidades;

import java.util.Scanner;

/**
 * Se debe crear también una subclase llamada Televisor con los siguientes
 * atributos: resolución (en pulgadas) y sintonizador TDT (booleano), además de
 * los atributos heredados. Los constructores que se implementarán serán: • Un
 * constructor vacío. • Un constructor con la resolución, sintonizador TDT y el
 * resto de los atributos heredados. Recuerda que debes llamar al constructor de
 * la clase padre.
 */
public class Televisor extends Electrodomestico {

    private Integer pulgadas;
    private Boolean sintonizadorTDT;

    public Televisor(Integer pulgadas, Boolean sintonizadorTDT) {
        this.pulgadas = pulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Televisor(Integer pulgadas, Boolean sintonizadorTDT, Integer precio, String color, char consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Televisor() {
    }

    public Integer getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(Integer pulgadas) {
        this.pulgadas = pulgadas;
    }

    public Boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(Boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
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

    /*Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.*/
    public void crearTelevisor(Electrodomestico e) {
        System.out.println("Se creará un Televisor");

        super.crearElectrodomestico(e);
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("¿Desea un TV con sintonizador TDT? S/N");
        String option = leer.next();
        sintonizadorTDT = option.equalsIgnoreCase("s");
        System.out.println("¿De cuántas pulgadas desea su TV?");
        pulgadas = leer.nextInt();
    }

    /*• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.*/
    @Override
    public Integer precioFinal(Electrodomestico e) {
        super.precioFinal(e);

        if (pulgadas >= 40) {
            e.setPrecio((int) (precio * 1.3));
        }
        if (sintonizadorTDT) {
            e.setPrecio(e.getPrecio() + 500);
        }
        return e.getPrecio();
    }

    @Override
    public String toString() {
        System.out.println("TELEVISOR\nPulgadas = " + pulgadas + "\tSintonizador = " + sintonizadorTDT);
        return super.toString(); 
    }

}
