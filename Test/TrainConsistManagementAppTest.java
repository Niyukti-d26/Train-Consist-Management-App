import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest extends TrainConsistManagementApp {

    @Test
    void testValidCapacity() throws InvalidCapacityException {
        PassengerBogie bogie = new PassengerBogie("Sleeper", 72);
        assertEquals(72, bogie.capacity);
    }

    @Test
    void testNegativeCapacityThrowsException() {
        assertThrows(InvalidCapacityException.class, () -> {
            new PassengerBogie("AC Chair", -5);
        });
    }

    @Test
    void testZeroCapacityThrowsException() {
        assertThrows(InvalidCapacityException.class, () -> {
            new PassengerBogie("First Class", 0);
        });
    }
}