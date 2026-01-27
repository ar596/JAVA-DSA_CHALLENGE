import java.util.*;

class prob122 {
    LinkedHashMap<Integer, Integer> map;

    prob122(int cap) {
        map = new LinkedHashMap<>(cap, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry e) {
                return size() > cap;
            }
        };
    }

    void put(int k, int v) {
        map.put(k, v);
    }

    int get(int k) {
        return map.getOrDefault(k, -1);
    }

    public static void main(String[] args) {
        prob122 lru = new prob122(2);
        lru.put(1, 10);
        lru.put(2, 20);
        lru.get(1);
        lru.put(3, 30);
        System.out.println(lru.map);
    }
}
