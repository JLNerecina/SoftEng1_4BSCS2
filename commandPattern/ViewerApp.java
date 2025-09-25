package commandPattern;

public class ViewerApp {
    public static void main(String[] args) {
        // TV
        Device tv = new Tv();
        SmartHomeHub hub = new SmartHomeHub();
        hub.setCommand(new PowerOn(tv));
        System.out.println(hub.executeCommand());
        hub.setCommand(new PowerOff(tv));
        System.out.println(hub.executeCommand());
        hub.setCommand(new IncreaseVolume(tv));
        System.out.println(hub.executeCommand());
        hub.setCommand(new DecreaseVolume(tv));
        System.out.println(hub.executeCommand());
        hub.setCommand(new SwitchChannelUp(tv));
        System.out.println(hub.executeCommand());
        hub.setCommand(new SwitchChannelDown(tv));
        System.out.println(hub.executeCommand());

        // Stereo
        Device stereo = new Stereo();
        hub.setCommand(new PowerOn(stereo));
        System.out.println(hub.executeCommand());
        hub.setCommand(new PowerOff(stereo));
        System.out.println(hub.executeCommand());
        hub.setCommand(new IncreaseVolume(stereo));
        System.out.println(hub.executeCommand());
        hub.setCommand(new DecreaseVolume(stereo));
        System.out.println(hub.executeCommand());

        // Lights
        Device lights = new Lights();
        hub.setCommand(new PowerOn(lights));
        System.out.println(hub.executeCommand());
        hub.setCommand(new PowerOff(lights));
        System.out.println(hub.executeCommand());
        hub.setCommand(new Dimmed(lights));
        System.out.println(hub.executeCommand());
        hub.setCommand(new ChangeLightColor(lights));
        System.out.println(hub.executeCommand());

        // Thermostat
        Device thermostat = new Thermostat();
        hub.setCommand(new PowerOn(thermostat));
        System.out.println(hub.executeCommand());
        hub.setCommand(new PowerOff(thermostat));
        System.out.println(hub.executeCommand());
        hub.setCommand(new DecreaseTemperature(thermostat));
        System.out.println(hub.executeCommand());
        hub.setCommand(new IncreaseTemperature(thermostat));
        System.out.println(hub.executeCommand());

        // MusicPlayer
        Device musicPlayer = new MusicPlayer();
        hub.setCommand(new PowerOn(musicPlayer));
        System.out.println(hub.executeCommand());
        hub.setCommand(new PowerOff(musicPlayer));
        System.out.println(hub.executeCommand());
        hub.setCommand(new IncreaseVolume(musicPlayer));
        System.out.println(hub.executeCommand());
        hub.setCommand(new DecreaseVolume(musicPlayer));
        System.out.println(hub.executeCommand());
    }
}