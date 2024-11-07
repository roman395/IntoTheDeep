package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class Intake{
    CRServo s;
    LinearOpMode linearOpMode;
    HardwareMap hardwareMap;
    Gamepad g;
    public Intake(LinearOpMode linearOpMode) {
        this.linearOpMode=linearOpMode;
        hardwareMap=linearOpMode.hardwareMap;
        s=hardwareMap.get(CRServo.class,"Intake");
        g=linearOpMode.gamepad2;
    }
    public void Input(){
        s.setPower(1);
    }
    public void Output(){
        s.setPower(-1);
    }
    public void Off(){
        s.setPower(0);
    }

}
