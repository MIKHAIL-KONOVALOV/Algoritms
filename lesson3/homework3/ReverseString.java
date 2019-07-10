package geekbrains.lesson3.homework3;

import geekbrains.lesson3.stack.StackChar;
import geekbrains.lesson3.stack.StackCharImpl;

public class ReverseString {
    private String str;

    public ReverseString(String str) {
        this.str = str;
    }

    public String reverse() {
        String resultString = "";
        StackChar stack = new StackCharImpl(str.length());
        for (int i = 0; i < str.length() ; i++) {
            stack.push(str.charAt(i));
        }

        while (!stack.isEmpty())
            resultString += stack.pop();
        return resultString;
    }
}
