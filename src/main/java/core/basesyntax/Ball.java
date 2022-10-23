package core.basesyntax;

public class Ball {
  private String ballColor;
  private int ballNumber;

  public Ball(String color, int number) {
    ballColor = color;
    ballNumber = number;
  }

  @Override
  public String toString() {
    return "Ball with number: " + ballNumber + " and color: " + ballColor;
  }
}
