package org.usfirst.frc.team3506.robot.subsystems;


import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public Talon talon1;
	public Talon talon2;
	public Talon talon3;
	public Talon talon4;
	
	public DriveSubsystem() {
		talon1 = new Talon(0);
		talon2 = new Talon(1);
		talon3 = new Talon(2);
		talon4 = new Talon(3);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void driveForward(double power) {
    	talon1.set(power);
    	talon2.set(power);
    	talon3.set(power);
    	talon4.set(power);
    }
    
    public void driveBackards(double power) {
    	power *= -1;
    	talon1.set(power);
    	talon2.set(power);
    	talon3.set(power);
    	talon4.set(power);
    }
}