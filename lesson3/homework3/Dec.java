package geekbrains.lesson3.homework3;

import geekbrains.lesson3.queue.Queue;

public interface Dec extends Queue {

    void insertLeft(int value);
    void insertRight(int value);

    int removeLeft();
    int removeRight();

}
