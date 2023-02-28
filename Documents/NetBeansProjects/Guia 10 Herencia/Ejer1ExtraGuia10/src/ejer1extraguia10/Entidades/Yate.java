package ejer1extraguia10.Entidades;

/**
 *
 * @author Rocio
 */
public class Yate extends BarcoAMotor {
    public Integer camarotes;
    public Yate() {
    }

    public Yate(Integer camarotes, Integer potencia, String matricula, Integer metros, Integer año) {
        super(potencia, matricula, metros, año);
        this.camarotes = camarotes;
    }

    public Integer getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(Integer camarotes) {
        this.camarotes = camarotes;
    }

    @Override
    public String toString() {
        
        return super.toString()+"Yate \t" + "camarotes=" + camarotes + '}';
    }
    
}
