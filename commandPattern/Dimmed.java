package commandPattern;

public class Dimmed implements Command {
    private Device device;

    public Dimmed(Device device) {
        this.device = device;
    }

    @Override
    public String execute() {
        if (device instanceof Lights) {
            return ((Lights) device).dimmed();
        }
        return "Command not supported for this device.";
    }
}