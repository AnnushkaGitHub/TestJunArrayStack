public class StackArray<T extends Number> {
    private int sizeOfArray;
    private Object[] stack;

    private int counter = -1;

        public StackArray(int sizeOfArray) {
        this.sizeOfArray = sizeOfArray;
        stack = new Object[sizeOfArray];
    }

    public boolean push(T toPush) {
        if (counter < sizeOfArray - 1) {
            counter++;
            stack[counter] = toPush;
            System.out.println(toPush + " added");
            return true;
        } else {
            System.out.println("Stack overflowed");
            return false;
        }
    }

    public T pop() {
        if (counter >= 0) {
            T removed = (T) stack[counter];
            stack[counter] = null;
            counter--;
            //         System.out.println(removed + " removed");
            return removed;
        } else {
            System.out.println("Stack is empty");
            return null;
        }
    }

    public int size() {
        return (counter + 1);
    }
}
