package david_diaz_lab7;

import java.awt.Color;

public class Pulmones extends Organo{

    public Pulmones() {
        super();
    }

    public Pulmones(Color color, int nivel_potenciado, int nivel_prueba) {
        super(color, nivel_potenciado, nivel_prueba);
        super.setNivel_efectividad(589213);
    }

    @Override
    public String toString() {
        return "Pulmones";
    }
    
}
