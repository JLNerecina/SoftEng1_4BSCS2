package commandPattern;

public class SwitchChannelDown implements Command {
    private Device device;

    public SwitchChannelDown(Device device) {
        this.device = device;
    }

    @Override
    public String execute() {
        if (device instanceof Tv) {
            return ((Tv) device).switchChannelDown();
        }
        return "Command not supported for this device.";
    }
}