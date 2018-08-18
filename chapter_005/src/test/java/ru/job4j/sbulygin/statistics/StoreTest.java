package ru.job4j.sbulygin.statistics;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StoreTest {

    List<Store.User> first;
    List<Store.User> second;
    Store store = new Store();

    @Before
    public void prepareForTests() {
        first = new ArrayList<>();
        first.add(new Store.User(0, "Vasya"));
        first.add(new Store.User(1, "Petya"));
        first.add(new Store.User(2, "Liza"));
        first.add(new Store.User(3, "Serg"));
        first.add(new Store.User(4, "Vova"));
        first.add(new Store.User(5, "Olya"));
        second = new ArrayList<>();
        second.addAll(first);
    }

    @Test
    public void whenDeleteOneThenInStatisticsOneRemote() {
        second.remove(0);
        Info result = store.diff(first, second);
        Info expected = new Info(0, 1, 0);
        assertThat(result, is(expected));
    }

    @Test
    public void whenAddTwoThenInStatisticsTwoAdded() {
        second.add(new Store.User(6, "Sveta"));
        second.add(new Store.User(7, "Sasha"));
        Info result = store.diff(first, second);
        Info expected = new Info(2, 0, 0);
        assertThat(result, is(expected));
    }

    @Test
    public void whenChangeOneThenInStatisticsOneChanged() {
        second.set(2, new Store.User(2, "Petya Pupkin"));
        Info result = store.diff(first, second);
        Info expected = new Info(0, 0, 1);
        assertThat(result, is(expected));
    }

    @Test
    public void whenMultipleChangesThenInStatisticsAllChanges() {
        second.set(2, new Store.User(2, "Petya Pupkin"));
        second.add(new Store.User(6, "Sveta"));
        second.remove(5);
        second.remove(1);
        second.set(3, new Store.User(4, "Vova Pupkin"));
        Info result = store.diff(first, second);
        Info expected = new Info(1, 2, 2);
        assertThat(result, is(expected));
    }

}
