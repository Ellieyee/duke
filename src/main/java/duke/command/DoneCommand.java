package duke.command;
import duke.task.Task;
import duke.task.TaskList;
import duke.command.Command;

public class DoneCommand extends Command {
    private int idx;
    public DoneCommand(int idx) {
        super(null);
        this.idx = idx;
    }

    @Override
    public void execute(TaskList taskList) {
        Task task = taskList.get(idx);
        taskList.done(this.idx);
        UI.printSuccessfulDoneMessage(task);
    }
}
