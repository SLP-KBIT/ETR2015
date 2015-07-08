package Controller.RunStrategy.RunStyle;

import Entity.EV3.EV3;

public class SampleRunStyle extends RunStyle {
  public SampleRunStyle(EV3 ev3) {
    super(ev3);
  }

  public void transform() {
    System.out.println("transform robot by " + this.getClass());
    ev3.tailMotor.setLotate(60);
  }
}