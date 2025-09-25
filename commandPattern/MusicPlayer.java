package commandPattern;

public class MusicPlayer implements Device {
    public String switchOn() {
        return "MusicPlayer is playing default playlist!";
    }

    public String switchOff() {
        return "MusicPlayer is off!";
    }

    public String decreaseVolume() {
        return "Volume decreased!";
    }

    public String increaseVolume() {
        return "Volume increased!";
    }
    public String increaseTemperature() {
        return "Command not supported for MusicPlayer.";
    }
    public String decreaseTemperature() {
        return "Command not supported for MusicPlayer.";
    }
    public String dimmed() {
        return "Command not supported for MusicPlayer.";
    }
    public String changelightColor() {
        return "Command not supported for MusicPlayer.";
    }
}