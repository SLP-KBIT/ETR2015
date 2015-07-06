package Entity.EV3.Devise.OutputDevise.Motor;

import Entity.EV3.Devise.OutputDevise.OutputDevise;

public abstract class Motor extends OutputDevise
{
    public Motor()
    {
        
    }
    public abstract void setSpeed(int speed);
    public abstract void setLotate(int lotate);
}
