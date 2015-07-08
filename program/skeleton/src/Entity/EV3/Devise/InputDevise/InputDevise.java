package Entity.EV3.Devise.InputDevise;

import Entity.EV3.Devise.Devise;

public abstract class InputDevise extends Devise {
  public InputDevise() {
  }
  
  public abstract int getValue();

  public abstract float getFloatValue();
}
