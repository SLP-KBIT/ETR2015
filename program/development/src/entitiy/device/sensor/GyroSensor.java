package entitiy.device.sensor;

import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3GyroSensor;
import lejos.hardware.sensor.SensorMode;
import lejos.robotics.SampleProvider;

public class GyroSensor
{
  private EV3GyroSensor _gyro;
  private SampleProvider _rate;
  private float[] _sampleGyro;
  
  public GyroSensor()
  {
    _gyro = new EV3GyroSensor(SensorPort.S4);
  }
  
  public SampleProvider getJyroSensor()
  {
    return _rate;
  }
  
  public void init()
  {
    _gyro.reset();
    _rate = _gyro.getRateMode();
    _sampleGyro = new float[_rate.sampleSize()];
  }
  
  public void close()
  {
    _gyro.close();
  }
  
  public float getSampleData()
  {
    _rate.fetchSample(_sampleGyro, 0);
    return _sampleGyro[0];
  }
}
