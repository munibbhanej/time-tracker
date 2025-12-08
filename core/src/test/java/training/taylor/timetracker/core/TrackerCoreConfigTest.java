package training.taylor.timetracker.core;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import training.taylor.timetracker.core.dao.TimeEntry;

import static org.junit.Assert.assertEquals;

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
