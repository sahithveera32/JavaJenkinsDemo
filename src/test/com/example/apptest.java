
package test.com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import main.com.example.App;

public class AppTest {

    @Test
    public void testAdd() {
        int result = App.add(2, 3);

        assertEquals(5, result);
    }
}
