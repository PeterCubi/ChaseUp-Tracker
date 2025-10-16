import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        System.out.println("1. Cargar y mostrar pizarra \n" + //carga la pizarra de esta semana
                "2. Añadir objeto\n" + // qué objeto? qué valor toma?
        //        "3. Actualizar valores\n"
        "3. repasar objectivos\n" +
                "4. señal de la cruz\n" +
                "5. Añadir entrada\n" +
                "6. Ver entradas no visibles\n" + //después deba dar la opcion de hacerlas visisbles o no
                "7. Ocultar entrada" +
                "0. Salir a comerse el mundo");

        System.out.println(LocalDate.now().toString());*/
        Scanner scanner = new Scanner(System.in);
        Objectives objectives = new Objectives();

        objectives.setObjective("School", 50);
        objectives.setObjective("Training", 80);
        objectives.setObjective("Project", 25);

        objectives.printObjectives();

        // Uncomment to test interaction:
         objectives.setObjectiveFromKeyboard(scanner, "Add a new objective:");
         objectives.printObjectives();
         objectives.deleteObjectiveFromKeyboard(scanner, "Delete an objective:");
         objectives.printObjectives();
         objectives.evaluateObjectiveFromKeyboard(scanner, "Evaluate objective");
         objectives.printObjectives();
    }


    }
