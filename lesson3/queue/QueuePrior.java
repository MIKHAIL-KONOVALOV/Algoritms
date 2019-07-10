package geekbrains.lesson3.queue;

public class QueuePrior extends QueueImpl {

    public QueuePrior(int maxSize) {
        super(maxSize);
    }

    @Override
    public void insert(int value) {
        if (isEmpty()){
            data[size++] = value;
            return;
        }

        int index;
        for (index = size -1 ; index >= 0; index--) {
            if (value > data[index]) {
                data[index + 1] = data[index];
            }
            else {
                break;
            }
        }
                data[index + 1] = value;
                size++;
    }

    @Override
    public int remove() {
        return data[--size];
    }

    @Override
    public int peek() {
        return data[size - 1];
    }
}
