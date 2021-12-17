public class TaskA6 {
    static String string = "helloworld";
    public static void run(){
        while (string.length()>1){
            string = string.replaceFirst("h","");
            string = string.substring(1, string.length()-1);
            System.out.println(string);
        }
    }


}
