import java.util.Scanner;
import java.time.LocalDate;
public class Reflexion {

    private String entrada;
    private String fecha;

    private int importancia;
    private Boolean visible;
    private Boolean completa;
    private String resumidaCompleta; //aquí se guarda la versión alternativa

    Scanner teclado = new Scanner(System.in);
    public Reflexion (){

        this.entrada = teclado.nextLine();
        visible = false;
        completa = true;
        resumidaCompleta = null;
        fecha = LocalDate.now().toString();
    }

    public void ocultar(){

        visible = false;
    }

    public void resumir(Reflexion reflexion){

        System.out.println("Entrad actual: " + entrada);
        Reflexion resumen = new Reflexion();
        System.out.print("Introduzca el resumen de la entrada: ");
        resumen.setEntrada(teclado.nextLine());
        resumen.setFecha(this.fecha);
        resumen.setCompleta(false);
        resumen.setResumidaCompleta(this.entrada);

    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public void setCompleta(Boolean completa) {
        this.completa = completa;
    }

    public void setResumidaCompleta(String resumidaCompleta) {
        this.resumidaCompleta = resumidaCompleta;
    }


    public String getEntrada() {
        return entrada;
    }

    public String getFecha() {
        return fecha;
    }

    public int getImportancia() {
        return importancia;
    }

    public Boolean getVisible() {
        return visible;
    }

    public Boolean getCompleta() {
        return completa;
    }

    public String getResumidaCompleta() {
        return resumidaCompleta;
    }
}
