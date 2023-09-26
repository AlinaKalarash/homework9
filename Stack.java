public class Stack {


        private LinkedList<Object> elements = new LinkedList<>();


        public void push(Object value) {
            elements.add(value);
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
            return elements.get(0);
        }

        public Object pop() {
            if (elements.size()>0) {
                elements.remove(0);
            } else {
                throw new RuntimeException("There is no elements left");
            }
            return elements.get(0);

        }
}
