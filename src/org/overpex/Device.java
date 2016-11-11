package org.overpex;

/**
 * Created by overpex on 10/11/16.
 */
public class Device {

    public String deviceName;
    //TODO: Change the id type ...
    public String deviceId;

    public Device(String name, String id) {
        this.deviceName = name;
        this.deviceId = id;
    }
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

}
