package behavioral.state;

public class ButterflyState implements BugState {
    @Override
    public void nextState(Bug bug) throws Exception {
        throw new Exception("Bug cannot progress from Butterfly state!");
    }

    @Override
    public void previousState(Bug bug) {
        bug.setState(new PupaState());
    }
}
