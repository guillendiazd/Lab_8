package david_diaz_lab7;
public class Persona {
    private String nombre;
    private int edad;
    private String ID;
    private double peso;
    private String sexo;

    public Persona() {
    }

    public Persona(String nombre, int edad, String ID, double peso, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.ID = ID;
        this.peso = peso;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
