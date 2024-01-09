package org.project.domain.registry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Registry {
    private List<SensorType> sensorTypes;
    private List<DeviceType> deviceTypes;

    public Registry() {
        this.sensorTypes = new ArrayList<>();
        this.deviceTypes = new ArrayList<>();
    }
    //if sensor type is not in the registry, add it
    //else instantiate sensor type but don't add it
    public SensorType createSensorType(String name, String description, String units) throws IllegalArgumentException {
        SensorType sensorType = new SensorType(name, description, units);
        for (SensorType existingSensorType : sensorTypes) {
            if (name.equals(existingSensorType.getSensorTypeName())) {
                return sensorType;
            }
        }
        sensorTypes.add(sensorType);
        return sensorType;
    }
    //if device type is not in the registry, add it
    //else instantiate device type but don't add it
    public DeviceType createDeviceType(String name, String description) throws IllegalArgumentException {
        DeviceType deviceType = new DeviceType(name, description);
        for (DeviceType existingDeviceType : deviceTypes) {
            if (name.equals(existingDeviceType.getDeviceTypeName())) {
                return deviceType;
            }
        }
        deviceTypes.add(deviceType);
        return deviceType;
    }

}
