package entity.device.motor;

public final class RunMotor extends Motor 
{
  public RunMotor(char port)
  {
    super(port);
  }

  public void setSpeed(int speed, Direction direction)
  {
    switch ( direction )
    {
      case Forward:
        this.motor.setSpeed(speed * 10);
        this.motor.forward();
        break;
      case Backword:
        this.motor.setSpeed(speed * 10);
        this.motor.backward();
        break;
      default:
        break;
    }
  }

  public void setLotate(int angle)
  {
    this.motor.rotate(angle);
  }
}
