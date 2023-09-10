package org.firstinspires.ftc.teamcode;

public class Constants {
    public static double sens                     = 0.1;
    public static double triggerSens              = 0.5;

    public static double manualServoDelta         = .01;

    /* servo variables */
    public static double driveSpeedIntake         = 0.5;
    public static double driveSpeedManeuvering    = 0.75;
    public static double driveSpeedOuttakeQueue   = 0.5;
    public static double driveSpeedOuttakeReady   = 0.3;
    public static double driveSpeedConeRight      = 0.25;

    public static double slideHighPower           = 0.8;
    public static double slideMedPower            = 0.8;
    public static double slideLowPower            = 0.8;
    public static double slideBasePower           = 0.8;
    public static double slideDropConePower       = 0.3;

    public static double grabberClosePos          = 0.97;
    public static double grabberOpenPos           = 0.8;

    public static double wristUpPos               = 0.05;
    public static double wristDownPos             = 0.78;
    public static double wristConeRightPos        = 0.97;

    public static double twisterCenterPos         = 0.512;
    public static double twisterRightPos          = 0.485;
    public static double twisterLeftPos           = 0.542;

    public static double turretCenterPos          = 0.5;
    public static double turretRightPos            = 0.96;
    public static double turretLeftPos           = 0.04;

    public static double leftOdoRetractPos        = 0.0;
    public static double leftOdoDropPos           = 0.3;

    public static double rightOdoRetractPos       = 0.0;
    public static double rightOdoDropPos          = 0.3;

    /* encoder tick variables */
    public static int sliderBasePos               = 0;
    public static int sliderStackedConePos        = 45;
    public static int sliderConeRightPos          = 80;
    public static int sliderLowPos                = 425;
    public static int sliderMedPos                = 815;
    public static int sliderHighPos               = 1115;
    public static int sliderDunkDelta             = 100;
    public static int sliderIntakeDelta           = 50;
    public static int sliderOuttakeDelta          = 150;
    public static int sliderMaxPos                = 1350;
    public static int sliderMinPos                = 0;
    public static int coneClearDelta              = 180;
    public static int sliderTurretClearPos        = 320;

    /* timer variables */
    public static double slideDownDelay           = 0.15;
    public static double slideStallDelay          = 3;
    public static double wristGrabDelay           = 0.3;
    public static double wristTurretTurnDelay     = 0.35;
}
