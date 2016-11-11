package org.overpex;

public class Main {

    public static void main(String[] args) {
	// write your code here
        AdbWrapper adb = new AdbWrapper();

        adb.getDevices().forEach(device -> System.out.println(device.deviceId));
        adb.asRoot();
        adb.chargeSwitch(1);

    }
}
