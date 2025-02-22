package io.pragra.learning.pragraplex;

public class MechBrake implements IBreak{
    @Override
    public void brake() {
        System.out.println("applying Mech brake");
    }
}
