import java.util.Scanner;

public class P8_String_Count {
    public static void main(String[] args) {
        String str;
        System.out.print("Enter String:");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine().toLowerCase();
        char[] chars = str.toCharArray();
        String vowels = "aeiou";
        int vowel = 0, cons = 0, words = 1;
        for (char ch : chars) {
            if (vowels.indexOf(ch) != -1) {
                vowel++;
            } else if (ch == ' ') {
                words++;
            } else cons++;
        }
        System.out.println("Words:"+words);
        System.out.println("Chars:"+(vowel+cons));
        System.out.println("Vowel:"+vowel);
        System.out.println("Consonant:"+cons);
    }
}
