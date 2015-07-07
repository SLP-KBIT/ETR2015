package Controller;

import Controller.RunStrategy.*;
import Entity.EV3.EV3;
import Exception.LineNotFoundException;

public class Runner
{
    private EV3 ev3;
    public Runner()
    {
        this.ev3 = new EV3();
    }

    public void run()
    {
        System.out.println("runninng...");
        RunStrategy strategy = new SampleStrategy(this.ev3);
        strategy.exec();
    }
}
