
package org.usfirst.frc.team3506.robot;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	
	Joystick joystick;
	RobotDrive drivetrain;
	Talon shootMotor;
	Compressor compressor;
	DoubleSolenoid frontPiston;
	DoubleSolenoid rearPiston;
	
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    	joystick = new Joystick(3);
    	drivetrain = new RobotDrive(0, 3, 1, 2);
    	shootMotor = new Talon(4);
    	compressor = new Compressor();
    	frontPiston = new DoubleSolenoid(0, 1);
    	rearPiston = new DoubleSolenoid(4, 5);
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        double leftY = joystick.getRawAxis(1);
        double rightY = joystick.getRawAxis(5);
        double rightTrigger = joystick.getRawAxis(3);
        
        leftY *= 0.75;
        rightY *= 0.75;
        rightTrigger *= 0.75;
        
        drivetrain.tankDrive(leftY, rightY);
        shootMotor.set(rightTrigger);
        
        if (joystick.getRawButton(1)) {
        	compressor.start();
        } else if (joystick.getRawButton(2)) {
        	compressor.stop();
        }
        
        if (joystick.getRawButton(3)) {
        	frontPiston.set(Value.kForward);
        	rearPiston.set(Value.kForward);
        } else if (joystick.getRawButton(4)) {
        	frontPiston.set(Value.kReverse);
        	rearPiston.set(Value.kReverse);
        }
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
}
