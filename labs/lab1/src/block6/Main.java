package block6;

public class Main {
    public static void main(String[] args) {
        String text = "авто, автомат, автовокзал, тавтологія, мініавто, автоматично, куля, круг, коло";
        String[] arr = text.split(" ");
        int count = 0;
        for(String s : arr){
            if(s.contains("авто"))
                count++;
        }

        System.out.println("Count: " + count);
    }
}
