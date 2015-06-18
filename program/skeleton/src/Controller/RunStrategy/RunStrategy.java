package Controller.RunStrategy;

public abstract class RunStrategy
{
  protected int defaultSpeed;

  public RunStrategy()
  {
    this.defaultSpeed = 100;
  }

  public abstract void exec();
}
