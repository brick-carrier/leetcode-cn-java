package DesignPattern.DecoratorPattern;

public class RedDiamondDec implements IDecorator {

    private IArm iArm;

    public RedDiamondDec(IArm iArm){
        this.iArm=iArm;
    }

    @Override
    public int attack() {
        return 10+iArm.attack();
    }

    @Override
    public String descript() {
        return iArm.descript()+"+红宝石";
    }
}
