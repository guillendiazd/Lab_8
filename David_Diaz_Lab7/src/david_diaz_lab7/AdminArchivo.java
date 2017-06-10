package david_diaz_lab7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdminArchivo {
    private ArrayList<Persona> ListaPersona = new ArrayList();
    private File archivo = null;

    public AdminArchivo(String path) {
        archivo = new File(path);
    }

    public ArrayList<Persona> getListaPersona() {
        return ListaPersona;
    }

    public void setListaPersona(ArrayList<Persona> ListaPersona) {
        this.ListaPersona = ListaPersona;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    public void setPersona(Persona p){
        this.ListaPersona.add(p);
    }
    
    @Override
    public String toString() {
        return "" + ListaPersona;
    }
    
    public void CargarArchivo(){
        try {
            ListaPersona = new ArrayList();
            Persona temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while((temp = (Persona)objeto.readObject()) != null){
                        ListaPersona.add(temp);
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void EscribirArchivo(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Persona p : ListaPersona) {
                bw.writeObject(p);
            }
            bw.flush();
        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }
}
