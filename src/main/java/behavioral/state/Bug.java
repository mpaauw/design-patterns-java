package behavioral.state;

public class Bug {

    private BugState state;

    public Bug() {
        this.state = new CaterpillarState();
    }

    public BugState getState() {
        return this.state;
    }

    public void setState(BugState state) {
        this.state = state;
    }

    public void nextState() throws Exception {
        this.state.nextState(this);
    }

    public void previousState() throws Exception {
        this.state.previousState(this);
    }
}
