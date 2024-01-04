package org.project.domain.device;

import org.project.domain.supportedTypes.DeviceType;
import org.project.domain.supportedTypes.SensorType;
import org.project.domain.supportedTypes.SupportedTypesRegistry;

import java.util.List;

public class Factory {
    private SupportedTypesRegistry supportedTypesRegistry;
    public Factory(SupportedTypesRegistry supportedTypesRegistry) {
        this.supportedTypesRegistry = supportedTypesRegistry;
    }
    public Device createDevice(String name, String description, DeviceType deviceType, List<Sensor> sensors) {
        if (supportedTypesRegistry.isDeviceSupported(deviceType)) {
            return new Device(name, description, deviceType, sensors);
        } else {
            throw new IllegalArgumentException("Device type " + deviceType.getName() + " is not supported");
        }
    }
    public Sensor createSensor(String name, String description, SensorType sensorType) {
        if (supportedTypesRegistry.isSensorSupported(sensorType)) {
            return new Sensor(name, description, sensorType);
        } else {
            throw new IllegalArgumentException("Sensor type " + sensorType.getName() + " is not supported");
        }
    }
}
