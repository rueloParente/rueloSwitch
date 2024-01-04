package org.project.domain.supportedTypes;

public class SensorType {
    private String name;
    private String description;
    private String units;
    private boolean digital;

    public SensorType(String name, String description, String units, boolean digital) throws IllegalArgumentException{
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Please enter a valid name for the sensor type.");
        }
        this.name = name;
        if (description == null || description.trim().isEmpty()) {
            throw new IllegalArgumentException("Please enter a valid description for the sensor type.");
        }
        this.description = description;
        if (units == null || units.trim().isEmpty()) {
            throw new IllegalArgumentException("Please enter a valid unit for the sensor type.");
        }
        this.units = units;
        this.digital = digital;
    }
    public String getName() {
        return name;
    }
}
