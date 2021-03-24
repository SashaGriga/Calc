public class Roman {
    /*
Основные числа:
I - 1
V - 5
X - 10
L - 50
C - 100
*/

    public static int[] count(int in) {
        int a[] = new int[5];

        if (in == 0) {
            System.out.println("ZERO");
            System.exit(0);
        }
        int c1 = in / 100;
        a[0]=c1;

        int c2 = in % 100;


        int l1 = c2 / 50;
        a[1]=l1;

        int l2 = c2 % 50;


        int x1 = l2 / 10;
        a[2]=x1;

        int x2 = l2 % 10;


        int v1 = x2 / 5;
        a[3]=v1;

        int v2 = x2 % 5;

        a[4]=v2;

        return a;
    }


    public static String Arabic_to_Roman(int[] a) {
        char[] Rom = {'C','L','X','V','I'};
        StringBuffer R = new StringBuffer("");

        if (a[0] == 1) return "C";
        else if (a[1] == 1 && a[2] == 4) {
            R.append("XC");
        }
        else if (a[1] > 0) {
            R.append(Rom[1]);
            for (int i = 0; i < a[2]; i++) {
                R.append(Rom[2]);
            }
        }
        else if (a[1] == 0 && a[2] == 4) {
            R.append("XL");
        }
        else if (a[2] > 0) {
            for (int i = 0; i < a[2]; i++) {
                R.append(Rom[2]);
            }
        }

         if (a[3] == 1 && a[4] == 4) {
            R.append("IX");
        }
        else if (a[3] > 0) {
            R.append(Rom[3]);
            for (int i = 0; i < a[4]; i++) {
                R.append(Rom[4]);
            }
        }
        else if (a[3] == 0 && a[4] == 4) {
            R.append("IV");
        }
        else if (a[4] > 0) {
            for (int i = 0; i < a[4]; i++) {
                R.append(Rom[4]);
            }
        }
        return R.toString();
    }

    public static String[] Roman_to_Arabic(String[] r) {
        for (int i=0;i<=2;i=i+2){
            if (r[i].equals("I")) {
                r[i] = "1";
            } else if (r[i].equals("II"))  {
                r[i] = "2";
            } else if (r[i].equals("III")) {
                r[i] = "3";
            } else if (r[i].equals("IV")) {
                r[i] = "4";
            } else if (r[i].equals("V")) {
                r[i] = "5";
            } else if (r[i].equals("VI")) {
                r[i] = "6";
            } else if (r[i].equals("VII")) {
                r[i] = "7";
            } else if (r[i].equals("VIII")) {
                r[i] = "8";
            } else if (r[i].equals("IX")) {
                r[i] = "9";
            } else if (r[i].equals("X")) {
                r[i] = "10";
            }
            else {
                r[i] = "0";
                System.out.println("Некоректный ввод значений.");
                System.exit(0);
            }
        }
        return r;
        }

    }
