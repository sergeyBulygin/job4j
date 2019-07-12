/**
 * Today is 12.07.2019
 * sergt is  not the best
 */
package ru.job4j.sbulygin.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    /**
     * Array for items.
     */
    private Item[] items = new Item[100];
    /**
     * Position new item in array.
     */
    private int position = 0;
    /**
     * Random value for generate id.
     */
    private static final Random RN = new Random();

    /**
     * Generate id.
     * @return id.
     */
    private String generateId() {
        return String.valueOf(RN.nextInt(10000));
    }

    /**
     * Method add item/
     * @param item item.
     * @return new item.
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }
    /**
      * Method replace item.
      */
    public boolean replace(String id, Item item) {
        boolean result = false;
        for (Item temp : this.items) {
            if (item.getId().equals(id)) {
                temp.setName(item.getName());
                temp.setDesc(item.getDesc());
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Method delete item.
     * @param id id item.
     * @return boolean result.
     */
    public boolean delete(String id) {
        boolean result = false;
        for (int index = 0; index < position; index++) {
            if (this.items[index].getId().equals(id)) {
                result = true;
                System.arraycopy(this.items, index + 1,  this.items, index, position - index);
                position--;
                break;
            }
        }
        return result;

    }

    /**
     * Method find all items.
     * @return array items.
     */
     public Item[] findAll() {
        return Arrays.copyOf(this.items, position);
    }

    /**
     * Method find item by name.
     * @param key name.
     * @return array with item.
     */
    public Item[] findByName(String key) {
        Item[] result = new Item[this.items.length];
        for (int index = 0; index < this.items.length; index++) {
           if (this.items[index].getName().equals(key)) {
                result[index] = this.items[index];
                break;
           }
        }
        return result;
    }

    /**
     * Method find item by id.
     * @param id id
     * @return item.
     */
    public Item findById(String id) {
        Item result = null;
        for (Item item : this.items) {
            if (item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }
}
