package DesignPattern.DecoratorPattern;

public class DecoratorPatternTest {

    public static void main(String[] args) {
        IArm iArm=new RedDiamondDec(new BlueDiamondDec(new Brick()));
        System.out.println("砖头攻击力"+iArm.attack());
        System.out.println("描述"+iArm.descript());
    }
}
