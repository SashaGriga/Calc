public class Compute {

    public static int Calc(String[] s) {

        int a = Integer.parseInt(s[0]);
        char ch = s[1].charAt(0);
        int b = Integer.parseInt(s[2]);


        int res = 0;
        switch (ch) {
            case '+':
                res = a + b;
                break;
            case '-':
                res = a - b;
                break;
            case '*':
                res = a * b;
                break;
            case '/':
                res = a / b;
                break;
            default:
                System.out.println("Недопустимая математическая операция");
                System.exit(0);
        }
        return res;
    }


}
