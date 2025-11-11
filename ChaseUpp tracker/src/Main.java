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
        TemporalThoughts myThoughts = new TemporalThoughts();

        myThoughts.newThought("Morning idea", "Maybe I should start journaling again.");
        myThoughts.newThought("Random", "Coffee tastes better when it rains.");
        myThoughts.printThoughts();

        // Uncomment to test interactions
         myThoughts.newThoughtFromKeyboard(scanner, "📝 Add a new thought:");
         myThoughts.deleteThoughtFromKeyboard(scanner, "🗑️ Delete a thought:");
         myThoughts.printThoughts();
    }

// esto es para practicar merges
}
