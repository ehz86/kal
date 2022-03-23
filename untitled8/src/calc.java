
public class calc {
    public static String Addition(String a, String b) {
        String l1 = "";
        String l2 = "";
        String l3 = "";
        String l4 = "";

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' ') continue;

            if (Token(a.charAt(i)) < 3 ) {
                while (a.charAt(i) != '/') {
                    l1 += a.charAt(i);
                    if (i == a.length()) break;
                    i++;
                }i++;
                while (a.charAt(i) != ' ') {
                    l2 += a.charAt(i++);
                    if (i == a.length()) break;

                }
            }

        }
        int n1 = Integer.parseInt(l1);
        int n2 = Integer.parseInt(l2);
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == ' ') continue;

            if (Token(b.charAt(i)) < 3 ) {
                while (b.charAt(i) != '/') {
                    l3 += b.charAt(i);
                    if (i == b.length()) break;
                    i++;
                }i++;
                while (b.charAt(i) != ' ') {
                    l4 += b.charAt(i++);
                    if (i == b.length()) break;

                }
            }

        }
        int n3 = Integer.parseInt(l3);
        int n4 = Integer.parseInt(l4);

        int x1,x2;
            if (n2 == n4) {
                x1 = n1 + n3;
                x2 = n2;
            } else {
                x1 = n1 * n4 + n3 * n2;
                x2 = n2 * n4;
            }

            /*int l;
            if (x1 > 0) {
                l = x1;
            } else {
                l = x2;
            }
            while (true) {
                if (x1 % l == 0 && x2 % l == 0)
                    break;
                l--;
            }
            if (x2 / l != 1)
                return String.valueOf(x1 / l + "/" + x2 / l);
            else
                return String.valueOf(x1 / l);

             */
        return String.valueOf(x1+"/"+x2);
        }


    public static String Subtraction(String a, String b) {

            String l1 = "";
            String l2 = "";
            String l3 = "";
            String l4 = "";
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == ' ') continue;

                if (Token(a.charAt(i)) < 3 ) {
                    while (a.charAt(i) != '/') {
                        l1 += a.charAt(i);
                        if (i == a.length()) break;
                        i++;
                    }i++;
                    while (a.charAt(i) != ' ') {
                        l2 += a.charAt(i++);
                        if (i == a.length()) break;

                    }
                }

            }
            int n1 = Integer.parseInt(l1);
            int n2 = Integer.parseInt(l2);
            for (int i = 0; i < b.length(); i++) {
                if (b.charAt(i) == ' ') continue;

                if (Token(b.charAt(i)) < 3 ) {
                    while (b.charAt(i) != '/') {
                        l3 += b.charAt(i);
                        if (i == b.length()) break;
                        i++;
                    }i++;
                    while (b.charAt(i) != ' ') {
                        l4 += b.charAt(i++);
                        if (i == b.length()) break;

                    }
                }

            }
            int n3 = Integer.parseInt(l3);
            int n4 = Integer.parseInt(l4);

            int x1,x2;

        if(n2==n4) {
            x1 = n3 - n1;
            x2 = n2;
        }
        else {
            x1 = n3*n2 - n1*n4;
            x2 = n2*n4;
        }
        /*int l;
        if(x1 > 0) {
            l = x1;
        }
        else {
            l = x2;
        }
        while(true){
            if( x1 % l == 0 && x2 % l ==0)
                break;
            l--;
        }
        if(x2/l != 1)
            return String.valueOf(x1/l+"/"+x2/l);
        else
            return String.valueOf(x1/l);
+
       */
        return String.valueOf(x1+"/"+x2);
    }
    public static String Multiplication(String a, String b) {

            String l1 = "";
            String l2 = "";
            String l3 = "";
            String l4 = "";
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == ' ') continue;

                if (Token(a.charAt(i)) < 3 ) {
                    while (a.charAt(i) != '/') {
                        l1 += a.charAt(i);
                        if (i == a.length()) break;
                        i++;
                    }i++;
                    while (a.charAt(i) != ' ') {
                        l2 += a.charAt(i++);
                        if (i == a.length()) break;

                    }
                }

            }
            int n1 = Integer.parseInt(l1);
            int n2 = Integer.parseInt(l2);
            for (int i = 0; i < b.length(); i++) {
                if (b.charAt(i) == ' ') continue;

                if (Token(b.charAt(i)) < 3 ) {
                    while (b.charAt(i) != '/') {
                        l3 += b.charAt(i);
                        if (i == b.length()) break;
                        i++;
                    }i++;
                    while (b.charAt(i) != ' ') {
                        l4 += b.charAt(i++);
                        if (i == b.length()) break;

                    }
                }

            }
            int n3 = Integer.parseInt(l3);
            int n4 = Integer.parseInt(l4);

            int x1,x2;

           x1 = n1 * n3;
            x2 = n2 * n4;

            int l;
            if (x1 > 0) {
                l = x1;
            } else {
                l = x2;
            }
            while (true) {
                if (x1 % l == 0 && x2 % l == 0)
                    break;
                l--;
            }
            if (x2 / l != 1)
                return String.valueOf(x1 / l + "/" + x2 / l);
            else
                return String.valueOf(x1 / l);
        }

    public static String Splitting(String a, String b) {

            String l1 = "";
            String l2 = "";
            String l3 = "";
            String l4 = "";
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == ' ') continue;

                if (Token(a.charAt(i)) < 3 ) {
                    while (a.charAt(i) != '/') {
                        l1 += a.charAt(i);
                        if (i == a.length()) break;
                        i++;
                    }i++;
                    while (a.charAt(i) != ' ') {
                        l2 += a.charAt(i++);
                        if (i == a.length()) break;

                    }
                }

            }
            int n1 = Integer.parseInt(l1);
            int n2 = Integer.parseInt(l2);
            for (int i = 0; i < b.length(); i++) {
                if (b.charAt(i) == ' ') continue;

                if (Token(b.charAt(i)) < 3 ) {
                    while (b.charAt(i) != '/') {
                        l3 += b.charAt(i);
                        if (i == b.length()) break;
                        i++;
                    }i++;
                    while (b.charAt(i) != ' ') {
                        l4 += b.charAt(i++);
                        if (i == b.length()) break;

                    }
                }

            }
            int n3 = Integer.parseInt(l3);
            int n4 = Integer.parseInt(l4);

            int x1,x2;

            x1 = n1 * n4;
            x2 = n2 * n3;

            int l;
            if (x1 > 0) {
                l = x1;
            } else {
                l = x2;
            }
            while (true) {
                if (x1 % l == 0 && x2 % l == 0)
                    break;
                l--;
            }
            if (x2 / l != 1)
                return String.valueOf(x1 / l + "/" + x2 / l);
            else
                return String.valueOf(x1 / l);
        }

    public static int Token(char token) {
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



