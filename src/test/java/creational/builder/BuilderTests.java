package creational.builder;

import creational.builder.sample.Pizza;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BuilderTests {

    @Test
    public void test() {
        Pizza zza = new Pizza.Builder().cheese(true).sauce(true).bread(true).build();
        Assert.assertTrue(zza.hasCheese());
        Assert.assertTrue(zza.hasSauce());
        Assert.assertTrue(zza.hasBread());
        Assert.assertFalse(zza.hasMeat());
    }

    public boolean isPerm(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }
        s1 = sortString(s1);
        s2 = sortString(s2);

        for(int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if(c1 != c2) {
                return false;
            }
        }

        return true;
    }

    private String sortString(String s) {
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        return new String(charArr);
    }



}
