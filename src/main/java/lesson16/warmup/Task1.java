package lesson16.warmup;

import java.util.ArrayList;
import java.util.List;

import static lesson16.warmup.Common.list;
import static lesson16.warmup.Common.combine;

public class Task1 {

  private List<String> solution1(List<String> subjects, List<String> verbs,List<String> objects) {
    ArrayList<String> outcome = new ArrayList<>();
    for (int i = 0; i < subjects.size(); i++) {
      for (int j = 0; j < verbs.size(); j++) {
        for (int k = 0; k < verbs.size(); k++) {
          outcome.add(combine(subjects.get(i), verbs.get(j), objects.get(k)));
        }
      }
    }
    return outcome;
  }

  public static void main(String[] args) {
    List<String> subjects = list("Noel", "The cat", "The dog");
    List<String> verbs =    list("wrote", "chased", "slept on");
    List<String> objects =  list("the book","the ball","the bed");
    Task1 app = new Task1();

    app.solution1(subjects, verbs, objects).forEach(System.out::println);
  }
}
