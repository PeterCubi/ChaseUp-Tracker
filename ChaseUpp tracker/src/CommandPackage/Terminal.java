package CommandPackage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Terminal {

    //se debe inicializar cada objeto comando previamente, insertarlos en el registro y después ya se puede crear la terminal
    private CommandRegistry registry;
    private boolean running; //atributo que se usará para que exit maneje la terminal


    public Terminal(CommandRegistry registry) {
        this.registry = registry;
    }

    public void start() {
        Scanner keyBoard = new Scanner(System.in);
        running = true;

        while (running) {
            System.out.print("tUPM> ");
            String line = keyBoard.nextLine().trim();
            if (line.isEmpty()) continue;

            // Parte el String en substrings y los mete en un array de nombre args.
            // IMPORTANTE: los comandos reciben los argumentos de esta manera sin mayor modificación.
            // (para evitar complicaciones innecesarias)


            //String[] args = line.split(" ");
            String[] args = line.split(" (?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");

            String nameOfCommand = args[0];

            if (args.length > 1) {
                nameOfCommand += " " + args[1];  // El nombre completo de algunos comandos (como "prod add")

                //vamos a hacer una caso excepcional del comando echo, si no no va a ser llamado.
                if (args[0].equals("echo")) {
                    nameOfCommand = "echo";
                }
            }

            Command command = registry.getCommand(nameOfCommand);

            if (command != null) {
                command.execute(args);
                System.out.println();
            } else {
                System.out.println("Unknown command. Type 'help'.");
                System.out.println();
            }
        }
    }

    public void startFromFile(String filePath) {
        try (Scanner fileScanner = new Scanner(new File(filePath))) {
            running = true;
            while (running && fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine().trim();
                if (line.isEmpty()) continue;

                // Parseamos igual que en start()
                String[] args = line.split(" (?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
                String name = args[0];

                if (args.length > 1) {
                    name += " " + args[1]; // Comandos como "prod add"
                    if (args[0].equalsIgnoreCase("echo")) {
                        name = "echo";
                    }
                }

                Command command = registry.getCommand(name);
                if (command != null) {
                    command.execute(args);
                    System.out.println();
                } else {
                    System.out.println("Unknown command in file: " + line);
                    System.out.println();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        }
    }
    public void setRunning ( boolean running){
        this.running = running;
    }

}
