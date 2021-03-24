import java.util.Scanner;

//Григорьев А.С. "Калькулятор"

public class Main {
    public static void main(String[] args) {

        while (true) {

            String[] s = Input.Read();

            if (!Exception.isLength(s)) {
                System.exit(0);
            } else if (Exception.isBothInt(s)) {
                if (!Exception.isZeroTen(s)) System.exit(0);
                else System.out.println(Compute.Calc(s));
            } else {
                System.out.println(Roman.Arabic_to_Roman(Roman.count(Compute.Calc(Roman.Roman_to_Arabic(s)))));
            }
        }
    }
}
