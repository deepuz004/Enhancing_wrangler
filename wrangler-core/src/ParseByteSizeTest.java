import org.junit.Test;
import static org.junit.Assert.*;

public class ParseByteSizeTest {

    @Test
    public void testValidByteSizeParsing() {
        // Test valid byte sizes
        assertEquals(1024, ByteSizeParser.parse("1KB"));
        assertEquals(1048576, ByteSizeParser.parse("1MB"));
        assertEquals(1073741824, ByteSizeParser.parse("1GB"));
    }

    @Test
    public void testInvalidByteSizeParsing() {
        // Test invalid byte sizes
        try {
            ByteSizeParser.parse("10XY");
            fail("Exception expected");
        } catch (Exception e) {
            // Test passes if exception is thrown
        }
    }
}
