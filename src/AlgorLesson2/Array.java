package AlgorLesson2;

public interface Array {

    void add(int value);

    int get();

    int get(int index);

    int indexOf(int value);

    boolean contains(int value);

    boolean remove(int value);

    boolean remove();

    boolean isEmpty();

    int getSize();

    void display();

    void clear();

    void sortBubble();

    void sortSelect();

//    void fillArraysRandom(int length, int range);

    void sortInsert();
}
