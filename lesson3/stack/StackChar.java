package geekbrains.lesson3.stack;

public interface StackChar {

    void push(char value);

    char pop();

    char peek();

    boolean isEmpty();

    boolean isFull();

    int getSize();

    void display();

    void displayAndClear();
}
