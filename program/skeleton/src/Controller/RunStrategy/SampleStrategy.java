package Controller.RunStrategy;

import Controller.RunStrategy.RunMethod.*;
import Controller.RunStrategy.RunStyle.*;
import Entity.EV3.EV3;

public class SampleStrategy extends RunStrategy
{
    public SampleStrategy(EV3 ev3)
    {
        super(ev3);
    }
    
    public SampleStrategy(EV3 ev3, int defaultSpeed)
    {
        super(ev3);
        this.defaultSpeed = defaultSpeed;
    }

    public void exec()
    {
        System.out.println("execute strategy of " + this.getClass());
        RunMethod runMethod = new SampleRunMethod(ev3);
        RunStyle runStyle = new SampleRunStyle(ev3);
        int turn = runMethod.calcTreshold();
        runMethod.execRun(turn, this.defaultSpeed);
        runStyle.transform();
        // TODO: ライン未検出，転倒時の例外を投げる
        // if ( ~~~ ) {
        //     throw new LineNotFoundException();
        // }
    }
}