package AlgorLesson2;

import java.util.Arrays;
import java.util.Random;

public class ArrayImpl implements Array {

    protected int[] data;
    protected int currentSize;

    public ArrayImpl(int maxSize) {
        this.data = new int[maxSize];
//        this.currentSize = 0; Необязатаельно так как int по дефолту ноль
    }

    @Override
    public void add(int value) {
        if (currentSize == data.length) {
            data = grow();
        }
        data[currentSize++] = value;  // Можно записать currentSize++
//        currentSize++;

    }

    protected int[] grow() {
        return Arrays.copyOf(data,data.length * 2);
    }

    @Override
    public int get() {
        return isEmpty() ? 0 : data[currentSize - 1];
    }

    @Override
    public int get(int index) {
        if ( (index >= 0) && (index < currentSize) )
            return data[index];
        return 0;
    }

    @Override
    public int indexOf(int value) {
        for (int i = 0; i < currentSize; i++) {
            if (data[i] == value)
                return i;
        }
        return -1;
    }



    @Override
    public boolean contains(int value) {
        return indexOf(value) != -1;
    }

    @Override
    public boolean remove(int value) {
        boolean valueExist = false;
            for (int i = 0; i < currentSize; i++) {
                if (data[i] == value) {
                    valueExist = true;
                    for (int j = i; j < currentSize - 1 ; j++) {
                        data[j] = data[j+1];
                    }
                    currentSize--;
                    i--;
                }
            }
        return valueExist;
    }

    @Override
    public boolean isEmpty() {
        return currentSize == 0;
    }

    @Override
    public int getSize() {
        return currentSize;
    }

    @Override
    public void display() {
        System.out.println("Display array");
        for (int i = 0; i < currentSize; i++) {
            System.out.print(data[i] + "; ");

        }
        System.out.println("\n----------------");
    }

    @Override
    public boolean remove() {
        if ( !isEmpty() ) {
            currentSize--;
            return true;
        }
        return false;
    }

    @Override
    public void clear(){
        currentSize = 0;
    }

    @Override
    public void sortBubble() {
        int l = currentSize - 1;
        for (int j = l; j > 0 ; j--) {
            for (int i = 0; i < j; i++) {
                if (data[i] > data[i + 1]) {
                    swap(i, i+1);
                }
            }
        }
    }

    private void swap(int index1, int index2) {
        int temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }

    @Override
    public void sortSelect() {
        for (int i = 0; i < currentSize - 1; i++) {
            int min = data[i];
            int minIndex = i;
            for (int j = i + 1; j < currentSize; j++) {
                if (data[j] < min) {
                    min = data[j];
                    minIndex = j;
                }
            }
            swap(i,minIndex);

        }
    }

    @Override
    public void sortInsert() {
        for (int i = 1; i < currentSize; i++) {
            int temp = data[i];
            int index = i;
            while ( (index > 0) && (data[index - 1] >= temp)){
                data[index] = data[index - 1];
                index--;
            }
            data[index] = temp;
        }
    }

}
