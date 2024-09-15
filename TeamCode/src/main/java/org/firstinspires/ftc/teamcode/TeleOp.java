package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;


@com.qualcomm.robotcore.eventloop.opmode.TeleOp
public class TeleOp extends LinearOpMode {
    Module mod;
    Mecanum mecanum;
    @Override
    public void runOpMode() throws InterruptedException {
        //mod = new Module();
        mecanum=new Mecanum(this);
        waitForStart();
        while (opModeIsActive()){
            mecanum.TeleOp();
        }

        //mod.Push();
    }
}
