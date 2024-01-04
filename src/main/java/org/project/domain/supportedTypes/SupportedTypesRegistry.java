package org.project.domain.supportedTypes;

import java.util.ArrayList;
import java.util.List;

public class SupportedTypesRegistry {
    private List<DeviceType> supportedDevices;
    private List<SensorType> supportedSensors;

    // private constructor to avoid external use of constructor
    private SupportedTypesRegistry() {
        List<DeviceType> supportedDeviceTypes = new ArrayList<>();
        List<SensorType> supportedSensorTypes = new ArrayList<>();
        }
        public void addSupportedDevice(DeviceType type) {
            supportedDevices.add(type);
        }
        public boolean isDeviceSupported(DeviceType type) {
            return supportedDevices.contains(type);
        }
        public void addSupportedSensor(SensorType type) {
            supportedSensors.add(type);
        }
        public boolean isSensorSupported(SensorType type) {
            return supportedSensors.contains(type);
        }
    }
