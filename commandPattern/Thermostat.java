package commandPattern;

public class Thermostat implements Device {
    public String switchOn() {
        return "Thermostat is on!";
    }

    public String switchOff() {
        return "Thermostat is off!";
    }

    public String increaseTemperature() {
        return "Temperature increased by 1°C!";
    }

    public String decreaseTemperature() {
        return "Temperature decreased by 1°C!";
    }
    public String increaseVolume() {
        return "Command not supported for Thermostat.";
    }
    public String decreaseVolume() {
        return "Command not supported for Thermostat.";
    }
    public String dimmed() {
        return "Command not supported for Thermostat.";
    }
    public String changelightColor() {
        return "Command not supported for Thermostat.";
    }
}