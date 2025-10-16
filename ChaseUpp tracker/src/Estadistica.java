public class Estadistica {

    private String etiqueta;
    private double valor;
    //enum TIPO {OBJETIVA,APRECIATIVA};

    private boolean exceso;

    public Estadistica(String etiqueta, double valor, boolean exceso) {

        this.etiqueta = etiqueta;
        if(valor>=0 && valor<=10){
            this.valor = valor;
        } else{
            System.out.println("Ese valor no es posible.");
        }
        if(exceso){this.valor = 10.0;}
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public double getValor() {
        return valor;
    }
}
