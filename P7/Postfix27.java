package P7;

public class Postfix27 {
    int n, top;
    char[] stack;

    Postfix27(int n) {
        this.n = n;
        this.top = -1;
        this.stack = new char[n];
    }

    public void push(char data) {
        top++;
        stack[top] = data;
    }

    public char pop() {
        char item = stack[top];
        top--;
        return item;
    }

    public boolean isOperand(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9') || c == ' ' || c == '.';
    }

    public boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    public int derajat(char c) {
        return switch (c) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> 0;
        };
    }

    public String konversi(String Q) {
        String P = "";
        for (int i = 0; i < Q.length(); i++) {
            char c = Q.charAt(i);
            if (isOperand(c)) {
                P += c;
            } else if (c == '(') {
                push(c);
            } else if (c == ')') {
                while (top != -1 && stack[top] != '(') {
                    P += pop();
                }
                if (top != -1 && stack[top] == '(') {
                    pop();
                }
            } else {
                while (top != -1 && derajat(c) <= derajat(stack[top])) {
                    P += pop();
                }
                push(c);
            }
        }
        while (top != -1) {
            P += pop();
        }
        return P;
    }
}
