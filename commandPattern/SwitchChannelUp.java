package commandPattern;

public class SwitchChannelUp implements Command {
    private Device device;

    public SwitchChannelUp(Device device) {
        this.device = device;
    }

    @Override
    public String execute() {
        if (device instanceof Tv) {
            return ((Tv) device).switchChannelUp();
        }
        return "Command not supported for this device.";
    }
}