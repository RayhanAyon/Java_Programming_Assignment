import java.util.Random;

public class P10_Random_Password {
    public static void main(String[] args) {
        String password = RandomPassword(8);
        System.out.println(password);

    }

    public static String RandomPassword(int len) {
        String chars = "1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&";
        Random rand = new Random();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++)
            sb.append(chars.charAt(rand.nextInt(chars.length())));
        return sb.toString();

    }

}
