public class Pizarra {

    private Usuario usuario;

    private TablaEstadisticas estadisticas;
    private TablaReglas tablaReglas;
    private TablaObjetivos tablaObjetivos;

    private TablaReflexiones tablaReflexiones;

    private Cruz cruz;


    public Pizarra() {

        this.estadisticas = new TablaEstadisticas();
        this.tablaReglas = new TablaReglas();
        this.tablaObjetivos = new TablaObjetivos();
        this.tablaReflexiones = new TablaReflexiones();
    }

    public void guardarPizarra(){}

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public TablaEstadisticas getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(TablaEstadisticas estadisticas) {
        this.estadisticas = estadisticas;
    }

    public TablaReglas getTablaReglas() {
        return tablaReglas;
    }

    public void setTablaReglas(TablaReglas tablaReglas) {
        this.tablaReglas = tablaReglas;
    }

    public TablaObjetivos getTablaObjetivos() {
        return tablaObjetivos;
    }

    public void setTablaObjetivos(TablaObjetivos tablaObjetivos) {
        this.tablaObjetivos = tablaObjetivos;
    }

    public TablaReflexiones getTablaReflexiones() {
        return tablaReflexiones;
    }

    public void setTablaReflexiones(TablaReflexiones tablaReflexiones) {
        this.tablaReflexiones = tablaReflexiones;
    }
}
