package geekbrains.lesson3.homework3;

import geekbrains.lesson3.queue.QueueImpl;

public class DecImpl extends QueueImpl implements Dec {

    public DecImpl(int maxSize) {
        super(maxSize);
    }

    @Override
    public void insertLeft(int value) {
        if (front - 1 < 0)
            front = data.length;

        data[--front] = value;
        size++;
    }

    @Override
    public void insertRight(int value) {
        super.insert(value);
    }

    @Override
    public int removeLeft() {
        return super.remove();
    }

    @Override
    public int removeRight() {
        if (rear < 0)
            rear = data.length - 1;
        size--;
        return data[rear--];
    }
}
