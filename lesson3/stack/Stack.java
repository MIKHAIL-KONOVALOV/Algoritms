package geekbrains.lesson3.stack;

public interface Stack {

    void push(int value);

    int pop();

    int peek();

    boolean isEmpty();

    boolean isFull();

    int getSize();

    void display();

    void displayAndClear();
}
