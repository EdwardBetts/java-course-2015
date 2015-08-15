package org.usfirst.frc.team3506.robot.subsystems;


import org.usfirst.frc.team3506.robot.commands.UserDriveCommand;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	RobotDrive driveTrain;
	
	public DriveSubsystem() {
		driveTrain = new RobotDrive(0, 3, 1, 2);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new UserDriveCommand());
    }
    
    public void driveForward(double power) {
    	driveTrain.tankDrive(power, power);
    }
    
    public void driveBackards(double power) {
    	driveTrain.tankDrive(-power, -power);
    }
    
    public void drive(double leftPower, double rightPower) {
    	driveTrain.tankDrive(leftPower, rightPower);
    }
}


