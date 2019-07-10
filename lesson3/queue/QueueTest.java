package geekbrains.lesson3.queue;

public class QueueTest {

    public static void main(String[] args) {
//        Queue queue = new QueueImpl(5);
        Queue queue = new QueueImpl(3);

        insert(queue, 2);
        insert(queue, 1);
        insert(queue, 4);
        insert(queue, 5);
        insert(queue, 3);

        System.out.println("Size = " + queue.getSize());
        System.out.println("Peek = " + queue.peek());

        System.out.println("Remove top = " + remove(queue));
        System.out.println("Peek = " + queue.peek());
        System.out.println("Size = " + queue.getSize());

        while (!queue.isEmpty())
            System.out.println(remove(queue));


    }

    private static int remove(Queue queue) {
        if (!queue.isEmpty())
            return queue.remove();
        else return -1;
    }

    private static void insert(Queue queue, int value) {
        if (!queue.isFull())
            queue.insert(value);
    }
}
