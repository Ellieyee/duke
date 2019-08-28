package duke.exception;

public class InvalidCommandError extends UnknownCommandException {
    private String message;

    /**
     * Constructor
     * @param message - Given message input by user
     */
    public InvalidCommandError(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return "☹ OOPS!!! The statement: \"" + this.message + "\" is invalid. ";
    }
}
