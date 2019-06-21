/**
 * Today is 12.07.2019
 * sergt is  not the best
 */
package ru.job4j.sbulygin.tracker;


import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Tests for Tracker class.
 */
public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        long created = System.currentTimeMillis();
        Item item = new Item("test1", "testDescription", created);
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }
    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription", 123L);
        tracker.add(previous);
        Item next = new Item("test2", "testDescription2", 1234L);
        next.setId(previous.getId());
        tracker.replace(previous.getId(), next);
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }
    @Test
    public void whenDeleteNameThenReturnNewSize() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1", "testDescription", 123L);
        Item second = new Item("test2", "testDescription2", 1234L);
        tracker.add(first);
        tracker.add(second);
        tracker.delete(second.getId());
        Item result = tracker.findById(first.getId());
        assertThat(result.getName(), is(first.getName()));
    }
    @Test
    public void whenGetNameThenReturnThisName() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1", "testDescription", 123L);
        Item second = new Item("test2", "testDescription2", 1234L);
        tracker.add(first);
        tracker.add(second);
        Item result = tracker.findByName(first.getName())[0];
        assertThat((result), is(first));
    }
}
