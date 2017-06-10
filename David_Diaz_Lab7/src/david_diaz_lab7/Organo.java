package david_diaz_lab7;

import java.awt.Color;
import java.io.Serializable;
import java.util.ArrayList;

public class Organo implements Serializable{
    private static final long SerialVersionUID = 707L;
    private Color color;
    private ArrayList<String> caracteristicas = new ArrayList();
    private int nivel_efectividad;
    private int nivel_potenciado;
    private int nivel_prueba;

    public Organo() {
    }

    public Organo(Color color, int nivel_potenciado, int nivel_prueba) {
        this.color = color;
        this.nivel_potenciado = nivel_potenciado;
        this.nivel_prueba = nivel_prueba;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public ArrayList<String> getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(ArrayList<String> caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public int getNivel_efectividad() {
        return nivel_efectividad;
    }

    public void setNivel_efectividad(int nivel_efectividad) {
        this.nivel_efectividad = nivel_efectividad;
    }

    public int getNivel_potenciado() {
        return nivel_potenciado;
    }

    public void setNivel_potenciado(int nivel_potenciado) {
        this.nivel_potenciado = nivel_potenciado;
    }

    public int getNivel_prueba() {
        return nivel_prueba;
    }

    public void setNivel_prueba(int nivel_prueba) {
        this.nivel_prueba = nivel_prueba;
    }
    
}
