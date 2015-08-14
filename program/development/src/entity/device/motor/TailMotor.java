package entity.device.motor;

public final class TailMotor extends Motor
{
  public TailMotor()
  {
    super('A');
    this.motor.setSpeed(10000);
  }

  public void setSpeed(int speed)
  {
    this.motor.setSpeed(speed);
    this.motor.forward();
  }

  public void setLotate(int angle)
  {
    this.motor.rotateTo(angle, true);
  }
}
