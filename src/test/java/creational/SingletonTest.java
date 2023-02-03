package creational;

import org.junit.Assert;
import org.junit.Test;

public class SingletonTest {

    @Test
    public void singleton_GetInstance_AssertSingleInstanceRetrieved() {
        // arrange / act
        final Singleton firstInstance = Singleton.getInstance();
        final Singleton secondInstance = Singleton.getInstance();

        // assert
        Assert.assertEquals(firstInstance, secondInstance);
    }

}
