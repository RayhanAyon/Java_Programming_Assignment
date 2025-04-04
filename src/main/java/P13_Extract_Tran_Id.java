public class P13_Extract_Tran_Id {
    public static void main(String[] args) {
        String html = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Transactions</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div>\n" +
                "        <div class=\"button\">\n" +
                "            <p>Transaction Id: TXN1234</p>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</body>\n" +
                "</html>";

        // Find the text containing 'Transaction Id:'
        String transactionText = html.split("<p>")[1].split("</p>")[0];
        System.out.println(transactionText);
        // Trim to clean any extra spaces
//        String transactionId = transactionText.trim();
//
//        // Print the result

    }
}
