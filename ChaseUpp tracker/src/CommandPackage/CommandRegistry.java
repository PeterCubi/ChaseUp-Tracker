package CommandPackage;
import java.util.ArrayList;
import java.util.HashMap;

public class CommandRegistry {

    // se deben inicializar los comandos en el main para después meterlos en el registro.

    HashMap<String, Command> commands;

    public CommandRegistry() {
        commands = new HashMap<String, Command>();
    }

    public void registerCommand(Command command){
        commands.put(command.getName(), command);
    }
    public Command getCommand(String commandName){
        return commands.get(commandName);
    }
    public ArrayList<Command> getAllCommands(){
        return new ArrayList<>(commands.values());
    }

    public void list() {
        System.out.println("Lista de comandos ");

        // Obtenemos todos los comandos en un ArrayList
        ArrayList<Command> listaComandos = getAllCommands();

        // Recorremos con un for clásico usando índice
        for (int i = 0; i < listaComandos.size(); i++) {
            Command cmd = listaComandos.get(i);
            System.out.println(" - " + cmd.getName());
        }

        System.out.println("");
    }
}


