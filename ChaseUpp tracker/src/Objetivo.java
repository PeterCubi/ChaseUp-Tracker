public class Objetivo {


    private double porcentaje;
    private String titulo;

    public Objetivo(double porcentaje, String titulo) {

        this.porcentaje = porcentaje;
        this.titulo = titulo;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
