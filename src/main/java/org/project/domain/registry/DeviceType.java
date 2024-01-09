package org.project.domain.registry;

public class DeviceType {
    private String name;
    private String description;


    DeviceType(String name, String description) throws IllegalArgumentException{
        setDeviceTypeName(name);
        setDeviceTypeDescription(description);
    }
    // Needed to identify the Device name in the registry of supported types.
    // otherwise we would only get a memory address and would be hard to identify the sensor.
    public String getDeviceTypeName() {
        return name;
    }
    boolean setDeviceTypeName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Please enter a valid name for the device type.");
        }
        this.name = name;
        return true;
    }
    boolean setDeviceTypeDescription(String description) {
        if (description == null || description.trim().isEmpty()) {
            throw new IllegalArgumentException("Please enter a valid description for the device type.");
        }
        this.description = description;
        return true;
    }
}
