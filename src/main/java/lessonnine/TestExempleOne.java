package lessonnine;

import java.util.Set;
import java.util.TreeSet;

public class TestExempleOne {
    public static void main(String[] args) {
        String inputData = "dfsdf sdf sfsdfs ggsd sfsdgsdgdfg";
        Set<Character> characters = new TreeSet<>();
        for (int i = 0 ; i < inputData.length(); i++) {
            char temp = inputData.charAt(i);
            characters.add(temp);

        }
        System.out.println("Count of letters " + characters.size());
        System.out.println("Letteers : " + characters);
    }
}
