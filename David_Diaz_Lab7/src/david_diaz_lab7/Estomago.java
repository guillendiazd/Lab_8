package david_diaz_lab7;

import java.awt.Color;

public class Estomago extends Organo{
    public Estomago(Color color, int nivel_efectividad, int nivel_potenciado, int nivel_prueba) {
        super(color, nivel_efectividad, nivel_potenciado, nivel_prueba);
        super.setNivel_efectividad(52580);
    }

    @Override
    public String toString() {
        return "Estomago";
    }
    
}
