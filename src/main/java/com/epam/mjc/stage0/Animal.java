package com.epam.mjc.stage0;

public class Animal {

    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public void setNumberOfPaws(int numberOfPaws) {
        this.numberOfPaws = numberOfPaws;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    public String getDescription() {
        if (getNumberOfPaws() == 1) {
            return "This animal is mostly " + getColor() + "." + " It has " + getNumberOfPaws() + " paw and a fur.";
        } else if (getNumberOfPaws() > 1 && isHasFur()) {
            return "This animal is mostly " + getColor() + "." + " It has " + getNumberOfPaws() + " paws and a fur.";
        } else {
            return "This animal is mostly " + getColor() + "." + " It has " + getNumberOfPaws() + " paws and no fur.";

        }

    }
}
