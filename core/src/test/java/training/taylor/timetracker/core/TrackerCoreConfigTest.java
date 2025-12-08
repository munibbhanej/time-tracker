package training.taylor.timetracker.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import training.taylor.timetracker.core.dao.TimeEntry;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = TrackerCoreConfig.class)
public class TrackerCoreConfigTest {

    @Autowired
    private Tracker tracker;

    @Test
    public void testMe() {
        TimeEntry entry = new TimeEntry();
        entry.setDescription("Test");
        tracker.add(entry);
        assertEquals(1, tracker.size());
    }
}
