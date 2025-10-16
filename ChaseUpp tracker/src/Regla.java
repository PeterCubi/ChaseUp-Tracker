public class Regla {
    String regla;
    Boolean hecho;
    Boolean[] diasObligados;


    public Regla(String regla, Boolean hecho, Boolean[] diasObligados) {
        this.regla = regla;
        this.hecho = hecho;
        this.diasObligados = diasObligados;
    }

    public String getRegla() {
        return regla;
    }

    public void setRegla(String regla) {
        this.regla = regla;
    }

    public Boolean getHecho() {
        return hecho;
    }

    public void setHecho(Boolean hecho) {
        this.hecho = hecho;
    }

    public Boolean[] getDiasObligados() {
        return diasObligados;
    }

    public void setDiasObligados(Boolean[] diasObligados) {
        this.diasObligados = diasObligados;
    }
}
