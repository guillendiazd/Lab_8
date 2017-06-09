package david_diaz_lab7;

import java.util.ArrayList;

public class Doctor extends Persona{
    private ArrayList<String> especialidades;
    private ArrayList<Paciente> pacientes = new ArrayList();
    private int anio_doctor;
    private String horario_trabajo;
    private String dias_trabajo;

    public Doctor() {
    }

    public Doctor(int anio_doctor, String horario_trabajo, String dias_trabajo, String nombre, int edad, String ID, double peso, String sexo) {
        super(nombre, edad, ID, peso, sexo);
        this.especialidades = especialidades;
        this.anio_doctor = anio_doctor;
        this.horario_trabajo = horario_trabajo;
        this.dias_trabajo = dias_trabajo;
    }

    public ArrayList<String> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(ArrayList<String> especialidades) {
        this.especialidades = especialidades;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public int getAnio_doctor() {
        return anio_doctor;
    }

    public void setAnio_doctor(int anio_doctor) {
        this.anio_doctor = anio_doctor;
    }

    public String getHorario_trabajo() {
        return horario_trabajo;
    }

    public void setHorario_trabajo(String horario_trabajo) {
        this.horario_trabajo = horario_trabajo;
    }

    public String getDias_trabajo() {
        return dias_trabajo;
    }

    public void setDias_trabajo(String dias_trabajo) {
        this.dias_trabajo = dias_trabajo;
    }

    @Override
    public String toString() {
        return "Doctor " + super.toString();
    }
    
}
