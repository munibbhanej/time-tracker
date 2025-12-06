@RunWith(SpringJUnit4ClassRunner.class)
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
