package david_diaz_lab7;

import java.awt.Color;

public class Riniones extends Organo{

    public Riniones() {
        super();
    }

    public Riniones(Color color, int nivel_potenciado, int nivel_prueba) {
        super(color, nivel_potenciado, nivel_prueba);
        super.setNivel_efectividad(753266);
    }

    @Override
    public String toString() {
        return "Riñones{";
    }
    
}
