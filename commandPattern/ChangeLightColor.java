package commandPattern;

public class ChangeLightColor implements Command {
    private Device device;

    public ChangeLightColor(Device device) {
        this.device = device;
    }

    @Override
    public String execute() {
        if (device instanceof Lights) {
            return ((Lights) device).changelightColor();
        }
        return "Command not supported for this device.";
    }
}