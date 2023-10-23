package baseball;

import java.util.Objects;

public class UnvalidatedInputNum {

  private final String input;

  private UnvalidatedInputNum(String input) {
    this.input = input;
  }

  public static UnvalidatedInputNum of(String input) {
    return new UnvalidatedInputNum(input);
  }

  public String getInput() {
    return input;
  }
}
