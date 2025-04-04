import java.util.Arrays;

public class P12_ExtractandCalculate {
    public static void main(String[] args) {
        String str = "A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. " +
                "If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount?";
        str = str.replaceAll("[^\\d]", " ");
        System.out.println(str);
//        str = str.trim();
//        str = str.replaceAll(" +", " ");
//        String[] arr = (str.split(" "));
//        int laptopPrice=Integer.parseInt(arr[1]);
//        int mousePrice=Integer.parseInt(arr[2]);
//        int mouseQuantity = Integer.parseInt(arr[3]);
//        int discount = Integer.parseInt(arr[4]);
//        int totalPriceBeforeDiscount=(laptopPrice+(mousePrice*mouseQuantity));
//        double totalDiscount=totalPriceBeforeDiscount*(discount/100.0);
//        double totalPrice=totalPriceBeforeDiscount-totalDiscount;
//        System.out.println("Total Price:"+totalPrice+" Taka");

    }
}
