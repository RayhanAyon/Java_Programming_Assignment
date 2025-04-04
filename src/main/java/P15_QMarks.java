public class P15_QMarks {
    public static void main(String[] args) {
        int totalQuestions = 15;
        int totalMarks = 100;

        int tenMarkQ = (totalMarks - 5 * totalQuestions) / 5;
        int fiveMarkQ = totalQuestions - tenMarkQ;

        System.out.println("5 marks question is " + fiveMarkQ);
        System.out.println("10 marks question is " + tenMarkQ);
    }
}
