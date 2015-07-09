package Controller.RunStrategy;

import Controller.RunStrategy.RunMovement.RunMovement;
import Controller.RunStrategy.RunMovement.SampleRunMovement;
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
    RunMovement runMethod = new SampleRunMovement();
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