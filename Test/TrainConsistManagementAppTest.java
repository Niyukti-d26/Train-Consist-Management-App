import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest extends TrainConsistManagementApp {

    @Test
    void testSearch_EmptyArrayThrowsException() {
        String[] arr = {};

        assertThrows(IllegalStateException.class, () -> {
            searchBogie(arr, "BG101");
        });
    }

    @Test
    void testSearch_WithData() {
        String[] arr = {"BG101", "BG205"};

        assertTrue(searchBogie(arr, "BG101"));
    }

    @Test
    void testSearch_NotFound() {
        String[] arr = {"BG101", "BG205"};

        assertFalse(searchBogie(arr, "BG999"));
    }
}