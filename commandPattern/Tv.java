package commandPattern;

public class Tv implements Device {
    public String switchOn() {
        return "TV is switched-on!";
    }

    public String switchOff() {
        return "TV is switched-off!";
    }
    public String increaseVolume() {
        return "TV volume increased!";
    }
    public String decreaseVolume() {
        return "TV volume decreased!";
    }
    public String switchChannelUp() {
        return "TV channel switched up!";
    }

    public String switchChannelDown() {
        return "TV channel switched down!";
    }
    public String increaseTemperature() {
        return "Command not supported for TV.";
    }
    public String decreaseTemperature() {
        return "Command not supported for TV.";
    }
    public String dimmed() {
        return "Command not supported for TV.";
    }
    public String changelightColor() {
        return "Command not supported for TV.";
    }
}