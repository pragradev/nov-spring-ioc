package io.pragra.learning.pragraplex;

public class HydBrake implements IBreak{
    @Override
    public void brake() {
        System.out.println("applying hydraulic brake");
    }
}
