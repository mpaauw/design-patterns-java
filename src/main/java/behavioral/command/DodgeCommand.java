package behavioral.command;

public class DodgeCommand implements GameCommand {

    private CommandReceiver receiver;

    public DodgeCommand(CommandReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public String execute() {
        return this.receiver.dodge();
    }
}
