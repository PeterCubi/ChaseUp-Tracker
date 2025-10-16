import java.util.Scanner;

public class TablaReflexiones {
    private Reflexion[] tabla;

    public TablaReflexiones() {
        this.tabla = new Reflexion[100];
        System.out.println("Se ha creado nuevo apartado de reflexiones, tiene por defecto 100 huecos.\n" +
                "Si quiere añadir más reflexiones espere a futuras actualizaciones.\n" +
                "(aunque sinceramente no sé por que quieres tantas cacho friki).\n\n");
    }

    public void lstarTablaReflexiones(){
        for (int i = 0; i < tabla.length; i++){
            System.out.println( (i+1)+tabla[i].getEntrada());
        }
    }
    public void anadirReflexion(Reflexion reflexion){
        boolean exit = false;
        int posicion = 0;
        while(!exit){
            if(tabla[posicion] == null){
                tabla[posicion] = reflexion;
                exit = true;
            }
            else{ posicion++;}

            if(posicion == tabla.length){
                System.out.println("No hay huecos en la tabla (actualmente: "+tabla.length+"), debe aumentar el " +
                        "número de " +
                        "huecos, o sobreescribir una Reflexión");
                System.out.println("Reflexiones actuales: ");
                lstarTablaReflexiones();
            }
        }


    }
    public void eliminarReflexion(){
        Scanner teclado = new Scanner(System.in);
        int posicion = 0;
        System.out.println("Elija la reflexión que desea eliminar.");
        lstarTablaReflexiones();
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
    public void sobreescribiReflexion(Reflexion reflexion){

        Scanner teclado = new Scanner(System.in);
        int posicion = 0;
        System.out.println("Elija la estadística que desea sobreescribir.");
        lstarTablaReflexiones();
        System.out.print("seleccionar: ");
        posicion = teclado.nextInt();


        if(posicion > 0 && posicion <= tabla.length){
            tabla[posicion-1] = reflexion;
        }


    }

}
