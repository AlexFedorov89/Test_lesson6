import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class Ex2TestException {
    private Ex2AndEx3 ex2AndEx3;

    @Before
    public void startTest(){
        ex2AndEx3 = new Ex2AndEx3();
    }

    @Test(expected = RuntimeException.class)
    public void testException() {
        Integer[] source = {1, 2, 3, 4};
        Integer[] result = {};
        Assert.assertArrayEquals(result, ex2AndEx3.arrHandle(source));
    }
}
