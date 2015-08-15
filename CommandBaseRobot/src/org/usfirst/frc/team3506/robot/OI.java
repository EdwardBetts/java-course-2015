package org.usfirst.frc.team3506.robot;

import org.usfirst.frc.team3506.robot.commands.AutoCommandGroup;
import org.usfirst.frc.team3506.robot.commands.DriveBackwardCommand;
import org.usfirst.frc.team3506.robot.commands.DriveForwardCommand;
import org.usfirst.frc.team3506.robot.commands.TimedDriveCommand;

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
		setJoystickButtonCommand(gamepad, 2, new DriveBackwardCommand(0.5d));
		
		new JoystickButton(gamepad, 3).whenPressed(new TimedDriveCommand(0.5, 2.0d));
		new JoystickButton(gamepad, 4).whenPressed(new AutoCommandGroup());
	}

	private void setJoystickButtonCommand(Joystick joystick, int button,
			Command command) {
		new JoystickButton(joystick, button).whileHeld(command);
	}
	
	public Joystick getJoystick() {
		return gamepad;
	}

}
