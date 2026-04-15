import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest extends TrainConsistManagementApp {

    @Test
    void testBubbleSort_Basic() {
        int[] arr = {72, 56, 24};

        bubbleSort(arr);

        assertArrayEquals(new int[]{24, 56, 72}, arr);
    }

    @Test
    void testBubbleSort_AlreadySorted() {
        int[] arr = {10, 20, 30};

        bubbleSort(arr);

        assertArrayEquals(new int[]{10, 20, 30}, arr);
    }

    @Test
    void testBubbleSort_Duplicates() {
        int[] arr = {50, 20, 50, 10};

        bubbleSort(arr);

        assertArrayEquals(new int[]{10, 20, 50, 50}, arr);
    }
}