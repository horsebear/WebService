package com.itzdgc.webservice.transfer;

import com.itzdgc.webservice.domain.Cat;

import java.util.List;

public class StringCat {
    private List<Entry> entries;

    public List<Entry> getEntries() {
        return entries;
    }

    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }

    public static class Entry {
        private String key;
        private Cat value;

        public Entry(){}

        public Entry(String key, Cat cat) {
            this.key=key;
            this.value=cat;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public Cat getValue() {
            return value;
        }

        public void setValue(Cat value) {
            this.value = value;
        }
    }
}
