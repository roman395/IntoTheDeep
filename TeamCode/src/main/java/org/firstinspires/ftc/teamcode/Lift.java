package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.Servo;

public class Lift extends LinearOpMode {
    public Servo s;
    @Override
    public void runOpMode() throws InterruptedException {
        s=hardwareMap.get(Servo.class,"servo1");

    }
    public void Up(){
        s.setPosition(100);

    }
    public void Down(){
        s.setPosition(0);
    }
}
