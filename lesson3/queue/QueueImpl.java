package geekbrains.lesson3.queue;

public class QueueImpl implements Queue {

    public static final int DEFAULT_FRONT = 0;
    public static final int DEFAULT_REAR = -1;
    protected int[] data;
    protected int size;

    protected int front;
    protected int rear;

    public QueueImpl(int maxSize) {
        this.data = new int[maxSize];
        this.front = DEFAULT_FRONT;
        this.rear = DEFAULT_REAR;
    }

    @Override
    public void display() {
        if (front <= rear) {
            for (int i = front; i <= rear; i++) {
                System.out.println(data[i]);
                ;
            }
        } else {
            for (int i = front; i < data.length; i++) {
                System.out.println(data[i]);
            }
            for (int i = 0; i <= rear ; i++) {
                System.out.println(data[i]);
            }
        }
    }

    @Override
    public void insert(int value) {
        if (rear == data.length - 1)
            rear = DEFAULT_REAR;

        data[++rear] = value;
        size++;

    }

    @Override
    public int remove() {
        int value = data[front++];
        if (front == data.length)
            front = DEFAULT_FRONT;
        size--;
        return value;
    }

    @Override
    public int peek() {
        return data[front];
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
}
