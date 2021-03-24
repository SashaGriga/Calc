public class Exception {

    public static boolean isLength(String[] str) {
        if (str.length == 3) {
            return true;
        }
        else {
            System.out.println("Некоректный ввод примера.");
            return false;
        }
    }

    public static boolean isBothInt(String[] str) {
        try {
            Integer.parseInt(str[0]);
            Integer.parseInt(str[2]);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }


    public static boolean isZeroTen(String[] str) {
        Boolean first = (Integer.parseInt(str[0]) > 0 && Integer.parseInt(str[2]) > 0);
        Boolean second = (Integer.parseInt(str[0]) <= 10 && Integer.parseInt(str[2]) <= 10);
        if (first && second) {
            return true;
        }
        else {
            System.out.println("Числа должны принадлежать от 1 до 10");
            return false;
        }
    }

}

