package ru.job4j.sbulygin.statistics;

import java.util.*;

/**
 * Store class.
 * @author sbulygin.
 * @since 18.08.2018.
 * @version 1.0.
 */
public class Store {

    /**
     * The method displays statistics on changes in the collection.
     * @param previous previous collection.
     * @param current current collection.
     * @return statistics.
     */
    public Info diff(List<User> previous, List<User> current) {

        Map<Integer, String> map = new HashMap<>();

        int added = 0;
        int changed = 0;

        for (User user : previous) {
            map.put(user.id, user.name);
        }
        for (User user : current) {
            if (map.containsKey(user.id)) {
                if (!map.get(user.id).equals(user.name)) {
                    changed++;
                }
            } else {
                added++;
            }
        }
        int remote = previous.size() + added - current.size();
        return new Info(added, remote, changed);
    }


    static class User {
        private int id;
        private String name;

        User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            User user = (User) o;
            return id == user.id && Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }

        @Override
        public String toString() {
            return String.format("User: id = %s, name = %s.", id, name);
        }
    }


}