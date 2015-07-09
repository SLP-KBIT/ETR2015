package Boundly.Mode;

import Controller.Runner;

public class RunMode extends Mode
{
  public RunMode()
  {
    super();
  }

  public void exec()
  {
    Runner.run();
  }
}
