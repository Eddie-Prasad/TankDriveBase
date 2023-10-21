// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;


/** Add your docs here. */
public class DifferentialDrive2 extends SubsystemBase{

    private final Talon m_leftMotor1;
    private final Talon m_leftMotor2;
    private final Talon m_rightMotor1;
    private final Talon m_rightMotor2;

    public DifferentialDrive2() {
    m_leftMotor1 = new Talon(Constants.id_LEFTMOTOR1);
    m_leftMotor2 = new Talon(Constants.id_LEFTMOTOR2);
    m_rightMotor1 = new Talon(Constants.id_RIGHTMOTOR1);
    m_rightMotor2 = new Talon(Constants.id_RIGHTMOTOR2);

    m_rightMotor1.setInverted(true);
    m_rightMotor2.setInverted(true);
    }

    public void drive(double lJoystick, double rJoystick) {
      m_leftMotor1.set(lJoystick);
      m_leftMotor2.set(lJoystick);
      m_rightMotor1.set(rJoystick);
      m_rightMotor2.set(rJoystick);

    }

    @Override

    public void periodic() {

    }
}
