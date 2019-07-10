package geekbrains.lesson3.brackets;

import geekbrains.lesson3.stack.StackCharImpl;
import geekbrains.lesson3.stack.StackChar;

public class BracketValidator {

    private String text;

    public BracketValidator(String text) {
        this.text = text;
    }

    public void check() {
        StackChar stack = new StackCharImpl(100);

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            switch (currentChar) {
                case '(' :
                case '{' :
                case '[' :
                    stack.push(currentChar);
                    break;
                case ')' :
                case '}' :
                case ']' :
                    checkChar(stack, i, currentChar);
                break;
                    default:
                        break;
            }
        }
        if (!stack.isEmpty()) {
            System.out.println("Missing right delimiter");
        }
    }

    private void checkChar(StackChar stack, int i, char currentChar) {
        if (stack.isEmpty()) {
            System.out.println("Error " + currentChar +
                    "at " + i + " position");
            return;
        }

        char ch = stack.pop();
        if ( ((ch == '(') && (currentChar != ')')) ||
           ( (ch == '{') && (currentChar != '}')) ||
           ( (ch == '[') && (currentChar != ']'))) {
            System.out.println("Error " + currentChar +
                    "at " + i + " position");

        }
    }

    public static void main(String[] args) {
        String txt = "dsv( ; erret[ (ytut[yutyujyuy]fghfgh){fds}";
        BracketValidator brb = new BracketValidator(txt);
        brb.check();
    }
}
