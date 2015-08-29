package org.usfirst.frc.team3506.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class CatapultSubsystem extends Subsystem {
    
    Compressor compressor;
    DoubleSolenoid piston1;
    DoubleSolenoid piston2;
    
    public CatapultSubsystem() {
    	compressor = new Compressor();
    	piston1 = new DoubleSolenoid(0, 1);
    	piston2 = new DoubleSolenoid(4, 5);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void compressorStart() {
    	compressor.start();
    }
    
    public void compressorStop() {
    	compressor.stop();
    }
    
    public void raiseCatapult() {
    	piston1.set(Value.kReverse);
    	piston2.set(Value.kReverse);
    }
    
    public void lowerCatapult() {
    	piston1.set(Value.kForward);
    	piston2.set(Value.kForward);
    }
}






