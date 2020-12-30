package SortStudName;

import java.util.Arrays;
import java.util.stream.Stream;

public class SortName {
    public void sort(String[] names) {
        String[] sortedNames = Stream.of(names).sorted().toArray(String[]::new);
        System.out.println("Sorted names: " + Arrays.toString(sortedNames));
    }
}
