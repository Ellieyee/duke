package duke.command;
import duke.task.Task;
import duke.task.TaskList;

public abstract class Command {
    private Task task;
    public Command(Task task) {
        this.task = task;
    }

    public abstract void execute(TaskList tasklist);
}
