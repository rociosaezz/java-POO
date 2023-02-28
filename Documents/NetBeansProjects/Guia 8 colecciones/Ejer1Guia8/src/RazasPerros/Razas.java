
package RazasPerros;

import java.util.Objects;

/**
 */
public class Razas {
    private String raza;

    public Razas(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Razas() {
    }

    @Override
    public String toString() {
        return "perros="+"\t raza=" + raza +"\t";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.raza);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Razas other = (Razas) obj;
        if (!Objects.equals(this.raza, other.raza)) {
            return false;
        }
        return true;
    }
    
    
   
            
            
}
