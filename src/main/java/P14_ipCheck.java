import java.util.Scanner;

public class P14_ipCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the IP address: ");
        String ip = sc.nextLine();
        String[] parts = ip.split("\\.");
        if (parts.length != 4) {
            System.out.println("Output: Invalid IP");
            return;
        }
        for (String part : parts) {
            if (!part.matches("\\d+")) {
                System.out.println("Output: Invalid IP");
                return;
            }
        }
        String first = parts[0];
        if (first.length() == 1 || first.charAt(0) == '0') {
            System.out.println("Output: Invalid IP");
            return;
        }
        System.out.println("Output: Valid IP");
    }
}
