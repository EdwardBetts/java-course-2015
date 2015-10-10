package org.usfirst.frc.team3506.robot;

import org.usfirst.frc.team3506.robot.commands.AutoCommandGroup;
import org.usfirst.frc.team3506.robot.commands.TimedFiringCommand;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	private Joystick gamepad;

	public OI() {
		gamepad = new Joystick(3);
		
		new JoystickButton(gamepad, 3).whenPressed(new TimedFiringCommand(0.3, 3));
		new JoystickButton(gamepad, 4).whenPressed(new AutoCommandGroup());
	}
	
	public Joystick getJoystick() {
		return gamepad;
	}


}
