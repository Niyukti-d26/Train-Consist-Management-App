import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest extends TrainConsistManagementApp {
    @Test
    void testSearch_Found() {
        String[] arr = {"BG101", "BG205", "BG309"};

        assertTrue(linearSearch(arr, "BG205"));
    }

    @Test
    void testSearch_NotFound() {
        String[] arr = {"BG101", "BG205", "BG309"};

        assertFalse(linearSearch(arr, "BG999"));
    }

    @Test
    void testSearch_EarlyMatch() {
        String[] arr = {"BG101", "BG205", "BG309"};

        assertTrue(linearSearch(arr, "BG101")); // first element
    }
}