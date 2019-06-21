package ru.job4j.sbulygin.tracker;

import java.util.Objects;

/**
 * Class Item.
 *
 * @author sbulygin.
 * @version 1.0.
 * @since 21.06.19.
 */
public class Item {

    private String id;
    private String name;
    private String desc;
    private Long time;

    public Item(String name, String desc, Long time) {
        this.name = name;
        this.desc = desc;
        this.time = time;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public Long getTime() {
        return time;
    }
    public void setTime(Long time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Item item = (Item) o;
        return id.equals(item.id)
                && name.equals(item.name)
                && desc.equals(item.desc)
                && time.equals(item.time);

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, desc, time);
    }
}
