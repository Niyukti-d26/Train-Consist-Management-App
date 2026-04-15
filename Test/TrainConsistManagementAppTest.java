import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest {

    @Test
    void testBinarySearch_Found() {
        String[] arr = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        boolean result = TrainConsistManagementApp.binarySearch(arr, "BG309");

        assertTrue(result);
    }

    @Test
    void testBinarySearch_NotFound() {
        String[] arr = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        boolean result = TrainConsistManagementApp.binarySearch(arr, "BG999");

        assertFalse(result);
    }

    @Test
    void testBinarySearch_EmptyArray() {
        String[] arr = {};

        boolean result = TrainConsistManagementApp.binarySearch(arr, "BG101");

        assertFalse(result);
    }

    @Test
    void testBinarySearch_SingleElement_Found() {
        String[] arr = {"BG101"};

        boolean result = TrainConsistManagementApp.binarySearch(arr, "BG101");

        assertTrue(result);
    }

    @Test
    void testBinarySearch_SingleElement_NotFound() {
        String[] arr = {"BG101"};

        boolean result = TrainConsistManagementApp.binarySearch(arr, "BG999");

        assertFalse(result);
    }

    @Test
    void testBinarySearch_CaseSensitive() {
        String[] arr = {"BG101", "BG205", "BG309"};

        boolean result = TrainConsistManagementApp.binarySearch(arr, "bg309");

        assertFalse(result);
    }

    @Test
    void testBinarySearch_UnsortedArray() {
        String[] arr = {"BG309", "BG101", "BG205"};

        boolean result = TrainConsistManagementApp.binarySearch(arr, "BG309");

        assertFalse(result);
    }
}