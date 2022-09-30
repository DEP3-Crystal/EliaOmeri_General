import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class MergeNames {

    public static String[] uniqueNames(String[] names1, String[] names2) {
        Set<String> uniqueSet = new HashSet<>(Arrays.asList(names1));
        uniqueSet.addAll(Arrays.asList(names2));
        return uniqueSet.toArray(new String[0]);
    }

// Another way
//    public static String[] uniqueNames(String[] names1, String[] names2) {
//        List<String> names = Stream.of(names1, names2)
//                .flatMap(Stream::of)
//                .collect(Collectors.toList());
//
//        Set<String> uniqueNames = new HashSet<String>(names);
//
//        String[] uniqueArray = new String[uniqueNames.size()];
//
//        uniqueNames.toArray(uniqueArray);
//
//        return uniqueArray;
//    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}
