package lesson03;

import org.junit.Test;

import java.util.function.Predicate;

import static org.junit.Assert.*;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class CalculatorTest {

  @Test
  public void add() {
    Calculator c = new Calculator();
    assertEquals(4, c.add(2,2));
  }

  @Test
  public void sub() {
    Calculator c = new Calculator();
    assertEquals(4, c.sub(6,2));
  }

  @Test
  public void check() {
    Calculator c = new Calculator();
    assertThat(c.add(4,6)).isEqualTo(10);
    assertThat(c.add(4,6)).matches(new Predicate<Integer>() {
      @Override
      public boolean test(Integer integer) {
        return integer == 10;
      }
    });
  }

}
