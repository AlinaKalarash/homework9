import java.util.LinkedList;
public class HashMap {

    private LinkedList<Entry>[] buckets;
    private int capacity;
    private int size;

    public HashMap(int capacity) {
        this.capacity = capacity;
        this.buckets = new LinkedList[capacity];
        this.size = 0;
    }

    private int hash(Object key) {
        return key.hashCode() % capacity;
    }

    public void put(Object key, Object value) {
        int index = hash(key);
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }

        LinkedList<Entry> bucket = buckets[index];
        for (Entry entry : bucket) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }

        bucket.add(new Entry(key, value));
        size++;
    }

    public void remove(Object key) {
        int index = hash(key);
        if (buckets[index] == null) {
            return;
        }

        LinkedList<Entry> bucket = buckets[index];
        for (Entry entry : bucket) {
            if (entry.key.equals(key)) {
                bucket.remove(entry);
                size--;
                return;
            }
        }
    }

    public void clear() {
        for (int i = 0; i < capacity; i++) {
            if (buckets[i] != null) {
                buckets[i].clear();
            }
        }
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object get(Object key) {
        int index = hash(key);
        if (buckets[index] == null) {
            return null;
        }

        LinkedList<Entry> bucket = buckets[index];
        for (Entry entry : bucket) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }

        return null;
    }
}
