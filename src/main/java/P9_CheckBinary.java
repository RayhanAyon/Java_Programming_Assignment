import java.util.Scanner;

public class P9_CheckBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input:");
        String input = sc.nextLine();
        for (int i = 0; i < input.length(); i++) {
            String ch = String.valueOf(input.charAt(i));
            if (!"01".contains(ch)) {
                System.out.println("Output:False");
                return;
            }
        }
        System.out.println("Output:True");

    }
}
