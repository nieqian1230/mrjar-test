package demo.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CommonTest {
    @Test void versionMessage() {
        String message = Version.getMessage();
        assertEquals("Base version", message);
    }
}
