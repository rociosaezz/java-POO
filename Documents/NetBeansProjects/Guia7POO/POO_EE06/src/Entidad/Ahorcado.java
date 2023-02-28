//
package Entidad;
public class Ahorcado {
    
    private char[]palabra_secreta;
    private String palabra;
    private char[]palabra_pantalla;
    private char letra;
    private int cant_letras;
    private int cant_intent;
    private int longitud;

    public Ahorcado() {
    }

    public Ahorcado(char[] palabra_secreta, char[] palabra_pantalla, int cant_letras, int cant_intent) {
        this.palabra_secreta = palabra_secreta;
        this.palabra_pantalla = palabra_pantalla;
        this.cant_letras = cant_letras;
        this.cant_intent = cant_intent;
    }

    public char[] getPalabra_secreta() {
        return palabra_secreta;
    }

    public void setPalabra_secreta(char[] palabra_secreta) {
        this.palabra_secreta = palabra_secreta;
    }

    public void setPalabra_pantalla(char[] palabra_pantalla) {
        this.palabra_pantalla = palabra_pantalla;
    }

    public char[] getPalabra_pantalla() {
        return palabra_pantalla;
    }
   
    public int getCant_letras() {
        return cant_letras;
    }

    public void setCant_letras(int cant_letras) {
        this.cant_letras = cant_letras;
    }

    public int getCant_intent() {
        return cant_intent;
    }

    public void setCant_intent(int cant_intent) {
        this.cant_intent = cant_intent;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }


    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    } 
}
