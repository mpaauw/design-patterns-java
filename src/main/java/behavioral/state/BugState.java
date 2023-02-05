package behavioral.state;

public interface BugState {
    public void nextState(Bug bug) throws Exception;
    public void previousState(Bug bug) throws Exception;
}
