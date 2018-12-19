package DesignPattern.StatePattern;

public class RewardState implements State {
    private AutoSoldMachine autoSoldMachine;

    public RewardState(AutoSoldMachine autoSoldMachine){
        this.autoSoldMachine=autoSoldMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("无需重复投币");
    }

    @Override
    public void backMoney() {
        System.out.println("不能退币");
    }

    @Override
    public void turnCrank() {
        System.out.println("出货中");
    }

    @Override
    public void soldGood() {
        System.out.println("恭喜你，你中奖了，将获得两个商品");
        autoSoldMachine.soldGood();
        if (autoSoldMachine.getCount()==0){
            System.out.println("商品已经售罄");
            autoSoldMachine.setState(autoSoldMachine.getSoldOutState());
        }else{
            autoSoldMachine.soldGood();
            if (autoSoldMachine.getCount()>0){
                autoSoldMachine.setState(autoSoldMachine.getNoMoneyState());
            }else{
                System.out.println("商品已经售罄");
                autoSoldMachine.setSoldOutState(autoSoldMachine.getSoldOutState());
            }
        }

    }


}
