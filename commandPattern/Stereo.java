package commandPattern;

public class Stereo implements Device {
    public String switchOn() {
        return "Stereo is playing!";
    }

    public String switchOff() {
        return "Stereo is off!";
    }
    public String increaseVolume() {
        return "Stereo volume increased!";
    }
    public String decreaseVolume() {
        return "Stereo volume decreased!";
    }
    public String dimmed() {
        return "Stereo does not support dimming!";
    }
    public String changelightColor() {
        return "Command not supported for MusicPlayer.";
    }
    public String increaseTemperature() {
        return "Command not supported for MusicPlayer.";
    }
    public String decreaseTemperature() {
        return "Command not supported for MusicPlayer.";
    }

}