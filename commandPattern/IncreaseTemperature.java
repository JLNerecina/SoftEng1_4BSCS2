package commandPattern;

public class IncreaseTemperature implements Command {
    private Device device;

    public IncreaseTemperature(Device device) {
        this.device = device;
    }

    @Override
    public String execute() {
        if (device instanceof Thermostat) {
            return ((Thermostat) device).increaseTemperature();
        }
        return "Command not supported for this device.";
    }
}