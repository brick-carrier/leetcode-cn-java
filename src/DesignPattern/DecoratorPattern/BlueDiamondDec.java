package DesignPattern.DecoratorPattern;

public class BlueDiamondDec implements IDecorator {

    private IArm iArm;

    public BlueDiamondDec(IArm iArm){
        this.iArm=iArm;
    }

    @Override
    public int attack() {
        return 10+iArm.attack();
    }

    @Override
    public String descript() {
        return iArm.descript()+"+蓝宝石";
    }
}
