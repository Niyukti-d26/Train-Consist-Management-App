import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest extends TrainConsistManagementApp {

    // Helper data
    private List<Bogie> getBogies() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("Sleeper", 70));
        list.add(new Bogie("AC Chair", 56));
        list.add(new Bogie("First Class", 24));
        return list;
    }

    // Test 1
    @Test
    void testGrouping_BogiesGroupedByType() {

        Map<String, List<Bogie>> result = groupBogiesByType(getBogies());

        assertEquals(2, result.get("Sleeper").size()); // two sleeper bogies
    }

    // Test 2:
    @Test
    void testGrouping_DifferentBogieTypes() {

        Map<String, List<Bogie>> result = groupBogiesByType(getBogies());

        assertTrue(result.containsKey("AC Chair"));
        assertTrue(result.containsKey("First Class"));
    }

    // Test 3
    @Test
    void testGrouping_EmptyBogieList() {

        List<Bogie> empty = new ArrayList<>();

        Map<String, List<Bogie>> result = groupBogiesByType(empty);

        assertTrue(result.isEmpty());
    }
}