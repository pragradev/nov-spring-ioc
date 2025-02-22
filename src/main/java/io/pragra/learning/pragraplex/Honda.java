package io.pragra.learning.pragraplex;

public class Honda {
    String engine;
    String name;
    IBreak brake;

    public Honda(String engine, String name, IBreak brake) {
        this.engine = engine;
        this.name = name;
        this.brake = brake;
    }

    @Override
    public String toString() {
        return "Honda{" +
                "engine='" + engine + '\'' +
                ", name='" + name + '\'' +
                ", brake=" + brake +
                '}';
    }
}
