package commandPattern;

public class IncreaseVolume implements Command {
    private Device device;

    public IncreaseVolume(Device device) {
        this.device = device;
    }

    @Override
    public String execute() {
        if (device instanceof MusicPlayer) {
            return ((MusicPlayer) device).increaseVolume();
        }
        else if (device instanceof Stereo) {
            return ((Stereo) device).increaseVolume();
        }
        else if (device instanceof Tv) {
            return ((Tv) device).increaseVolume();
        }
        else{
            return "Command not supported for this device.";
        }
    }

}