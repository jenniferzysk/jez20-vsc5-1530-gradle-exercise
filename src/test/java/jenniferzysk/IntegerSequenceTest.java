import org.junit.Test;
import static org.junit.Assert.*;
import jenniferzysk.integerSequences;

public class IntegerSequenceTest {
    @Test
    public void testLazy1() {
        assertEquals(integerSequences.lazy(1), 2);
    }
    
    @Test
    public void testLazy2() {
        assertEquals(integerSequences.lazy(2), 4);
    }
    
    @Test
    public void testLazy3() {
        assertEquals(integerSequences.lazy(3), 7);
    }
    
    @Test
    public void testTriangle1() {
        assertEquals(integerSequences.triangle(1), 1);
    }
    
    @Test
    public void testTriangle2() {
        assertEquals(integerSequences.triangle(2), 3);
    }
    
    @Test
    public void testTriangle3() {
        assertEquals(integerSequences.triangle(3), 6);
    }
}
