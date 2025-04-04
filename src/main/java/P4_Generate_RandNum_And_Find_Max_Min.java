import java.util.Arrays;
import java.util.Random;

public class P4_Generate_RandNum_And_Find_Max_Min {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Generated numbers: " + Arrays.toString(array));
        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }
}
