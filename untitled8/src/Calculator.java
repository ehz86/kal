import java.util.Stack;

public class Calculator {
    public static String RPN(String rpn) {
        String current = "";
        Stack<Character> stack = new Stack<>();
        int priority;
        for(int i = 0; i < rpn.length();i++){
            priority = Token(rpn.charAt(i));
            if(priority == 0) current+=rpn.charAt(i);

            if(priority == 1) stack.push(rpn.charAt(i));

            if(priority > 1){
                current+=' ';

                while(!stack.empty()){
                    if(Token(stack.peek())>= priority){ current+=stack.pop();}
                    else break;
                }
                stack.push(rpn.charAt(i));
            }

            if(priority == -1){
                current+=' ';
                while(Token(stack.peek()) != 1)current += stack.pop();
                stack.pop();
            }
        }
        while(!stack.empty()){current+=stack.pop();}
        return current;
    }

    public static String decide(String Exp){
        String prepared = preparation(Exp);
        String rpn = RPN(prepared);
        return Answer(rpn);
    }

    public static String preparation(String s){
        String pr = new String();
        for(int i=0;i <s.length();i++){
            char symbol = s.charAt(i);
            if(symbol == '-') {
                if (i == 0)
                    pr += '0';
                else if (s.charAt(i - 1) == '(')
                    pr += '0';
            }
            pr += symbol;
        }
        return pr;
    }

    private static String Answer(String ans) {
        String ops = new String();
        Stack<String> stack = new Stack<>();
        for(int i = 0; i < ans.length(); i++){
            if(ans.charAt(i) == ' ' ) continue;

            if(Token(ans.charAt(i)) == 0){
                while(ans.charAt(i) != ' ' &&  Token(ans.charAt(i)) == 0) {
                    ops += ans.charAt(i++);
                    if (i == ans.length()) break;
                }
                stack.push(ops);
                ops = new String();
            }

            if(Token(ans.charAt(i)) > 1){
                String a = stack.pop();
                String b = stack.pop();
                System.out.println(a);
                System.out.println(b);


                    if (ans.charAt(i) == '+') {
                        stack.push((calc.Addition(a, b)));
                    }
                    if (ans.charAt(i) == '-') {
                        stack.push("-"+calc.Subtraction(a, b));
                    }
                    if (ans.charAt(i) == '*') {
                        stack.push(calc.Multiplication(a, b));
                    }
                    if (ans.charAt(i) == ':') {
                        stack.push(calc.Splitting(a, b));

                }
            }
        }
        return stack.pop();
    }

    private static int Token(char token) {
        switch (token) {
            case '*':
                return 3;
            case ':':
                return 3;
            case '+':
                return 2;
            case '-':
                return 2;
            case '(':
                return 1;
            case ')':
                return -1;
        }
        return 0;
    }
}

