package ejer7;
import Entidades.Persona;
import Service.PersonaException;
import Service.ServicePersona;
/*
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores. */
public class Ejer7 {

    public static void main(String[] args) throws PersonaException {
        ServicePersona  prs = new ServicePersona();
        Persona p1 = prs.crearPersona();
        Persona p2 = new Persona("Francisca", 50, "M", 90.0, 1.60);
      
        Persona p3 = new Persona("Roberto", 20, "h", 100.0, 2.0);
       
        Persona[] per = new Persona[5];
        per[0] = p1;
        per[1] = p2;
        per[2] = p3;
        int sobrePeso = 0;
        int pesoIdeal = 0;
        int pesoBajo = 0;
        int mayorEdad = 0;
        int menorEdad = 0;
for (int i = 0; i < 4; i++) {
            switch (prs.calcularIMC(per[i])) {
                case -1:
                    pesoBajo++;
                    break;
                case 0:
                    pesoIdeal++;
                    break;
                case 1:
                    sobrePeso++;
                    break;}
       
     if (prs.esMayorDeEdad(per[i])) {
        mayorEdad++;
            } else {
        menorEdad++;
            }
}
        System.out.println("El "+(pesoBajo*100)/4+" % de las personas evaluadas tienen bajo peso.");
        System.out.println("El "+(pesoIdeal*100)/4+" % de las personas evaluadas tienen peso ideal.");
        System.out.println("El "+(sobrePeso*100)/4+" % de las personas evaluadas tienen sobrepeso.");
        System.out.println("El "+(mayorEdad*100)/4+" % de las personas evaluadas son mayores de edad.");
        System.out.println("El "+(menorEdad*100)/4+ " % de las personas evaluadas son menores de edad.");     
}}
