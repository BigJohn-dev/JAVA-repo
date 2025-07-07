import java.util.ArrayList;

public class PracticeArrayList {
    public static void main(String[] args) {
        
        ArrayList<String> message = new ArrayList<>();

        message.add("Lion");
        message.add("Goat");
        message.add("Fish");
        message.add("Dragon");

        System.out.println(message);

        System.out.println(message.size());

        message.remove(1);

        System.out.println(message);

        for(int i = 0; i < message.size(); i++) {
            System.out.println(message.get(i));
        }
        System.out.println(message.contains("Fish"));

        message.trimToSize();

        System.out.println(message);


    }
    
}
