package org.project.domain.device;

import org.project.domain.supportedTypes.SensorType;
import org.project.domain.supportedTypes.SupportedTypesRegistry;

public class Sensor {
    private String name;
    private String description;
    private boolean status;
    private SensorType sensorType;


    Sensor(String name, String description, SensorType sensorType) {
            this.description = description;
            this.name = name;
            this.status = false;
            this.sensorType = sensorType;
        }
    }


