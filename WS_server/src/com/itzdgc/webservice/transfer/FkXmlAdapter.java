package com.itzdgc.webservice.transfer;

import com.itzdgc.webservice.domain.Cat;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//该转换器负责完成Map<String,Cat 和StringCat的相互相转换
public class FkXmlAdapter extends XmlAdapter<FkXmlAdapter.Data,Map<String,Cat>> {


    @Override
    public Map<String, Cat> unmarshal(Data v) throws Exception {
        Map<String, Cat> map = new HashMap<String, Cat>();
        for (Data.Entry entry : v.getEntries()) {
            map.put(entry.getKey(), entry.getValue());
        }
        return map;
    }

    @Override
    public Data marshal(Map<String, Cat> v) throws Exception {

        Data data = new Data();
        for (Map.Entry<String, Cat> entry : v.entrySet()) {
            Data.Entry en = new Data.Entry(entry.getKey(), entry.getValue());
            data.getEntries().add(en);
        }
            return data;

    }

    public static class Data {
        private List<Entry> entries = new ArrayList<Entry>();

        public List<Entry> getEntries() {
            return entries;
        }

        public void setEntries(List<Entry> entries) {
            this.entries = entries;
        }

        public static class Entry {
            private String key;
            private Cat value;
            public Entry(String key, Cat value) {
                this.key = key;
                this.value = value;
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
}
