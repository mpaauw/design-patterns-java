package behavioral.command;

public class CommandInvoker {

    private GameCommand command;

    public CommandInvoker(GameCommand command) {
        this.command = command;
    }

    public void setCommand(GameCommand command) {
        this.command = command;
    }

    public String invokeCommand() {
        return this.command.execute();
    }

}
