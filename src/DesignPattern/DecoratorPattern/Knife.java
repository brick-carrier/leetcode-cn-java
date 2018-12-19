package DesignPattern.DecoratorPattern;

public class Knife implements IArm {
    @Override
    public int attack() {
        return 10;
    }

    @Override
    public String descript() {
        return "刀";
    }
}
