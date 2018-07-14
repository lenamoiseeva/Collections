import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.ArrayList;

public class Collections {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Cities");
        Scanner scanner = new Scanner(file);
        ArrayList arraylist = new ArrayList();

        while (scanner.hasNext()) {
            String word = scanner.next();
            arraylist.add(word);
        }
        System.out.println("Words in the file: " + arraylist);
        Set<String> sortedSet = new TreeSet<>();
        Map<String, Integer> statistics = new HashMap<>();
        int c = 0;
        String f;
        String max[];
        max = new String[1];

        for (int i = 0; i < arraylist.size(); i++) {
            f = (String) arraylist.get(i);
            sortedSet.add(f);

            Integer count = statistics.get(f);
            if (count == null) {
                count = 0;
            }
            statistics.put(f, ++count);
            if (count > c) {
                c = count;
                max[0] = f;
            }
        }
        System.out.println("Words in alphabetical order: = " + sortedSet);
        System.out.println("How many times each word occurs in the file: = " + statistics);
        System.out.println("The word " + max[0]+ " occurs in the file " + c + "  times");
    }
}