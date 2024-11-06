package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Perekid{
    Servo s1;
    Servo s2;
    LinearOpMode linearOpMode;
    HardwareMap hardwareMap;
    Gamepad g;
    public Perekid(LinearOpMode linearOpMode){
        this.linearOpMode=linearOpMode;
        hardwareMap=linearOpMode.hardwareMap;
        g=linearOpMode.gamepad2;

        s1=hardwareMap.get(Servo.class,"Perekid1");
        s2=hardwareMap.get(Servo.class,"Perekid2");

    }
}
