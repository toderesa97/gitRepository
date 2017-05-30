/**
 * Created by test on 28/05/2017.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, this is a print message");
        int a = 5;
        int b = 7;

        String toBePrint = String.format("%d+%d=%d", a, b, a+b);
        System.out.println(toBePrint);
    }

}
