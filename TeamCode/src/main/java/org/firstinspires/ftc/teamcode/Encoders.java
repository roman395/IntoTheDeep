package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DistanceSensor;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

@TeleOp
public class Encoders extends LinearOpMode {
    public DcMotor motor;


    @Override
    public void runOpMode() throws InterruptedException {

        motor=hardwareMap.get(DcMotor.class,"Motor");




        waitForStart();

        while (opModeIsActive()){
            if(gamepad1.a){
                motor.setPower(0.1);
                motor.setTargetPosition(145);
                motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            }
            if(gamepad1.b){
                motor.setPower(1);
                motor.setTargetPosition(-145);
                motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            }
            telemetry.addData("Encode52",motor.getCurrentPosition());

            telemetry.addLine("Heloooo");

            telemetry.update();
        }
    }
}
