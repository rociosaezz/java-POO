
package ejer1extraguia10.Entidades;

/**Potencia en CV*/
public class BarcoAMotor extends Barco {
    public Integer potencia;

    public BarcoAMotor() {
    }

    public BarcoAMotor(Integer potencia, String matricula, Integer metros, Integer año) {
        super(matricula, metros, año);
        this.potencia = potencia;
    }

    
    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return super.toString() +"Barco A Motor \t" + "potencia=" + potencia + '}';
    }
    
    
    
}
