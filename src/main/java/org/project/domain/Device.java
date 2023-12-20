package org.project.domain;

public interface Device {
    //This is an basic interface common to all devices, in here we can add more methods that are supported by all devices, sensor or actuator! This will allow us to use polymorphism in the future.
public String getName();
public String getDeviceType();
public Room getLocation();
}
