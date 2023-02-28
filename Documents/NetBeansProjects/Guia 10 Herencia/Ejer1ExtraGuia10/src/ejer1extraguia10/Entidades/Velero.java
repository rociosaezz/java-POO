package ejer1extraguia10.Entidades;

/**Número de mástiles*/
public class Velero extends Barco {
    public Integer mastiles;

    public Velero(Integer mastiles, String matricula, Integer metros, Integer año) {
        super(matricula, metros, año);
        this.mastiles = mastiles;
    }

   
    

    public Velero() {
    }

    public Integer getMastiles() {
        return mastiles;
    }

    public void setMastiles(Integer mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public String toString() {
        return super.toString()+"Velero \t" + "mastiles=" + mastiles + '}';
    }

    
}
