package david_diaz_lab7;

import java.util.ArrayList;
import java.util.Date;

public class Paciente extends Persona{
    private ArrayList<String> enfermedades = new ArrayList();
    private Date fecha_ingreso;
    private Date fecha_alta;
    private String tipo_sangre;
    private String causa_visita;
    private ArrayList<String> alergias = new ArrayList();
    private ArrayList<Organo> organos = new ArrayList();

    public Paciente() {
        super();
    }

    public Paciente(Date fecha_ingreso, Date fecha_alta, String tipo_sangre, String causa_visita, String nombre, int edad, String ID, double peso, String sexo) {
        super(nombre, edad, ID, peso, sexo);
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_alta = fecha_alta;
        this.tipo_sangre = tipo_sangre;
        this.causa_visita = causa_visita;
    }

    public ArrayList<String> getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(ArrayList<String> enfermedades) {
        this.enfermedades = enfermedades;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public Date getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(Date fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    public String getTipo_sangre() {
        return tipo_sangre;
    }

    public void setTipo_sangre(String tipo_sangre) {
        this.tipo_sangre = tipo_sangre;
    }

    public String getCausa_visita() {
        return causa_visita;
    }

    public void setCausa_visita(String causa_visita) {
        this.causa_visita = causa_visita;
    }

    public ArrayList<String> getAlergias() {
        return alergias;
    }

    public void setAlergias(ArrayList<String> alergias) {
        this.alergias = alergias;
    }

    public ArrayList<Organo> getOrganos() {
        return organos;
    }

    public void setOrganos(ArrayList<Organo> organos) {
        this.organos = organos;
    }

    @Override
    public String toString() {
        return "Paciente " + super.toString();
    }
    
}
