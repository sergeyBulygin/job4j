package ru.job4j.sbulygin.statistics;

import java.util.Objects;

/**
 * Info class.
 * @author sbulygin.
 * @since 18.08.2018.
 * @version 1.0.
 */
public class Info {

    private int added;
    private int remote;
    private int changed;

    public Info(int added, int remote, int changed) {
        this.added = added;
        this.remote = remote;
        this.changed = changed;
    }

    @Override
    public String toString() {

        return String.format("Info: added = %s, remote = %s, changed = %s.", added, remote, changed);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Info info = (Info) o;
        return added == info.added
                && remote == info.remote
                && changed == info.changed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(added, remote, changed);
    }
}
