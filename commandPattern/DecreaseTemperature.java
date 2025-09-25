package commandPattern;

public class DecreaseTemperature implements Command {
    private Device device;

    public DecreaseTemperature(Device device) {
        this.device = device;
    }

    @Override
    public String execute() {
        if (device instanceof Thermostat) {
            return ((Thermostat) device).decreaseTemperature();
        }
        return "Command not supported for this device.";
    }
}