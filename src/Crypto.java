public class Crypto {
    public static String text = "Lorem ipsum is a placeholder text commonly used to demonstrate the visual form of a document or a typeface without relying on meaningful content. Lorem ipsum may be used as a placeholder before final copy is available. It is also used to temporarily replace text in a process called greeking, which allows designers to consider the form of a webpage or publication, without the meaning of the text influencing the design.";
    public static int shift = 5;
    public static String encrypt(String text, int shift) {
        String str = new String();

        for (int i = shift; i<(text.length()-6);i++){

            str = text.substring(5)+text.substring(i);
        }


        return str;
    }

    public static String decrypt(String text, int shift) {
        String str = new String();
        // code here...
        return str;
    }

    public static void main(String[] args) {
        System.out.println(encrypt(text, 5));
    }
}
