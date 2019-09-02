package duke;

import duke.command.Command;
import duke.parser.ParserManager;
import duke.task.TaskList;

import java.util.Optional;
import java.util.Scanner;

public class Duke {
    private static TaskList taskList;
    private static ParserManager parserManager;
    private static DataStorage dataStorage;

    /**
     * Initialize static variables
     */
    public static void init() {
        dataStorage = new DataStorage();
        taskList = dataStorage.getStoredTaskList();
        parserManager = new ParserManager();
    }

    public static void main(String[] args) {
        Duke.init();
        Ui.printWelcomeMessage();
        runEvents();
        Ui.printGoodbyeMessage();
    }

    /**
     * Adds commands to lists and runs executes commands
     */
    private static void runEvents() {
        Scanner sc = new Scanner(System.in);
        String inputCommand = sc.nextLine().trim();
        while (!inputCommand.toLowerCase().equals("bye")) {
            Optional<Command> fullCommand = parserManager.parseCommand(taskList, inputCommand);
            fullCommand.ifPresent(command -> command.execute(taskList));
            dataStorage.storeTaskList(taskList);
            inputCommand = sc.nextLine().trim();
        }
    }
}
