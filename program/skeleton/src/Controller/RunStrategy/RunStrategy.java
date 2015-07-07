package Controller.RunStrategy;

import Entity.EV3.EV3;

public abstract class RunStrategy
{
    protected int defaultSpeed;
    protected EV3 ev3; // Singleton Pattern

    public RunStrategy(EV3 ev3)
    {
        this.ev3 = ev3;
        this.defaultSpeed = 100;
    }
    public abstract void exec();
}
