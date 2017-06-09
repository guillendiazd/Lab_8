package david_diaz_lab7;

import java.awt.Color;

public class Cerebro extends Organo{

    public Cerebro() {
        super();
    }

    public Cerebro(Color color, int nivel_potenciado, int nivel_prueba) {
        super(color, nivel_potenciado, nivel_prueba);
        super.setNivel_efectividad(600000);
    }

    @Override
    public String toString() {
        return "Cerebro";
    }
    
}
