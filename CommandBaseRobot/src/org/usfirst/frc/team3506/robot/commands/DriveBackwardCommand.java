package org.usfirst.frc.team3506.robot.commands;

import org.usfirst.frc.team3506.robot.Robot;

public class DriveBackwardCommand extends DriveForwardCommand {

	public DriveBackwardCommand(double power) {
		super(power);
	}
	
	@Override
	protected void execute() {
		Robot.driveSubsystem.driveBackards(power);
	}

}
