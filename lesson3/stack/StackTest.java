package geekbrains.lesson3.stack;
import java.util.Random;

public class StackTest {

    final static int STACK_SIZE = 5;

    public static void main(String[] args) {
        Random rnd = new Random();
        Stack stack1 = new StackImpl(STACK_SIZE);
        System.out.println("Stack size = " + stack1.getSize());
//        for (int i = 0; i < STACK_SIZE + 1; i++) {
//            stack1.push(rnd.nextInt(10));
//        }
        int value = 1;
        pushToStack(stack1, 1);
        pushToStack(stack1, 2);
        pushToStack(stack1, 3);
        pushToStack(stack1, 4);
        pushToStack(stack1, 5);

        stack1.display();
        System.out.println("Stack size = " + stack1.getSize());
        System.out.println("Stack peek = " + stack1.peek());
        System.out.println("Pop element - " + stack1.pop());
        stack1.display();
        stack1.displayAndClear();
        stack1.display();
    }

    private static void pushToStack(Stack stack1, int value) {
        if (!stack1.isFull())
            stack1.push(value);
    }
}
