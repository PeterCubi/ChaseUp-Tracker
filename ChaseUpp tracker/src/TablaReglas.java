
import java.util.Scanner;


public class TablaReglas {

    private Regla[] tabla;
    private int[] seguimiento;

    public TablaReglas() {
        this.tabla = new Regla[5];
        this.seguimiento = new int[7];
        System.out.println("Se ha creado nuevo apartado de reglas, tiene por defecto 5 huecos.\n\n");
    }

    public Regla[] getTabla() {
        return tabla;
    }
    public void setTabla(Regla[] tabla) {
        this.tabla = tabla;
    }
    public int[] getSeguimiento() {
        return seguimiento;
    }
    public void setSeguimiento(int[] seguimiento) {
        this.seguimiento = seguimiento;
    }

    public void listarTablaReglas(){
        for (int i = 0; i < tabla.length; i++){
            System.out.println( (i+1)+ tabla[i].getRegla());
        }
    }
    public void imprimirTablaReglas(){
        for (int i = 0; i < tabla.length; i++){
            System.out.println( (i+1)+ tabla[i].getRegla());
        }
        //falta completar pero básicamente muestra la pizarra junto la barra de seguimiento.
    }

    public void anadirRegla(Regla regla){
        boolean exit = false;
        int posicion = 0;
        while(!exit){
            if(tabla[posicion] == null){
                tabla[posicion] = regla;
                exit = true;
            }
            else{ posicion++;}

            if(posicion == tabla.length){
                System.out.println("No hay huecos en la tabla (actualmente: "+ tabla.length+"), debe aumentar el " +
                        "número de huecos, o sobreescribir una regla.");
                System.out.println("Estadisticas actuales: ");
                listarTablaReglas();
            }
        }
    }
    public void eliminarRegla(){
        Scanner teclado = new Scanner(System.in);
        int posicion = 0;
        System.out.println("Elija la estadística que desea eliminar.");
        listarTablaReglas();
        System.out.print("seleccionar: ");
        posicion = teclado.nextInt();


        // Esto es para correr el array y eliminar el último si lo hubiere.
        for(int i = posicion-1; i < tabla.length-1; i++){
            tabla[i] = tabla[i+1];
        }
        if(tabla[tabla.length - 1] == tabla[tabla.length - 2] ){
            tabla[tabla.length - 1] = null;
        }



    }
    public int recuentoDelDia(){
        int check = 0;
        for(int i = 0 ; i < tabla.length ; i++){
            if(tabla[i].hecho){check++;}
        }
        return check;
    }
    public void reiniciarTabla(){
        for (int i  =  0; i<tabla.length; i++){
            tabla[i].setHecho(false);
        }
    }
    public int getCumplimientoSemanal(int diaSemana){
        int cumplimiento = 0;
        for(int i = 0 ; i<= diaSemana;i++){
            cumplimiento += seguimiento[i];
        }
        cumplimiento = cumplimiento/(diaSemana+1);
        return cumplimiento;
    }
    public void sobreescribirRegla(Regla nuevaRegla) {

        Scanner teclado = new Scanner(System.in);
        int posicion = 0;
        System.out.println("Elija la estadística que desea sobreescribir.");
        listarTablaReglas();
        System.out.print("seleccionar: ");
        posicion = teclado.nextInt();

        if(posicion > 0 && posicion <= tabla.length){
            tabla[posicion-1] = nuevaRegla;
        }



    }

}
