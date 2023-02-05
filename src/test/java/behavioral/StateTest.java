package behavioral;

import behavioral.state.Bug;
import behavioral.state.ButterflyState;
import behavioral.state.CaterpillarState;
import behavioral.state.PupaState;
import org.junit.Assert;
import org.junit.Test;

public class StateTest {

    @Test
    public void state_Bug_AssertStateProgressesCorrectly() throws Exception {
        // arrange
        Bug bug = new Bug();

        // act / assert
        Assert.assertTrue(bug.getState() instanceof CaterpillarState);
        bug.nextState();
        Assert.assertTrue(bug.getState() instanceof PupaState);
        bug.nextState();
        Assert.assertTrue(bug.getState() instanceof ButterflyState);
    }

    @Test
    public void state_Bug_AssertStateRegressesCorrectly() throws Exception {
        // arrange
        Bug bug = new Bug();
        bug.nextState();
        bug.nextState();

        // act / assert
        Assert.assertTrue(bug.getState() instanceof ButterflyState);
        bug.previousState();
        Assert.assertTrue(bug.getState() instanceof PupaState);
        bug.previousState();
        Assert.assertTrue(bug.getState() instanceof CaterpillarState);
    }

    @Test(expected = Exception.class)
    public void state_Bug_AssertStateCannotProgressBeyondFinalState() throws Exception {
        // arrange
        Bug bug = new Bug();
        bug.nextState();
        bug.nextState();

        // act / assert
        bug.nextState();
    }

    @Test(expected = Exception.class)
    public void state_Bug_AssertStateCannotRegressBeforeInitialState() throws Exception {
        // arrange
        Bug bug = new Bug();

        // act / assert
        bug.previousState();
    }

}
