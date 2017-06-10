package david_diaz_lab7;

import javax.swing.JProgressBar;

public class AdmRin extends Thread{
    private JProgressBar prog;
    private int ne;
    private int np;
    private boolean avanzar;
    private boolean vive;

    public AdmRin(JProgressBar prog, int ne, int np) {
        this.prog = prog;
        this.ne = ne;
        this.np = np;
        avanzar=true;
        vive=true;
    }
    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }
    public void setVida(boolean vive) {
        this.vive = vive;
    }    
    public void run(){
        int D = 1;
        while(vive){
            if(avanzar){  
                prog.setValue(prog.getValue() + (ne*np));
                if (prog.getValue() == 1000000000) {
                    vive = false;
                }
                
                try {
                    Thread.sleep(0);
                } catch (InterruptedException ex) {      }
            }
        }
    }
}
