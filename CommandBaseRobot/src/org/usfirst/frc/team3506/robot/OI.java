package org.usfirst.frc.team3506.robot;

import org.usfirst.frc.team3506.robot.commands.DriveForwardCommand;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {	
	private Joystick gamepad;
	
	public OI() {
		gamepad = new Joystick(3);
		setJoystickButtonCommand(gamepad, 1, new DriveForwardCommand(0.5d));
	}
	
	private void setJoystickButtonCommand(Joystick joystick, int button, Command command) {
		new JoystickButton(joystick, button).whileHeld(command);
	}
	
}

