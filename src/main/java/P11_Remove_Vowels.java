import java.util.Scanner;

public class P11_Remove_Vowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String:");
        String input=sc.nextLine().toLowerCase();
        String output=input.replaceAll("[aeiou]","");
        System.out.println(output);

    }
}
