package creational.builder;

import creational.builder.sample.Pizza;
import org.junit.Assert;
import org.junit.Test;

public class BuilderTests {

    @Test
    public void test() {
        Pizza zza = new Pizza.Builder().cheese(true).sauce(true).bread(true).build();
        Assert.assertTrue(zza.hasCheese());
        Assert.assertTrue(zza.hasSauce());
        Assert.assertTrue(zza.hasBread());
        Assert.assertFalse(zza.hasMeat());
    }

}
