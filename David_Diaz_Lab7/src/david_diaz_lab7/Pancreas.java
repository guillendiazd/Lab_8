package david_diaz_lab7;

import java.awt.Color;

public class Pancreas extends Organo{
    public Pancreas(Color color, int nivel_potenciado, int nivel_prueba) {
        super(color, nivel_potenciado, nivel_prueba);
        super.setNivel_efectividad(984236);
    }

    @Override
    public String toString() {
        return "Páncreas{";
    }
    
}
