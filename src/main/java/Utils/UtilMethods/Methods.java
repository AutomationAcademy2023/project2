package Utils.UtilMethods;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class Methods {
    public static String generateRandomAlphabetic(int length) {
        return ThreadLocalRandom.current().ints('a', 'z' + 1)
                                .limit(length)
                                .mapToObj(i -> String.valueOf((char) i))
                                .collect(Collectors.joining());
    }
}
