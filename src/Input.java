import java.util.Scanner;


public class Input {

    public static String[] Read(){
        Scanner line = new Scanner(System.in);
        System.out.println("Введите пример:");

        String in = line.nextLine();

        String[] s=in.split(" ");

        return s;
    }

}
