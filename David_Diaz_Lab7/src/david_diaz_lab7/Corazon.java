package david_diaz_lab7;

import java.awt.Color;

public class Corazon extends Organo{

    public Corazon(Color color, int nivel_potenciado, int nivel_prueba) {
        super(color, nivel_potenciado, nivel_prueba);
        super.setNivel_efectividad(21546);
    }

    @Override
    public String toString() {
        return "Corazón";
    }
    
}
