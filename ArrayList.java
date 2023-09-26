public class ArrayList<T> {

    private final int INIT_SIZE = 16;
    private final int CUT_RATE = 4;
    private Object[] array = new Object[INIT_SIZE];
    private int pointer = 0;


    public void add(T item) {
        if(pointer == array.length-1)
            resize(array.length*2);
        array[pointer++] = item;
    }


    public T get(int index) {
        if (index >= 0) {
            return (T) array[index];
        } else {
            return null;
        }
    }


    public void remove(int index) {
        if (index >= 0) {
            for (int i = index; i < pointer; i++)
                array[i] = array[i + 1];
            array[pointer] = null;
            pointer--;
            if (array.length > INIT_SIZE && pointer < array.length / CUT_RATE)
                resize(array.length / 2);
        } else {
            throw new RuntimeException();
        }
    }

    public void clear() {
        for (int i = 0; i < pointer; i++) {
            if (array[i] != null) {
                array[i] = null;
            }
        }
        pointer = 0;
    }

    public int size() {
        return pointer;
    }

    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }
}
