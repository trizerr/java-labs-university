package block5;

public class Main {
    public static void main(String[] args) {
        String text = "Hello, world! How are you? I`m fine,and you?";
        System.out.println(text);
        System.out.println(text.replaceAll(",", ", ").replaceAll(" {2}", " "));
    }
}
