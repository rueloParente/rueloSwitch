package org.project.domain.house;

public class Dimensions {
    private double width;
    private double length;
    private double height;

    Dimensions(double width, double length, double height) throws IllegalArgumentException {
        setWidth(width);
        setLength(length);
        setHeight(height);
    }

    public void setWidth(double width) throws IllegalArgumentException {
        if (width <= 0) {
            throw new IllegalArgumentException("Please enter a valid width for the room.");
        }
        this.width = width;
    }
    public void setLength(double length) throws IllegalArgumentException {
        if (length <= 0) {
            throw new IllegalArgumentException("Please enter a valid length for the room.");
        }
        this.length = length;
    }
    //Allows 0 height for exterior spaces
    public void setHeight(double height) throws IllegalArgumentException {
        if (height < 0) {
            throw new IllegalArgumentException("Please enter a valid height for the room.");
        }
        this.height = height;
    }
}
