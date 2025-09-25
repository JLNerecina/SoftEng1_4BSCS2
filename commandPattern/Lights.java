package commandPattern;

public class Lights implements Device {
    public String switchOn() {
        return "Lights are on!";
    }

    public String switchOff() {
        return "Lights are off!";
    }

    public String dimmed() {
        return "Lights dimmed to 50% brightness!";
    }

    public String changelightColor() {
        return "Lights changed to warm white!";
    }
    public String increaseTemperature() {
        return "Command not supported for Lights.";
    }
    public String decreaseTemperature() {
        return "Command not supported for Lights.";
    }
    public String increaseVolume() {
        return "Command not supported for Lights.";
    }
    public String decreaseVolume() {
        return "Command not supported for Lights.";
    }

}