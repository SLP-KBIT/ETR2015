package entity.device.motor;

public final class TailMotor extends Motor
{
  public TailMotor()
  {
    super('C');
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
