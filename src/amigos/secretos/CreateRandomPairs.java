package amigos.secretos;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class CreateRandomPairs {

    private final Random random = new Random();

    public static void main(String[] args) {
        List<String> front_end = new LinkedList<String>();
        List<String> back_end = new LinkedList<String>();
        front_end.add("Ana");
        back_end.add("Ana");
        front_end.add("Catarina");
        back_end.add("Catarina");
        front_end.add("Carolina");
        back_end.add("Carolina");

        CreateRandomPairs crp = new CreateRandomPairs();

        for (int i = 0; i < front_end.size(); i++) {
            String my_pair = crp.getRandomList(back_end);
            System.out.println(front_end.get(i) + "-" + my_pair);
        }

    }

    public String getRandomList(List<String> list) {
        int index = random.nextInt(list.size());
        String name = list.get(index);
        list.remove(index);
        return name;
    }

}
