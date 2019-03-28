package address;

/**
 * This class holds an enumeration of all command words known
 * to the program.
 */
@SuppressWarnings("ALL")
public class CommandWords {

    private static final String validCommands[] = {
            "add", "get", "search", "list", "remove", "help", "quit",
    };

    /**
     * Check whether a given String is a valid command word.
     *
     * @param command The string to be checked.
     * @return true if it is valid, false if it isn't.
     */
    public boolean isCommand(String command) {
        if (command != null) {
            for (int i = 0; i < validCommands.length; i++) {
                if (validCommands[i].equals(command))
                    return true;
            }
        }
        return false;
    }

    /**
     * Print all valid commands to System.out.
     */
    public void showAll() {
        for (String command : validCommands) {
            System.out.print(command + "  ");
        }
        System.out.println();
    }
}
