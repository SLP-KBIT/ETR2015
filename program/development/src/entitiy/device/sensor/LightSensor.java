package entitiy.device.sensor;

import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.SensorMode;

public class LightSensor
{
  private EV3ColorSensor _colorSensor;
  private SensorMode _light;           // 輝度検出モード
  private float[] _sampleLight;

  public LightSensor()
  {
    _colorSensor = new EV3ColorSensor(SensorPort.S3);
  }
  
  public void init()
  {
    _light = _colorSensor.getRedMode();     // 輝度検出モード
    _sampleLight = new float[_light.sampleSize()];
  }
  
  public float getSampleData()
  {
    _light.fetchSample(_sampleLight, 0);
    return _sampleLight[0];
  }
}
