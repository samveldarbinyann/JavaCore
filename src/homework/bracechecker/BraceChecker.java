package homework.bracechecker;

public class BraceChecker {


    String text;

    BraceChecker(String text) {
        this.text = text;

    }

    void check() {
        Stack textStack = new Stack();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            switch (ch) {
                case '{':
                case '[':
                case '(':
                    textStack.push(ch);
                    break;
                case '}':
                case ']':
                case ')':
                    char last = (char) textStack.pop();
                    if (last == '{' && ch == '}' || last == '[' && ch == ']' || last == '(' && ch == ')') {
                        System.out.println("Good Text");
                    }else{
                        System.out.println("Error: opened: " + last + "but closed: " + ch + " at " + i);
                    }
                    break;
            }
        }

    }
}
