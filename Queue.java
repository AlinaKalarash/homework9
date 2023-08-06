import java.util.LinkedList;

public class Queue {

        private LinkedList<Object> elements = new LinkedList<>();

        public void add(Object value) {
            elements.addLast(value);
        }

        public void clear() {
            elements.clear();
        }

        public int size() {
            return elements.size();
        }

        public Object peek() {
            return elements.getFirst();
        }

        public Object poll() {
            return elements.pollFirst();
        }
    }


