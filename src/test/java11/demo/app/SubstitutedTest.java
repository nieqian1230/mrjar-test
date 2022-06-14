package demo.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SubstitutedTest {
    @Test void versionMessage() {
        String message = Version.getMessage();
        assertEquals("Java 11 version", message);
    }
}
