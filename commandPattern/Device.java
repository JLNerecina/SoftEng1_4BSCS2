package commandPattern;

public interface Device {
    String switchOn();
    String switchOff();
    String increaseTemperature();
    String decreaseTemperature();
    String increaseVolume();
    String decreaseVolume();
    String dimmed();
    String changelightColor();
}