public class Queue {

    private LinkedList<Object> elements = new LinkedList<>();

    public void add(Object value) {
        elements.add(value);
    }

    public void clear() {
        elements.clear();
    }

    public int size() {
        return elements.size();
    }

    public Object peek() {
        return elements.get(elements.size());
    }

    public Object poll() {
        if (elements.size() > 0) {
            elements.remove(0);
        } else {
            throw new RuntimeException("There is no elements left");
        }
        return elements.get(0);
    }
}
