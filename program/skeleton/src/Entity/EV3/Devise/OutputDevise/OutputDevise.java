package Entity.EV3.Devise.OutputDevise;

import Entity.EV3.Devise.Devise;

public abstract class OutputDevise extends Devise
{
  public OutputDevise() {}

  public abstract void setValue(int value);
}