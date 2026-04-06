package test.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import main.java.App;

public class AppTest {
    @Test
    public void testApp() {
        boolean result = App.verify(1234, 1234, 8520);
        System.out.println(result);
        assertEquals(true, result);
    }
}