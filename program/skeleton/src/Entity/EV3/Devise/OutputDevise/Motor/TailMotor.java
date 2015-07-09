package Entity.EV3.Devise.OutputDevise.Motor;

public final class TailMotor extends Motor
{
  public TailMotor(int port)
  {
    super(port);
  }

  public void setSpeed(int speed)
  {
    System.out.println("set speed : " + String.valueOf(speed));
  }
  
  public void setLotate(int lotate)
  {
    System.out.println("set lotate : " + String.valueOf(lotate));
  }
}
