import java.util.Scanner;

public class P5_Notes_Count {
    public static void main(String[] args) {
//        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] notes = {1000, 700};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amount: ");
        int amount=sc.nextInt();
        int numNotes;
        for (int i=0;i<notes.length;i++){
            numNotes=amount/notes[i];
            amount=amount%notes[i];
            if (numNotes!=0)
                System.out.println(notes[i]+" "+numNotes);
        }

    }
}
