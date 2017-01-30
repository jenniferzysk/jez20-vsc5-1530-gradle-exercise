import org.junit.Test;
import static org.junit.Assert.*;

public class IntegerSequenceTest {
    @Test
    public void testLazy1() {
        assertEquals(IntegerSequences.lazy(1), 2);
    }
    
    @Test
    public void testLazy2() {
        assertEquals(IntegerSequences.lazy(2), 4);
    }
    
    @Test
    public void testLazy3() {
        assertEquals(IntegerSequences.lazy(3), 7);
    }
    
    @Test
    public void testTriangle1() {
        assertEquals(IntegerSequences.triangle(1), 1);
    }
    
    @Test
    public void testTriangle2() {
        assertEquals(IntegerSequences.triangle(2), 3);
    }
    
    @Test
    public void testTriangle3() {
        assertEquals(IntegerSequences.triangle(3), 6);
    }
}
