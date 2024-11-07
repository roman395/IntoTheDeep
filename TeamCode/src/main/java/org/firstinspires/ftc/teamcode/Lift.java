package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Lift{
    public DcMotor motorL;
    public DcMotor motorR;

    public int maxRot=10;
    public int minRot=0;

    LinearOpMode linearOpMode;
    HardwareMap hardwareMap;

    public Lift(LinearOpMode linearOpMode){
        this.linearOpMode=linearOpMode;
        hardwareMap=linearOpMode.hardwareMap;

        motorL=hardwareMap.get(DcMotor.class,"leftLift");
        motorR=hardwareMap.get(DcMotor.class,"rightLift");

        motorR.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorL.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        motorL.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motorR.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        motorL.setTargetPosition(10);
        motorR.setTargetPosition(-10);

        motorL.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorR.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

    }
    public void Up(){
        if (motorR.getTargetPosition()<maxRot&&motorL.getTargetPosition()<maxRot){
            motorL.setPower(-1);
            motorR.setPower(1);
        }
        else{Off();}
    }
    public void Down(){
        if(motorR.getTargetPosition()>minRot&&motorL.getTargetPosition()>minRot){
            motorR.setPower(1);
            motorL.setPower(-1);
        }
        else{Off();}
    }
    public void Off(){
        motorL.setPower(0);
        motorR.setPower(0);
    }


}
