package controller.runrecoder;

import controller.Runner;
import entity.EV3;

public class RunRecoder
{
  private static Area _nowArea;
  private static int _totalLotate;

  public RunRecoder()
  {
    _nowArea = Area.No1;
  }

  public static String getNowArea()
  {
    return _nowArea.toString();
  }

  public void recode()
  {
    EV3 ev3 = Runner.getEV3();
    //_totalLotate =  ev3.getAveLotate();
  }

  public Area getArea()
  {
    // TODO: 走行距離に応じたエリアを返却する
    System.out.println("get area");
    return Area.No1;
  }

  private int getRawDistance() { return _totalLotate; }

  private int getDistanceOfcm()
  {
    // TODO: 角度からcmを計算して返却
    return _totalLotate;
  }
}
