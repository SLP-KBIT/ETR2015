package Controller.RunStrategy;

import Controller.RunStrategy.Movement.Movement;
import Controller.RunStrategy.Movement.SampleMovement;
import Controller.RunStrategy.RunStyle.RunStyle;
import Controller.RunStrategy.RunStyle.SampleRunStyle;

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
    RunStyle runStyle = new SampleRunStyle();
    int turn = runMethod.calcTreshold();
    runMethod.execRun(turn, this.defaultSpeed);
    runStyle.transform();
    // TODO: ライン未検出，転倒時の例外を投げる
    // if ( ~~~ ) {
    //     throw new LineNotFoundException();
    // }
  }
}