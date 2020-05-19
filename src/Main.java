import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        int nom = in.nextInt();
        System.out.println(nom%10);
        in.close();
    }
}
