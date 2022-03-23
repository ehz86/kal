import java.util.Scanner;
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String s = in.nextLine();
        in.close();
        String s1 = Calculator.RPN(s);
        System.out.println(Calculator.preparation(s1));
        System.out.println(Calculator.decide(s1));



    }
}



