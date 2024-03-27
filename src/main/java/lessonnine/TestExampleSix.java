package lessonnine;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestExampleSix {
    public static void main(String[] args) {
        String inputData = "dfsdf sdf sfsdfs ggsd sfsdgsdguiopdfg";
        Set<Character> characters = new HashSet<>();
        for (int i = 0 ; i < inputData.length(); i++) {
            char temp = inputData.charAt(i);
            characters.add(temp);

        }
        System.out.println("Count of letters " + characters.size());
        System.out.println("Letteers : " + characters);
    }
}