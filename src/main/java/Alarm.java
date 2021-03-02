public class Alarm
{
    private final double LowPressureThreshold = 17;
    private final double HighPressureThreshold = 21;

    public boolean check(Sensor sensor) {
        double psiPressureValue = sensor.popNextPressurePsiValue();
        return psiPressureValue < LowPressureThreshold || HighPressureThreshold < psiPressureValue;
    }
}
