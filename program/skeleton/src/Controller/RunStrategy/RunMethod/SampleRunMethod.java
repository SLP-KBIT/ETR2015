package Controller.RunStrategy.RunMethod;

import Entity.EV3.EV3;

public class SampleRunMethod extends RunMethod
{
    public SampleRunMethod(EV3 ev3)
    {
        super(ev3);
    }

    // threshold : 閾値
    public int calcTreshold()
    {
        ev3.lightSensor.getValue();
        System.out.println("calclate treshold by " + this.getClass());
        return 5;  // 適当な値
    }
    public void execRun(int turn, int speed)
    {
        System.out.println("execRun");
        this.ev3.leftMotor.setSpeed(speed - turn);
        this.ev3.rightMotor.setSpeed(speed + turn);
    }
}