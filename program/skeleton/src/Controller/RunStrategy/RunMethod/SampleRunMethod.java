package Controller.RunStrategy.RunMethod;

public class SampleRunMethod extends RunMethod
{
    public SampleRunMethod()
    {
        super();
    }
    
    // threshold : 閾値
    public int calctTreshold()
    {
        System.out.println("calclate treshold by " + this.getClass());
        return 0;
    }
}
