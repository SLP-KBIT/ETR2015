package Entity.EV3.Devise.OutputDevise.Motor;

public class TailMotor extends Motor
{
    public TailMotor()
    {
        super();
    }
    public void setSpeed(int speed)
    {
        System.out.println("set speed : " + String.valueOf(speed));
    }
    public void setLotate(int lotate)
    {
        System.out.println("set speed : " + String.valueOf(lotate));
    }
}
