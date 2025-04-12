import org.junit.Test;
import static org.junit.Assert.*;

public class ParseTimeDurationTest {

    @Test
    public void testValidTimeDurationParsing() {
        // Test valid time durations
        assertEquals(60, TimeDurationParser.parse("1m"));
        assertEquals(3600, TimeDurationParser.parse("1h"));
        assertEquals(86400, TimeDurationParser.parse("1d"));
    }

    @Test
    public void testInvalidTimeDurationParsing() {
        // Test invalid time durations
        try {
            TimeDurationParser.parse("10XY");
            fail("Exception expected");
        } catch (Exception e) {
            // Test passes if exception is thrown
        }
    }
}
