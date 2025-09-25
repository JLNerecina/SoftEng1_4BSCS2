package commandPattern;

public class DecreaseVolume implements Command {
    private Device device;

    public DecreaseVolume(Device device) {
        this.device = device;
    }

    @Override
    public String execute() {
        if (device instanceof MusicPlayer) {
            return ((MusicPlayer) device).decreaseVolume();
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