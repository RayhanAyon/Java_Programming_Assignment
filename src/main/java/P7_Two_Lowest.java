import java.util.Arrays;
import java.util.Scanner;

public class P7_Two_Lowest {
    public static void main(String[] args) {
        int[] height = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Babies Height in CM. 10 Times:");
        for (int i = 0; i < 10; i++)
            height[i] = sc.nextInt();

        int min = height[0];
        int smin = height[0];
        for (int i = 1; i < height.length; i++) {
            if (height[i] < min) {
                smin = min;
                min = height[i];
            } else if (height[i] < smin && height[i] != min) {
                smin = height[i];
            }
        }
        System.out.println("Babies Height: "+Arrays.toString(height));
        System.out.println("Lowest Number: " + min);
        System.out.println("Second Lowest Number: " + smin);

    }
}
