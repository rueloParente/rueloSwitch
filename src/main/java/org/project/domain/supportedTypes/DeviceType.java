package org.project.domain.supportedTypes;

public class DeviceType {
    private String name;
    private String description;


    public DeviceType(String name, String description) throws IllegalArgumentException{
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Please enter a valid name for the device type.");
        }
        this.name = name;
        if (description == null || description.trim().isEmpty()) {
            throw new IllegalArgumentException("Please enter a valid description for the device type.");
        }
        this.description = description;
    }

    public String getName() {
        return name;
    }
}
