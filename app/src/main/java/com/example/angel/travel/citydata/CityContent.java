package com.example.angel.travel.citydata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class CityContent {

    /**
     * An array of sample (dummy) items.
     */
    public static List<CityItem> ITEMS = new ArrayList<>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, CityItem> ITEM_MAP = new HashMap<>();

    static {
        // Add 3 sample items.
        addItem(new CityItem("1", "New York", "https://en.wikipedia.org/wiki/New_York"));

        addItem(new CityItem("2", "Cairo", "https://en.wikipedia.org/wiki/Cairo"));
        addItem(new CityItem("3", "Paris", "https://en.wikipedia.org/wiki/Paris"));
    }

    private static void addItem(CityItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class CityItem {
        public String id;
        public String name;
        public String url;

        public CityItem(String id, String name, String url) {
            this.id = id;
            this.name = name;
            this.url= url;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
