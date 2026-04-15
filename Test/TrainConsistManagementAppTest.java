import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest {

    private List<TrainConsistManagementApp.Bogie> getBogies() {
        List<TrainConsistManagementApp.Bogie> list = new ArrayList<>();
        list.add(new TrainConsistManagementApp.Bogie("Sleeper", 72));
        list.add(new TrainConsistManagementApp.Bogie("AC Chair", 56));
        list.add(new TrainConsistManagementApp.Bogie("First Class", 24));
        list.add(new TrainConsistManagementApp.Bogie("Sleeper", 70));
        return list;
    }

    @Test
    void testTotalCapacity_NormalCase() {
        int result = TrainConsistManagementApp.calculateTotalCapacity(getBogies());
        assertEquals(222, result);  // 72 + 56 + 24 + 70
    }

    @Test
    void testTotalCapacity_EmptyList() {
        List<TrainConsistManagementApp.Bogie> empty = new ArrayList<>();
        int result = TrainConsistManagementApp.calculateTotalCapacity(empty);
        assertEquals(0, result);
    }

    @Test
    void testTotalCapacity_SingleBogie() {
        List<TrainConsistManagementApp.Bogie> list = new ArrayList<>();
        list.add(new TrainConsistManagementApp.Bogie("Sleeper", 72));

        int result = TrainConsistManagementApp.calculateTotalCapacity(list);
        assertEquals(72, result);
    }

    @Test
    void testTotalCapacity_ZeroCapacity() {
        List<TrainConsistManagementApp.Bogie> list = new ArrayList<>();
        list.add(new TrainConsistManagementApp.Bogie("Sleeper", 0));
        list.add(new TrainConsistManagementApp.Bogie("AC Chair", 0));

        int result = TrainConsistManagementApp.calculateTotalCapacity(list);
        assertEquals(0, result);
    }
}