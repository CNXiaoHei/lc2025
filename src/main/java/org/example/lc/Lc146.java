package org.example.lc;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Lc146 {
    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1, 1);
        lruCache.put(2, 2);
        int i = lruCache.get(1);
        System.out.println(i);
        lruCache.put(3, 3);
        i = lruCache.get(2);
        System.out.println(i);
    }

    static class LRUCache {

        public class Data {
            int key;

            int value;
            long ms;
        }

        private PriorityQueue<Data> priorityQueue;

        private Map<Integer, Data> map = new HashMap<>();

        private int capacity;

        private int step;

        public LRUCache(int capacity) {
            priorityQueue = new PriorityQueue<>((o1, o2) -> Math.toIntExact(o1.ms - o2.ms));
            this.capacity = capacity;
            step = 0;
        }

        public int get(int key) {
            if (map.containsKey(key)) {
                Data data = map.get(key);
                priorityQueue.remove(data);
                data.ms = step++;
                priorityQueue.offer(data);
                return data.value;
            }else {
                return -1;
            }
        }

        public void put(int key, int value) {
            if (capacity == priorityQueue.size() && !map.containsKey(key)) {
                Data poll = priorityQueue.poll();
                map.remove(poll.key);
            }
            Data data;
            if (map.containsKey(key)) {
                data = map.get(key);
                priorityQueue.remove(data);
                data.value = value;
                data.ms = step++;
            }else {
                data = new Data();
                data.key = key;
                data.value = value;
                data.ms = step++;
            }
            map.put(key, data);
            priorityQueue.offer(data);
        }
    }
}
