import java.util.ArrayList;

public class Stack<T extends Number> {
    private int size;
    private ArrayList<T> stack;


    public Stack(int size) {
        this.size = size;
        stack = new ArrayList<T>();
    }

    public boolean push(T toPush) {
        if (stack.size() < size) {
            stack.add(toPush);
            System.out.println(toPush + " added");
            return true;
        } else {
            System.out.println("Stack overflowed");
            return false;
        }
    }

    public boolean pop() {
        if (stack.size() > 0) {
            int i = stack.size() - 1;
            T removed = stack.get(i);
            stack.remove((stack.size() - 1));
            System.out.println(removed + " removed");
            return true;
        } else {
            System.out.println("Stack is empty");
            return false;
        }
    }
}
