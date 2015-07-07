package Controller;

import Controller.RunStrategy.*;
import Entity.EV3.EV3;
import Exception.LineNotFoundException;

public class Runner
{
    private static final EV3 ev3 = new EV3();

    public Runner()
    {
        
    }

    public void run()
    {
        System.out.println("runninng...");
        RunStrategy strategy = new SampleStrategy(this.getEV3());
        strategy.exec();
    }

    private EV3 getEV3()
    {
        return ev3;
    }
}
