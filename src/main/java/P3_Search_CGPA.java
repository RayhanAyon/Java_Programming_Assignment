import java.util.Arrays;
import java.util.Scanner;

public class P3_Search_CGPA {
    public static int binarySearch(double[] arr, double target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;

            if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter CGPA:");
        double userCGPA = sc.nextDouble();
        Arrays.sort(cgpa);
        int result = binarySearch(cgpa, userCGPA);
        if (result == -1)
            System.out.println(userCGPA + " CGPA is not present");
        else
            System.out.println(userCGPA + " CGPA is present");
    }

}

