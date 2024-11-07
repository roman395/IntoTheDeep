package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;


@com.qualcomm.robotcore.eventloop.opmode.TeleOp
public class TeleOp extends LinearOpMode {
    Mecanum mecanum;
    Intake i;
    Lift l;
    Perekid p;
    @Override
    public void runOpMode() throws InterruptedException {
        mecanum=new Mecanum(this);
        i=new Intake(this);
        l=new Lift(this);
        p=new Perekid(this);
        waitForStart();
        while (opModeIsActive()){

            mecanum.TeleOp();
            if(gamepad2.dpad_up){l.Up();}
            else if (gamepad2.dpad_down) {l.Down();}
            else {l.Off();}

            if(gamepad2.x){i.s.setPower(-1);}
            else if(gamepad2.circle){i.s.setPower(1);}
            else {i.s.setPower(0);}




        }

    }
}
