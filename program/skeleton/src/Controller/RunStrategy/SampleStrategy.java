package Controller.RunStrategy;

import Controller.RunStrategy.RunMethod.*;

public class SampleStrategy extends RunStrategy
{
    public SampleStrategy()
    {
        super();
    }

    public void exec()
    {
        System.out.println("execute strategy :" + this.getClass());
        RunMethod runMethod = new SampleRunMethod();
        // TODO: ライン未検出，転倒時の例外を投げる
        // if ( ~~~ ) {
        //     throw new LineNotFoundException();
        // }
    }
}
