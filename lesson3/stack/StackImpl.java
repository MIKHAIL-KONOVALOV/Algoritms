package geekbrains.lesson3.stack;

public class StackImpl implements Stack {

    private int[] data;
    private int size;

    public StackImpl(int maxSize) {
        this.data = new int[maxSize];
        this.size = 0;
    }

    @Override
    public void push(int value) {  //Add element
        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }
        data[size++] = value;
    }

    @Override
    public int pop() { // Extract ellement
        if (!isEmpty()) {
            return data[--size ];
        } else throw new RuntimeException("Stack is Empty");
    }

    @Override
    public int peek() { //Read element
        return !isEmpty() ? data[size - 1] : -1;
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
