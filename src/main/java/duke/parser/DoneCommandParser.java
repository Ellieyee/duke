package duke.parser;

import duke.command.Command;
import duke.command.DoneCommand;

import java.util.Optional;

public class DoneCommandParser {

    /**
     * Marks specified command based on idx of command and required format
     * @param commandDescription - array of strings containing command description
     * @param size - size of current tasklist
     * @return Optional containing either valid command or null (when exception thrown)
     * @throws RuntimeException - contains both NumberFormatException and IndexOutOfBoundsException
     */
    public static Optional<Command> parse(String[] commandDescription, int size) throws RuntimeException {
        int idx = Integer.parseInt(commandDescription[1]) - 1;
        if (idx >= size) { throw new IndexOutOfBoundsException(); }
        return Optional.of(new DoneCommand(idx));
    }
}