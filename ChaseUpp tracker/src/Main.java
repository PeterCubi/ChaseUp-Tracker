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
        Stats stats = new Stats();

        stats.addStat(new Stat("Strength", "Physical power", 9.5, true));
        stats.addStat(new Stat("Smarts", "Intelligence", 9, true));
        stats.addStat(new Stat("Discipline", "Self-control", 9.2, true ));
        stats.addStat(new Stat("Charisma", "Charm", 7.1, false));
        stats.addStat(new Stat("Wealth", "Richness", 5, true));

        stats.printStats();

        stats.addStatFromKeyboard(scanner, "Adding new stat");

        stats.printStats();
        // Uncomment to test keyboard input:
        // stats.addStatFromKeyboard(scanner, "Add a new stat:");
        // stats.printStats();
        // stats.deleteStatFromKeyboard(scanner, "Delete a stat:");
        // stats.printStats();
    }


    }
