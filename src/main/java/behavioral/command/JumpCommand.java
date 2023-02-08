package behavioral.command;

public class JumpCommand implements GameCommand {

    private CommandReceiver receiver;

    public JumpCommand(CommandReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public String execute() {
        return this.receiver.jump();
    }
}
