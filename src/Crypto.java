public class Crypto {

        public static String text = "Lorem ipsum is";
        public static String encrypt(String text, int shift) {
            String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String lower = upper.toLowerCase();
            char[] encrypted = new char[text.length()];

            while (shift < 0) {
                shift += upper.length();
            }

            for (int i = 0; i < text.length(); i++) {
                if ('A' <= text.charAt(i) && text.charAt(i) <= 'Z') {
                    encrypted[i] = upper.charAt((upper.indexOf(text.charAt(i)) + shift) % upper.length());
                } else if ('a' <= text.charAt(i) && text.charAt(i) <= 'z') {
                    encrypted[i] = lower.charAt((lower.indexOf(text.charAt(i)) + shift) % lower.length());
                } else {
                    encrypted[i] = text.charAt(i);
                }
            }

            return new String(encrypted);
        }

        public static String decrypt(String text, int shift) {
            return encrypt(text, -shift);
        }

    public static void run(){ Crypto c = new Crypto();
    String text = "Lorem ipsum";
        System.out.println(c.encrypt(text, 5));
        System.out.println(c.decrypt(c.encrypt(text, 5), 5));}
    }
