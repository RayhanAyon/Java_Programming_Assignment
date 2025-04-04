public class P1_Find_Smax {
    public static void main(String[] args) {
        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        double max = cgpa[0];
        double smax = cgpa[0];
        for (int i = 0; i < cgpa.length; i++) {
            if (cgpa[i] > max) {
                smax = max;
                max = cgpa[i];
            } else if (cgpa[i] > smax) {
                smax = cgpa[i];
            }
        }
        System.out.println("The second highest CGPA is: " + smax);
    }
}
