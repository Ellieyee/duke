package duke.command;
import duke.task.Task;
import duke.task.TaskList;

public class DeleteCommand extends Command {
    private int idx;
    public DeleteCommand(int idx) {
        super(null);
        this.idx = idx;
    }

    @Override
    public void execute(TaskList tasklist) {
        Task task = tasklist.get(this.idx);
        tasklist.delete(idx);
        UI.printSuccessDeleteTaskMessage(task, tasklist.size());
    }
}
