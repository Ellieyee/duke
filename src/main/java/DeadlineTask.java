public class DeadlineTask extends Task {
    private static final String DEFAULT_DEADLINE_ICON = "[D]";
    private static final String DEADLINE_TASK_STATEMENT = "by";
    private static final String DEADLINE_TASK_TYPE = "Deadline";
    private String deadLine;

    /**
     * Constructor
     * @param taskName - Name of task
     * @param deadLine - Deadline of task
     */
    public DeadlineTask(String taskName, String deadLine) {
        super(taskName, DEFAULT_DEADLINE_ICON, DEADLINE_TASK_TYPE);
        this.deadLine = deadLine;
    }

    /**
     * Verifies that given statement complies with the required Deadline format
     * @param statement - String containing expected statement
     * @throws IncorrectStatementException - thrown if the verification fails
     */
    public static void verifyTaskStatement(String statement) throws IncorrectStatementException {
        if (!statement.equals(DEADLINE_TASK_STATEMENT)) {
            throw new IncorrectStatementException(statement, DEADLINE_TASK_STATEMENT);
        }
    }

    /** Returns the task deadline **/
    public String getDeadline() {
        return this.deadLine;
    }

    @Override
    public String toString() {
        return super.toString() + " (by: " + this.deadLine + ")";
    }
}
