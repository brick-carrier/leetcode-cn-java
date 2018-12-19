package DesignPattern.StatePattern;

public class NoMoneyState implements State {
    private AutoSoldMachine autoSoldMachine;

    public NoMoneyState(AutoSoldMachine autoSoldMachine){
        this.autoSoldMachine=autoSoldMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("投币成功");
        autoSoldMachine.setState(autoSoldMachine.getHasMoneyState());
    }

    @Override
    public void backMoney() {
        System.out.println("您未投币，无钱可退");
    }

    @Override
    public void turnCrank() {
        System.out.println("请先投币");

    }

    @Override
    public void soldGood() {
        throw new IllegalStateException("非法操作");
    }
}
