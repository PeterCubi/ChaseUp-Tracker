import java.util.HashMap;
import java.util.Scanner;
public class TemporalThoughts {
    private HashMap<String, String> thoughts;

    public TemporalThoughts() {
        this.thoughts = new HashMap<>();
    }

    // Crear un pensamiento nuevo
    public void newThought(String title, String entry) {
        thoughts.put(title, entry);
        System.out.println("🧠 Thought \"" + title + "\" added.\n");
    }

    // Crear pensamiento desde teclado
    public void newThoughtFromKeyboard(Scanner keyboard, String message) {
        System.out.println(message);
        System.out.print("Introduce thought title: ");
        String title = keyboard.nextLine();
        System.out.print("Introduce thought entry: ");
        String entry = keyboard.nextLine();

        thoughts.put(title, entry);
        System.out.println("🧠 Thought added successfully.\n");
    }

    // Eliminar pensamiento por título
    public void deleteThought(String title) {
        if (thoughts.containsKey(title)) {
            thoughts.remove(title);
            System.out.println("🗑️ Thought \"" + title + "\" deleted.\n");
        } else {
            System.out.println("⚠️ Thought not found.\n");
        }
    }

    // Eliminar pensamiento desde teclado
    public void deleteThoughtFromKeyboard(Scanner keyboard, String message) {
        if (thoughts.isEmpty()) {
            System.out.println("⚠️ No thoughts to delete.\n");
            return;
        }

        System.out.println(message);
        printThoughts();

        System.out.print("Enter the title of the thought to delete: ");
        String title = keyboard.nextLine();
        deleteThought(title);
    }

    // Mostrar todos los pensamientos con formato bonito
    public void printThoughts() {
        if (thoughts.isEmpty()) {
            System.out.println("🕳️ No thoughts stored.\n");
            return;
        }

        System.out.println("_____________________________________________________________\n");
        for (int i = 0; i < thoughts.keySet().size(); i++) {
            String title = (String) thoughts.keySet().toArray()[i]; //not the best but fair enough,not important
            // really unless you are a REALLY toughtful person.
            String entry = thoughts.get(title);

            System.out.println("💭 Title: " + title);
            System.out.println("    \"" + entry + "\"\n");
        }
        System.out.println("_____________________________________________________________\n");
    }

    // Obtener un pensamiento específico
    public String getThought(String title) {
        return thoughts.getOrDefault(title, "⚠️ Thought not found.");
    }
}