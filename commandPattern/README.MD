## Programming Challenge

Smart Home Automation

Imagine you're building a smart home automation system where various devices (lights, thermostat, music player, etc.) can be controlled remotely using a central hub or app. Each device has different functionalities, but you want to create a unified and flexible control mechanism.

Design a system that allows you to control multiple smart home devices with ease. Your goal is to create a solution where:

1. You can control a variety of devices from a central hub or app, sending commands like "Turn On," "Turn Off," "Increase Temperature," "Decrease Volume," etc.
2. Each device has unique actions associated with these commands. For example, turning on the lights might involve changing their brightness level, while turning on the music player may involve playing a specific playlist.
3. New devices can be seamlessly integrated into the system without modifying existing code. You want to ensure that adding a new device doesn't require changes to the central control logic.
4. Devices can be controlled without the central hub or app needing to understand the internal workings of each device. It should send high-level commands without needing low-level details.

Your challenge is to apply a design pattern that provides a flexible and scalable way to control a variety of smart home devices, ensuring that new devices can be added without disrupting the existing system's functionality.

## UML Diagram
![alt text](https://github.com/JLNerecina/SoftEng1_4BSCS2/blob/master/commandPattern/commandPatternImage.png)

## Components

Command (Interface): Defines the execute() method that all concrete commands implement to enable polymorphic command execution.

Device (Interface): Specifies operations like switchOn() and increaseVolume() that all receiver devices must support.

SmartHomeHub (Class): An invoker that stores and executes a command via executeCommand(), returning the command's result.

RemoteControl (Class): An invoker that triggers a stored command's execute() method when clickButton() is called.

Tv (Class): A receiver representing a TV, supporting operations like switchOn() and switchChannelUp().

Stereo (Class): A receiver representing a stereo system, supporting switchOn() and volume control operations.

Lights (Class): A receiver representing a smart lighting system, supporting dimmed() and changelightColor().

Thermostat (Class): A receiver representing a thermostat, supporting increaseTemperature() and decreaseTemperature().

MusicPlayer (Class): A receiver representing a music player, supporting switchOn() and volume control.

PowerOn (Class): A concrete command that encapsulates the switchOn() method of any device.

PowerOff (Class): A concrete command that encapsulates the switchOff() method of any device.

IncreaseVolume (Class): A concrete command that encapsulates the increaseVolume() method for MusicPlayer, Stereo, or TV.

DecreaseVolume (Class): A concrete command that encapsulates the decreaseVolume() method for MusicPlayer, Stereo, or TV, but incorrectly calls increaseVolume() for Stereo and TV.

IncreaseTemperature (Class): A concrete command that encapsulates the increaseTemperature() method for a Thermostat.

DecreaseTemperature (Class): A concrete command that encapsulates the decreaseTemperature() method for a Thermostat.

Dimmed (Class): A concrete command that encapsulates the dimmed() method for a Lights device.

ChangeLightColor (Class): A concrete command that encapsulates the changelightColor() method for a Lights device.

SwitchChannelUp (Class): A concrete command that encapsulates the switchChannelUp() method for a TV.

SwitchChannelDown (Class): A concrete command that encapsulates the switchChannelDown() method for a TV.

ViewerApp (Class): The client that creates devices and commands, using SmartHomeHub to demonstrate command execution.
