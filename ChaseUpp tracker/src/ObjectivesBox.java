import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ObjectivesBox {

    private HashMap<String, Integer> objectives;

    public ObjectivesBox() {
        objectives = new HashMap<>();
    }

    // Add or update an objective with its completion percentage
    public void setObjective(String name, int percentage) {
        if (percentage < 0) percentage = 0;
        if (percentage > 100) percentage = 100;
        objectives.put(name, percentage);
    }

    // Add an objective using keyboard input
    public void setObjectiveFromKeyboard(Scanner keyboard, String message) {
        System.out.println(message);
        System.out.print("Enter objective name: ");
        String name = keyboard.nextLine();

        System.out.print("Enter percentage of completion (0-100): ");
        int percentage = Integer.parseInt(keyboard.nextLine());

        setObjective(name, percentage);
        System.out.println("Objective added successfully!");
    }

    // Delete an objective by name
    public void deleteObjective(String name) {
        if (objectives.containsKey(name)) {
            objectives.remove(name);
            System.out.println("Objective \"" + name + "\" deleted.");
        } else {
            System.out.println("Objective not found!");
        }
    }

    // Delete from keyboard input
    public void deleteObjectiveFromKeyboard(Scanner keyboard, String message) {
        System.out.println(message);
        if (objectives.isEmpty()) {
            System.out.println("No objectives to delete.");
            return;
        }

        printObjectives();
        System.out.print("Enter the name of the objective to delete: ");
        String name = keyboard.nextLine();
        deleteObjective(name);
    }

    // Update completion for all objectives at once (for example, after evaluation)
    public void evaluateObjective(int percentageOfCompletion) {
        for (String key : objectives.keySet()) {
            int current = objectives.get(key);
            int newPercentage = Math.min(100, current + percentageOfCompletion);
            objectives.put(key, newPercentage);
        }
        System.out.println("All objectives updated by +" + percentageOfCompletion + "%");
    }

    public void evaluateObjectiveFromKeyboard(Scanner keyboard, String message) { //needs revision
        if (objectives.isEmpty()) {
            System.out.println("No objects up to evaluation.\n");
            return;
        }

        System.out.println(message);
        printObjectives();
        System.out.print("Introduce el porcentaje a ajustar (puede ser negativo): ");
        int adjustment = Integer.parseInt(keyboard.nextLine());

        evaluateObjective(adjustment);
    }


    // Pretty print the objectives
    public void printObjectives() {
        if (objectives.isEmpty()) {
            System.out.println("No objectives available!");
            return;
        }

        System.out.println("________________________________________\n");

        for (Map.Entry<String, Integer> entry : objectives.entrySet()) {
            String name = entry.getKey();
            int percentage = entry.getValue();

            int barLength = percentage / 5; // 20 total steps = 100%
            StringBuilder bar = new StringBuilder();
            for (int i = 0; i < 20; i++) {
                if (i < barLength) bar.append("█");
                else bar.append("_");
            }

            System.out.printf("%-10s |%s| %3d%%\n", name, bar.toString(), percentage);
        }

        System.out.println("________________________________________\n");
    }

}
