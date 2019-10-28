package lesson08.warmup;

import java.util.Optional;
import java.util.Scanner;

public class SummarizerApp {
  public static void main1(String[] args) {
    Summarizer s = new Summarizer();
    Scanner in = new Scanner(System.in);
    String line = in.nextLine();
    int result = s.sum(line);
    System.out.printf("The sum is:%d\n", result);
  }

  public static void main(String[] args) {
    Summarizer s = new Summarizer();
    Optional<Integer> o1 = s.convertToInt("123");
    Optional<Integer> o2 = s.convertToInt("mdff435hgmg");
    String sh = "Hello";
    String nn = null;
    Optional<String> opt1 = Optional.ofNullable(sh);
    Optional<String> opt2 = Optional.ofNullable(nn);


    if (o1.isPresent()) {} // true
    Integer val = o1.get();

    if (o2.isPresent()) {} // false
    // o2.get(); // will brake
  }
}
