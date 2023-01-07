import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = 0;// дописать код;
        int end = 0;

        start = scanner.nextInt();
        end = scanner.nextInt();
        for (int i = start; i <= end; i++) {


            if ((i%3) == 0 && (i%5) == 0) {
                System.out.print("FizzBuzz"+" ");
            } else if ((i%3) == 0) {
                System.out.print("Fizz"+" ");
            } else if ((i % 5) == 0) {
                System.out.print("Buzz"+" ");
            } else {
                System.out.print(i+" ");

            }
        }
    }
}