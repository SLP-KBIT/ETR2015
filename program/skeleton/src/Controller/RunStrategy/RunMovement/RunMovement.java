package Controller.RunStrategy.RunMovement;

public abstract class RunMovement
{

  public RunMovement() {}

  public abstract int calcTreshold();

  public abstract void execRun(int turn, int speed);
}