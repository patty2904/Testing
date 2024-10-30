import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UnitTest {

    @Test
    public void simple() {
        boolean pass = true;
        String error = " ";
        int a = 20;
        int b = 20;
        if (a > b) {
            pass = false;
            error = "Value a must be < b";
        } else if (a == b){
            pass = false;
            error = "value a is the same as b - must be less";
        }
        assertTrue(pass, error);
    }

    @Test
    public void simpleList() {
        int[] a = {10, 20, 40};
        int[] b = {10, 20, 30};

        assertArrayEquals(a, b, "arrays dont match");
    }
}
