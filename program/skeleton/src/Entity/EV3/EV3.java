package Entity.EV3;

import Entity.EV3.Devise.*;
import Entity.EV3.Devise.InputDevise.*;
import Entity.EV3.Devise.InputDevise.Sensor.*;
import Entity.EV3.Devise.OutputDevise.*;
import Entity.EV3.Devise.OutputDevise.Motor.*;

public class EV3
{
    // motor
    public RunMotor leftMotor;
    public RunMotor rightMotor;
    public TailMotor tailMotor;
    // sensor
    public LightSensor lightSensor;
    public JyroSensor JyroSensor;

    public EV3()
    {
        this.leftMotor = new RunMotor(1);
        this.rightMotor = new RunMotor(2);
        this.tailMotor = new TailMotor(3);
        this.lightSensor = new LightSensor('A');
        this.JyroSensor = new JyroSensor('B');
    }
}
