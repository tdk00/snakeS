package lesson08.warmup;

import java.util.Optional;

public class Summarizer {

  boolean isNumber(String src) {
    try {
      Integer.parseInt(src);
      return true;
    } catch (NumberFormatException ex) {
      return false;
    }
  }

  int sum_v1(String origin) {
    if (origin == null) return 0;
    String[] items = origin.split(" ");
    int total = 0;
    for (String item: items) {
      if (isNumber(item)) {
        total += Integer.parseInt(item);
      }
    }
    return total;
  }

  Optional<Integer> convertToInt(String src) {
    try {
      int val = Integer.parseInt(src);
      return Optional.of(val);
    } catch (NumberFormatException ex) {
      return Optional.empty();
    }
  }

  int sum(String origin) {

    return -1;
  }
}
