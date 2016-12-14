package exercise2;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author vgup77
 *
 */
public class PerfectNumCheckTest {

    /**
     * 
     */
    @Test
    public final void testSuccessWhenPositiveNumberIsPassed() {
        PerfectNumCheck.perfectNumberCheck(6);
    }

    @Test
    public final void testSuccessWhenZeroIsPassed() {
        PerfectNumCheck.perfectNumberCheck(0);
        
    }

    @Test
    public final void testSuccessWhenNegativeNumberIsPassed() {
        PerfectNumCheck.perfectNumberCheck(-7);
    }

    @Test
    public final void whenPerfectNumberisPassedThenReturnTrue() {
        assertTrue(PerfectNumCheck.perfectNumberCheck(28));
    }

    @Test
    public final void whenNonPerfectNumberisPassedThenReturnFalse() {
        assertFalse(PerfectNumCheck.perfectNumberCheck(281));
    }
    
    @Test
    public final void whenZeroisPassedThenReturnFalse() {
        assertFalse(PerfectNumCheck.perfectNumberCheck(0));
    }

}
