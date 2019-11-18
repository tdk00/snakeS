package lesson16.warmup;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class Common {
  public static List<String> list(String... strings) {
    return Arrays.asList(strings);
  }

  public static String combine(String... words) {
    StringJoiner sj = new StringJoiner(" ");
    for (String word: words) sj.add(word);
    return sj.toString();
  }
}
