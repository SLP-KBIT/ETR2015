package entity.device.motor;

public final class TailMotor extends Motor
{
  public TailMotor()
  {
    super('C');
  }

  public void setSpeed(int speed)
  {
    this.motor.setSpeed(speed);
  }

  public void setLotate(int angle)
  {
    this.motor.rotate(angle);
  }
}
