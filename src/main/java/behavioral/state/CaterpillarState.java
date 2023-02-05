package behavioral.state;

public class CaterpillarState implements BugState {

    @Override
    public void nextState(Bug bug) {
        bug.setState(new PupaState());
    }

    @Override
    public void previousState(Bug bug) throws Exception {
        throw new Exception("Bug cannot regress from Caterpillar state!");
    }
}
