package lessonnine;



import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TestExampleTwo {
    public static void main(String[] args) {
        String inputData = "dfsdf sdf sfsdfs ggsd sfsdgsdgdfgfghqwquj";
        char[] chars = inputData.toCharArray();
        Set<Character> characters = new TreeSet<>();
        Set<Character> duplicateSet = new TreeSet<>();
        for (char temp : chars){
            if (!characters.add(temp)){
                duplicateSet.add(temp);
            }
        }
        System.out.println("Origial data " + Arrays.toString(chars));
        System.out.println("All elements" + characters);
        System.out.println("Dublicate" + duplicateSet);

        for (char value : characters) {
            if (!duplicateSet.contains(value)){
                System.out.println("Unique element : " + value);
            }

        }



    }
}
