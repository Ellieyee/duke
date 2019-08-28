public class DoneCommand extends Command {
    private int idx;

    /**
     * Constructor
     * @param idx - Index of task to delete
     */
    public DoneCommand(int idx) {
        super(null);
        this.idx = idx;
    }

    /**
     * Execute done command on given task and save into tasklist
     * @param taskList - list containing all existing tasks
     */
    @Override
    public void execute(TaskList taskList) {
        Task task = taskList.get(idx);
        taskList.done(this.idx);
        UI.printSuccessfulDoneMessage(task);
    }
}
