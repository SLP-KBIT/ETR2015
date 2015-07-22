package controller;

import controller.runstrategy.RunStrategy;
import controller.runstrategy.RunStrategyCreator;
import entity.EV3;

public class Runner
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
