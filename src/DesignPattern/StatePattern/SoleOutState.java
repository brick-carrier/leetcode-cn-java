package DesignPattern.StatePattern;

public class SoleOutState implements State{

    private AutoSoldMachine autoSoldMachine;

    public SoleOutState(AutoSoldMachine autoSoldMachine){
        this.autoSoldMachine=autoSoldMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("商品已售罄");
    }

    @Override
    public void backMoney() {
        System.out.println("不能退");
    }

    @Override
    public void turnCrank() {
        System.out.println("不能转");
    }

    @Override
    public void soldGood() {
        System.out.println("非法操作");
    }
}
