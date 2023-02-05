package behavioral.state;

public class PupaState implements BugState {
    @Override
    public void nextState(Bug bug) {
        bug.setState(new ButterflyState());
    }

    @Override
    public void previousState(Bug bug) {
        bug.setState(new CaterpillarState());
    }
}
