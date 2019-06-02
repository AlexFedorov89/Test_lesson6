import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Ex3Test {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {
                        new ForTest(true, 1, 2, 3, 4, 5)
                },
                {
                        new ForTest(false,  2, 3, 5)
                },
                {
                        new ForTest(true,  2, 1, 3, 5)
                },
                {
                        new ForTest(true,  1, 2, 3, 4, 5)
                },
                {
                        new ForTest(false,  6, 7, 3, 4, 5)
                }
        });
    }

    private int[] source;
    private boolean expected;

    private Ex2AndEx3 ex2AndEx3;

    public Ex3Test(ForTest forTest) {
        this.source = forTest.getSource();
        this.expected = forTest.getResult();
    }

    @Before
    public void testStart() {
        ex2AndEx3 = new Ex2AndEx3();
    }

    @Test
    public void testMain() {
        Assert.assertEquals(this.expected, ex2AndEx3.checkArr(this.source));
    }

    public static class ForTest{

        private int[] source;
        private boolean result;

        public ForTest(boolean result, int ... source) {
            this.source = source;
            this.result = result;
        }

        public int[] getSource() {
            return source;
        }

        public boolean getResult() {
            return result;
        }
    }
}
