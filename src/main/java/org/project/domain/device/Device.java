package org.project.domain.device;

import org.project.domain.supportedTypes.DeviceType;
import org.project.domain.supportedTypes.SupportedTypesRegistry;

import java.util.List;

public class Device {
    private String name;
    private String description;
    private boolean status;
    private DeviceType deviceType;

    private List<Sensor> sensors;

    Device(String name, String description, DeviceType deviceType, List<Sensor> sensors) {
        this.description = description;
        this.name = name;
        this.deviceType = deviceType;
        this.sensors = sensors;
    }

}
