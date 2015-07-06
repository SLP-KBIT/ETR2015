package Controller.RunStrategy;

import Controller.RunStrategy.RunMethod.*;
import Controller.RunStrategy.RunStyle.*;

public class SampleStrategy extends RunStrategy
{
    public SampleStrategy()
    {
        super();
    }

    public void exec()
    {
        System.out.println("execute strategy of " + this.getClass());
        RunMethod runMethod = new SampleRunMethod();
        RunStyle runStyle = new SampleRunStyle();
        runMethod.calcTreshold();
        runStyle.transform();
        // TODO: ライン未検出，転倒時の例外を投げる
        // if ( ~~~ ) {
        //     throw new LineNotFoundException();
        // }
    }
}
