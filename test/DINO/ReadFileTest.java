package DINO;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReadFileTest {

    @Test
    public void testReadFileConstructor() {
        ReadFile reader = new ReadFile();
        assertNotNull(reader.data);
        assertTrue(reader.data.length() > 0);
        assertEquals("Hello world", reader.data.replaceAll("\\s", ""));
    }
}