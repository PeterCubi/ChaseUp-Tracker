import java.util.Scanner;

public class TablaObjetivos {

    private Objetivo[] tabla;

    public TablaObjetivos() {
        this.tabla = new Objetivo[4];
        System.out.println("Se ha creado nuevo apartado de objetivos. Tiene por defecto 4 huecos.\n\n");
    }

    public void listarTablaObjetivos(){
        for (int i = 0; i < tabla.length; i++){
            System.out.print( (i+1)+tabla[i].getTitulo());
            System.out.println( " "+tabla[i].getPorcentaje() + "%");
        }
    }
    public void imprimirTabalaObjetivos(){
        for (int i = 0; i < tabla.length; i++){
            System.out.print( (i+1)+tabla[i].getTitulo());
            System.out.println( " "+tabla[i].getPorcentaje() + "%");
        }
        // falta completar pero básicamente es imprimirlo en formato:
        //
        // Carrera de ingeniería:
        // [00--------] 22%
    }
    public void anadirObjetivo(Objetivo objetivo){
        boolean exit = false;
        int posicion = 0;

        while(!exit){
            if(tabla[posicion] == null){
                tabla[posicion] = objetivo;
                exit = true;
            }
            else{ posicion++;}

            if(posicion == tabla.length){
                System.out.println("No hay huecos en la tabla (actualmente: "+tabla.length+"), debe aumentar el " +
                        "número de " +
                        "huecos, o sobreescribir un objetivo");
                System.out.println("Objetivos actuales: ");
                listarTablaObjetivos();
            }
        }


    }
    public void eliminarObjetivo(){
        Scanner teclado = new Scanner(System.in);
        int posicion = 0;
        System.out.println("Elija el objetivo que desea eliminar.");
        listarTablaObjetivos();
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
    public void sobreescribiEstadistica(Objetivo objetivo){

        Scanner teclado = new Scanner(System.in);
        int posicion = 0;
        System.out.println("Elija la estadística que desea sobreescribir.");
        listarTablaObjetivos();
        System.out.print("seleccionar: ");
        posicion = teclado.nextInt();


        if(posicion > 0 && posicion <= tabla.length){
            tabla[posicion-1] = objetivo;
        }


    }

}
