package designpattern.decoratorpattern;

public class Sword implements IArm {
    @Override
    public int attack() {
        return 20;
    }

    @Override
    public String descript() {
        return "剑";
    }
}
