package Controller.RunStrategy.RunStyle;

public class SampleRunStyle extends RunStyle
{
    public SampleRunStyle()
    {
        super();
    }
    public void transform()
    {
        System.out.println("transform robot by " + this.getClass());
    }
}
