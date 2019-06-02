import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Ex2Test {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Integer[][][]{
                {
                        {1, 2, 4, 1},
                        {1}
                },
                {
                        {1, 2, 4, 4, 2, 3, 4, 1, 7},
                        {1, 7}
                },
                {
                        {5, 4, 4, 4, 3, 2, 1},
                        {3, 2, 1}
                }
        });
    }

    private Integer[] source, expected;
    private Ex2AndEx3 ex2AndEx3;

    public Ex2Test(Integer[] src, Integer[] exp) {
        this.source = src;
        this.expected = exp;
    }

    @Before
    public void testStart() {
        ex2AndEx3 = new Ex2AndEx3();
    }

    @Test
    public void testMain() {
        Assert.assertArrayEquals(this.expected, ex2AndEx3.arrHandle(this.source));
    }
}
