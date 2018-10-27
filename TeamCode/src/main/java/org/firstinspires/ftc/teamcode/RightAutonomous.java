package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous(name="RightAutonomous", group="Autonomous")
public class RightAutonomous extends OpMode {

    private ElapsedTime runtime = new ElapsedTime();

    private DcMotor leftfrontDrive = null;
    private DcMotor rightfrontDrive = null;
    private DcMotor leftbackDrive = null;
    private DcMotor rightbackDrive = null;

    boolean bDebug = false;

    @Override
    public void init() {
        try {
            leftfrontDrive = hardwareMap.get(DcMotor.class, "frontLeft");
            leftfrontDrive.setDirection(DcMotor.Direction.REVERSE);
            leftfrontDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

            rightfrontDrive = hardwareMap.get(DcMotor.class, "frontRight");
            rightfrontDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

            leftbackDrive = hardwareMap.get(DcMotor.class, "backLeft");
            leftbackDrive.setDirection(DcMotor.Direction.REVERSE);
            leftbackDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

            rightbackDrive = hardwareMap.get(DcMotor.class, "backRight");
            rightbackDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            rightbackDrive.setDirection(DcMotor.Direction.REVERSE);
        }
        catch (IllegalArgumentException iax) {
            bDebug = true;
        }
    }

    public void loop(){


        //Kill 3 seconds

        runtime.reset();

        while(runtime.seconds() < 3){

        }

        runtime.reset();

        while(runtime.seconds() < 0.5){

            leftfrontDrive.setPower(1);
            leftbackDrive.setPower(1);
            rightfrontDrive.setPower(1);
            rightbackDrive.setPower(1);
        }

        runtime.reset();

        while(runtime.seconds() < 0.5){

            leftfrontDrive.setPower(-1);
            leftbackDrive.setPower(-1);
            rightfrontDrive.setPower(1);
            rightbackDrive.setPower(1);
        }

        while(runtime.seconds() < 1.5){

            leftfrontDrive.setPower(1);
            leftbackDrive.setPower(1);
            rightfrontDrive.setPower(1);
            rightbackDrive.setPower(1);
        }

    }
    public void stop(){

    }
}
