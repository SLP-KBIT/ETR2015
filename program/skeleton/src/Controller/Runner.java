package Controller;

import Controller.RunStrategy.*;
import Exception.LineNotFoundException;

public class Runner
{
    public Runner()
    {
        
    }

    public void run()
    {
        System.out.println("runninng...");
        RunStrategy strategy = new SampleStrategy();
        strategy.exec();
    }
}
