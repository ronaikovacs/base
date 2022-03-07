package hu.bme.mit.train.tachograph;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TachographTest {
    Tachograph t;

    @Before
    public void before() {
        t = new Tachograph();
        t.add(2, 3);
    }
    @Test
    public void notEmptyTest() {
        Assert.assertFalse(t.database.isEmpty());
    }
}