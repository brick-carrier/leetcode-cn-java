package DesignPattern.StatePattern;

import java.util.Random;

public class HasMoneyState implements State {


    private AutoSoldMachine autoSoldMachine;

    Random random=new Random();

    public HasMoneyState(AutoSoldMachine autoSoldMachine){
        this.autoSoldMachine=autoSoldMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("已投币,无需重复投币");
    }

    @Override
    public void backMoney() {
        System.out.println("退币成功");
        autoSoldMachine.setState(autoSoldMachine.getNoMoneyState());
    }

    @Override
    public void turnCrank() {
        System.out.println("准备出货");
        int reward= random.nextInt(100);
        System.out.println(reward);
        if (33<reward&&reward<43){
            autoSoldMachine.setState(autoSoldMachine.getRewordState());
        }else{
            autoSoldMachine.setState(autoSoldMachine.getSoldGoodState());
        }


    }

    @Override
    public void soldGood() {
        throw new IllegalStateException("非法操作");
    }
}
