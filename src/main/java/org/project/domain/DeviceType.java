package org.project.domain;

//Creating a class named DeviceType can provide a structured and extensible way to manage different devices in your smart home project.
//This approach offers several benefits over using a list of strings:
//-Safety: A DeviceType class can prevent the use of invalid or unsupported device types.
//-Extensibility: It's easier to add new device types and associated behaviors or properties.
//-Maintainability: A class can encapsulate device-specific logic, making the code more organized and easier to maintain.
//-Readability: Code that works with well-defined classes is typically more readable than code that uses strings for complex concepts.
public class DeviceType {
    private String name;
    private String description;

    public DeviceType() {
    }

    // Getters and Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {

        this.description = description;
    }
    public String getName() {
        return name;
    }
}
