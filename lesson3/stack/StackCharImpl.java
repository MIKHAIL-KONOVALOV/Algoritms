package geekbrains.lesson3.stack;

public class StackCharImpl implements StackChar {

    private char[] data;
    private int size;

    public StackCharImpl(int maxSize) {
        this.data = new char[maxSize];
        this.size = 0;
    }

    public void push(char ch) {  //Add element
        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }
        data[size++] = ch;
    }

    @Override
    public char pop() { // Extract ellement
        if (!isEmpty()) {
            return data[--size ];
        } else throw new RuntimeException("Stack is Empty");
    }

    @Override
    public char peek() { //Read element
        return !isEmpty() ? data[size - 1] : '?';
//        if (!isEmpty())
//        return data[size - 1];
//
//        return -1;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == data.length;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void display() {
        System.out.println("Stack display...");
        if (!isEmpty()) {
            for (int i = size -1; i >= 0 ; i--) {
                System.out.println(data[i]);
            }
        } else System.out.println("---");
    }

    @Override
    public void displayAndClear() {
        System.out.println("Stack display and clear");
        if (!isEmpty()) {
            while (!isEmpty())
                System.out.println(pop());
        } else System.out.println("---");
    }
}
