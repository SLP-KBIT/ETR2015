package controller.runstrategy.movement;

public abstract class Movement
{
  public Movement() {}

  public abstract int calcTreshold();

  public abstract void execRun(int turn, int speed);
}