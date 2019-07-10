package geekbrains.lesson3.homework3;

public class DecTest {

    public static void main(String[] args) {

        Dec dec1 = new DecImpl(5);
        insertRight(dec1, 61);
        insertRight(dec1, 4);
        insertLeft(dec1, 23);
        insertRight(dec1, 5);
        removeLeft(dec1);
        dec1.display();
        ReverseString rs = new ReverseString("fgt678rh");
        System.out.println(rs.reverse());

    }

    private static void insertRight(Dec dec1, int value) {
        if (!dec1.isFull())
        dec1.insertRight(value);
    }
    private static void insertLeft(Dec dec1, int value) {
        if (!dec1.isFull())
            dec1.insertLeft(value);
    }

    private static void removeRight(Dec dec1) {
        if (!dec1.isEmpty())
            dec1.removeRight();
    }

    private static void removeLeft(Dec dec1) {
        if (!dec1.isEmpty())
            dec1.removeLeft();
    }
}
