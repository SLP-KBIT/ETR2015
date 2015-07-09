package Controller;

import Controller.RunStrategy.RunStrategy;
import Controller.RunStrategy.SampleStrategy;
import Entity.EV3.EV3;

public final class Runner
{
  private static final EV3 ev3 = new EV3();

  public static void run()
  {
    System.out.println("runninng...");
    RunStrategy strategy = new SampleStrategy();
    strategy.exec();
  }

  public static EV3 getEV3()
  {
    return ev3;
  }
}
