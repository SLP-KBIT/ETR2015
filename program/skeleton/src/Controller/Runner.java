package Controller;

import Controller.RunRecoder.RunRecoder;
import Controller.RunStrategy.RunStrategy;
import Controller.RunStrategy.RunStrategyCreator;
import Controller.RunStrategy.SampleStrategy;
import Entity.EV3.EV3;

public final class Runner
{
  private static final EV3 _ev3 = new EV3();

  public static void run()
  {
    System.out.println("runninng...");
    RunStrategy strategy = RunStrategyCreator.create();
    strategy.exec();
  }

  public static EV3 getEV3() { return _ev3;}
}
