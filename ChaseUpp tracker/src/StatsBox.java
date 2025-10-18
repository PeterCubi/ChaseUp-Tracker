import java.util.ArrayList;
import java.util.Scanner;

public class StatsBox {

    private ArrayList<Stat> statsList;

    public StatsBox() {
        statsList = new ArrayList<>();
    }

    // Add a stat
    public void addStat(Stat stat) {
        statsList.add(stat);
    }

    // Add stat from keyboard
    public void addStatFromKeyboard(Scanner keyboard, String message) {
        System.out.println(message);
        System.out.print("Enter name: ");
        String name = keyboard.nextLine();
        System.out.print("Enter description: ");
        String description = keyboard.nextLine();
        System.out.print("Is it objective? (true/false): ");
        boolean objective = Boolean.parseBoolean(keyboard.nextLine());
        System.out.print("Enter grade (0.0 - 10.0): ");
        double grade = Double.parseDouble(keyboard.nextLine());

        statsList.add(new Stat(name, description, grade, objective));
    }

    // Delete a stat by index
    public void deleteStat(int index) {
        if (index >= 0 && index < statsList.size()) {
            statsList.remove(index);
        } else {
            System.out.println("Invalid index!");
        }
    }

    // Delete stat from keyboard
    public void deleteStatFromKeyboard(Scanner keyboard, String message) {
        System.out.println(message);
        for (int i = 0; i < statsList.size(); i++) {
            System.out.println(i + ": " + statsList.get(i).getName());
        }
        System.out.print("Enter index to delete: ");
        int index = Integer.parseInt(keyboard.nextLine());
        deleteStat(index);
    }

    // Print stats with cool format
    public void printStats() {
        if (statsList.isEmpty()) {
            System.out.println("No stats available!");
            return;
        }

        // Print grades
        for (Stat stat : statsList) {
            System.out.print("___________");
        }
        System.out.println("");
        System.out.print("  ");//adjust
        for (Stat stat : statsList) {
            System.out.printf("%-11.1f", stat.getGrade());
        }
        System.out.println("  Objective grade: " + calculateAverage(true));
        System.out.println();

        // Print bars
        int maxLines = 10;
        for (int line = maxLines; line > 0; line--) {
            for (Stat stat : statsList) {
                int filled = (int) Math.round(stat.getGrade() / 10.0 * maxLines);
                System.out.print(filled >= line ? "  | |      " : "           ");
            }
            System.out.println();
        }

        // Print stat names
        for (Stat stat : statsList) {
            System.out.printf("%-11s", stat.getName());
        }
        System.out.println();
        for (Stat stat : statsList) {
            System.out.print("___________");
        }
        System.out.println();
    }

    private double calculateAverage(boolean objective) {
        double sum = 0;
        int count = 0;
        for (Stat stat : statsList) {
            if (stat.isObjective() == objective) {
                sum += stat.getGrade();
                count++;
            }
        }
        return count == 0 ? 0 : sum / count;
    }
}

