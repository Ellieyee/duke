package duke.command;
import duke.task.Task;
import duke.task.TaskList;
import duke.command.Command;

public class ListCommand extends Command {
    public ListCommand() {
        super(null);
    }

    @Override
    public void execute(TaskList tasklist) {
        tasklist.print();
    }
}
