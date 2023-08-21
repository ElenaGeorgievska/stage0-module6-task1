package com.epam.mjc.stage0;

public class Bird extends Animal {


    public Bird() {
        super("blue", 2, false);

    }

    @Override
    public String getDescription() {
        //return super.getDescription();

        if (getNumberOfPaws() == 1) {
            return "This animal is mostly " + getColor() + "." + " It has " + getNumberOfPaws() + " paw and a fur.";
        } else if (getNumberOfPaws() > 1 && isHasFur()) {
            return "This animal is mostly " + getColor() + "." + " It has " + getNumberOfPaws() + " paws and a fur.";
        } else {
            return "This animal is mostly " + getColor() + "." + " It has " + getNumberOfPaws() + " paws and no fur. Moreover, it has 2 wings and can fly.";

        }
    }
}
