package david_diaz_lab7;

import java.awt.Color;

public class Higado extends Organo{

    public Higado(Color color, int nivel_potenciado, int nivel_prueba) {
        super(color, nivel_potenciado, nivel_prueba);
        super.setNivel_efectividad(69864);
    }

    @Override
    public String toString() {
        return "Hígado";
    }
    
}
