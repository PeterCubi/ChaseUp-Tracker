import java.util.Scanner;

public class TablaEstadisticas {

    private Estadistica[] tabla;

    public TablaEstadisticas() {
        this.tabla = new Estadistica[8];
        System.out.println("Se ha creado nuevo apartado de estadísticas, tiene por defecto 8 huecos\n" +
                "donde se valorará cada parámetro del 0.0 al 10.0 . \n\n");
    }

    public void listarTablaEstadisticas(){
        for (int i = 0; i < tabla.length; i++){
            System.out.println( (i+1)+" "+tabla[i].getEtiqueta()+": "+tabla[i].getValor() +"/10");
        }
    }
    public void imprimirTablaEstadisticas(){
        for (int i = 0; i < tabla.length; i++){
            System.out.println( (i+1)+tabla[i].getEtiqueta());
        }
        //falta completar pero imprime las estadísticas con la última puntuación guardada.
    }
    public void anadirEstadistica(Estadistica estadistica){
        boolean exit = false;
        int posicion = 0;
        while(!exit){
            if(tabla[posicion] == null){
                tabla[posicion] = estadistica;
                exit = true;
            }
            else{ posicion++;}

            if(posicion == tabla.length){
                System.out.println("No hay huecos en la tabla (actualmente: "+tabla.length+"), debe aumentar el " +
                        "número de " +
                        "huecos, o sobreescribir una estadística");
                System.out.println("Estadisticas actuales: ");
                listarTablaEstadisticas();
            }
        }


    }
    public void eliminarEstadistica(){
        Scanner teclado = new Scanner(System.in);
        int posicion = 0;
        System.out.println("Elija la estadística que desea eliminar.");
        listarTablaEstadisticas();
        System.out.print("seleccionar: ");
        posicion = teclado.nextInt();


        // Esto es para correr el array y eliminar el último si lo hubiere.
        for(int i = posicion-1 ; i < tabla.length-1;i++){
            tabla[i] = tabla[i+1];
        }
        if(tabla[tabla.length - 1] == tabla[tabla.length - 2] ){
            tabla[tabla.length - 1] = null;
        }
    }
    public void sobreescribiEstadistica(Estadistica estadistica){

        Scanner teclado = new Scanner(System.in);
        int posicion = 0;
        System.out.println("Elija la estadística que desea sobreescribir.");
        listarTablaEstadisticas();
        System.out.print("seleccionar: ");
        posicion = teclado.nextInt();


        if(posicion > 0 && posicion <= tabla.length){
            tabla[posicion-1] = estadistica;
        }


    }

    public void setTabla(Estadistica[] tabla) {
        this.tabla = tabla;
    }

    public Estadistica[] getTabla() {
        return tabla;
    }
}
