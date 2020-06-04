package designpattern.decoratorpattern;

public class Brick implements IArm {
    @Override
    public int attack() {
        return 100;
    }

    @Override
    public String descript() {
        return "砖头";
    }
}
