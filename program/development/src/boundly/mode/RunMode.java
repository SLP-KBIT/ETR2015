package boundly.mode;

import controller.Runner;

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
