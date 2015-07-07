package Controller.RunStrategy.RunMethod;

import Entity.EV3.EV3;

public abstract class RunMethod
{
    protected EV3 ev3;
    public RunMethod(EV3 ev3)
    {
        this.ev3 = ev3;
    }
    
    public abstract int calcTreshold();
    public abstract void execRun(int turn, int speed);
}