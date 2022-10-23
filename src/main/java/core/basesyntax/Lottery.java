package core.basesyntax;

import java.util.Random;

public class Lottery {
  private final int MAX_BALL_NUMBER = 100;

  public Ball getRandomBall() {
    ColorSupplier ballColor = new ColorSupplier();
    return new Ball(ballColor.getRandomColor(), new Random().nextInt(MAX_BALL_NUMBER) + 1);
  }
}
