package b3ls;

import org.junit.Assert;
import org.junit.Test;

public class SameResultEachTimeAdditionTest {

    @Test
    public void add() throws Exception {
        Addition standardAddition = new SameResultEachTimeAddition();

        int result = standardAddition.add(1, 2);

        Assert.assertEquals(3, result);
    }

    @Test
    public void add_test2() throws Exception {
        Addition standardAddition = new SameResultEachTimeAddition();

        int result = standardAddition.add(5, 2);

        Assert.assertEquals(7, result);
    }
}