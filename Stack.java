import java.util.LinkedList;

public class Stack {


        private LinkedList<Object> elements = new LinkedList<>();


        public void push(Object value) {
            elements.addLast(value);
        }


        public void remove(int index) {
            if (index >= 0 && index < elements.size()) {
                elements.remove(index);
            } else {
                throw new IndexOutOfBoundsException("Invalid index");
            }
        }


        public void clear() {
            elements.clear();
        }

        public int size() {
            return elements.size();
        }

        public Object peek() {
            return elements.getLast();
        }

        public Object pop() {
            return elements.pollLast();
        }
    }
