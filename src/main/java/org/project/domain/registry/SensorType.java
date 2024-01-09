package org.project.domain.registry;

public class SensorType {
    private String name;
    private String description;
    private String units;

    SensorType(String name, String description, String units) throws IllegalArgumentException{
        setSensorTypeName(name);
        setSensorTypeDescription(description);
        setSensorTypeUnits(units);
    }
    // Needed to identify the sensor name in the registry of supported types.
    // otherwise we would only get a memory address and would be hard to identify the sensor.
    public String getSensorTypeName() {
        return name;
    }
    boolean setSensorTypeName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Please enter a valid name for the sensor type.");
        }
        this.name = name;
        return true;
    }
    boolean setSensorTypeDescription(String description) {
        if (description == null || description.trim().isEmpty()) {
            throw new IllegalArgumentException("Please enter a valid description for the sensor type.");
        }
        this.description = description;
        return true;
    }
    boolean setSensorTypeUnits(String units) {
        if (units == null || units.trim().isEmpty()) {
            throw new IllegalArgumentException("Please enter a valid unit for the sensor type.");
        }
        this.units = units;
        return true;
    }
}
