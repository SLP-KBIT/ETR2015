package Controller.RunStrategy.RunStyle;

import Entity.EV3.EV3;

public abstract class RunStyle {
  protected EV3 ev3;

  public RunStyle(EV3 ev3) {
    this.ev3 = ev3;
  }

  public abstract void transform();
}
