import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        input.nextLine();
        for (int i = 1; i <= n; i++) {
            String check = input.nextLine();
            long number = 0;
        try {
            number = Long.parseLong(check);
            String answer = "";

            if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE) {
                answer += "* byte\n";
            }

            if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE) {
                answer += "* short\n";
            }

            if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
                answer += "* int\n";
            }

            if (number >= Long.MIN_VALUE && number <= Long.MAX_VALUE) {
                answer += "* long";
            }
            System.out.println(number + " can be fitted in:");
            System.out.println(answer);

            }catch(NumberFormatException e){
                System.out.println(check + " can't be fitted anywhere.");
            }
        }
    }
}