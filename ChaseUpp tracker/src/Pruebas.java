import java.util.Scanner;

public class Pruebas {
    public static void main(String []args){

        TablaEstadisticas tablaEstadisticas = new TablaEstadisticas();
        Scanner teclado = new Scanner(System.in);

        Estadistica estadistica1 = new Estadistica("Disciplina",2,false);
        Estadistica estadistica2= new Estadistica("Disciplina",2,false);
        Estadistica estadistica3= new Estadistica("Disciplina",2,false);
        Estadistica estadistica4 = new Estadistica("Disciplina",0,false);
        Estadistica estadistica5 = new Estadistica("Disciplina",0,false);
        Estadistica estadistica6 = new Estadistica("Disciplina",4,false);
        Estadistica estadistica7 = new Estadistica("Disciplina",5,false);
        Estadistica estadistica8 = new Estadistica("Disciplina",6,false);

        tablaEstadisticas.anadirEstadistica(estadistica1);
        tablaEstadisticas.anadirEstadistica(estadistica2);
        tablaEstadisticas.anadirEstadistica(estadistica3);
        tablaEstadisticas.anadirEstadistica(estadistica4);
        tablaEstadisticas.anadirEstadistica(estadistica5);
        tablaEstadisticas.anadirEstadistica(estadistica6);
        tablaEstadisticas.anadirEstadistica(estadistica7);
        tablaEstadisticas.anadirEstadistica(estadistica8);
        tablaEstadisticas.listarTablaEstadisticas();

    }
}
