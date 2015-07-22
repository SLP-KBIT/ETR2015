package controller.runstrategy;

import controller.runstrategy.movement.Movement;
import controller.runstrategy.movement.SampleMovement;
import controller.runstrategy.style.SampleStyle;
import controller.runstrategy.style.Style;

public class SampleStrategy extends RunStrategy {
  public SampleStrategy()
  {
    super();
  }

  public SampleStrategy(int defaultSpeed)
  {
    super();
    this.defaultSpeed = defaultSpeed;
  }

  public void exec() {
    System.out.println("execute strategy of " + this.getClass());
    Movement runMethod = new SampleMovement();
    Style runStyle = new SampleStyle();
    int turn = runMethod.calcTreshold();
    runMethod.execRun(turn, this.defaultSpeed);
    runStyle.transform();
    // TODO: ライン未検出，転倒時の例外を投げる
    // if ( ~~~ ) {
    //     throw new LineNotFoundException();
    // }
  }
}