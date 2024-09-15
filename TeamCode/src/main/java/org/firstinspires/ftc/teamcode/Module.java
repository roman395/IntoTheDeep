package org.firstinspires.ftc.teamcode;


public class Module {
    Lift l;
    public void Push() throws InterruptedException {
        l.Up();
        wait(1);
        l.Down();
    }
}
