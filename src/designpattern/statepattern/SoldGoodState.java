package designpattern.statepattern;

public class SoldGoodState implements State {
    private AutoSoldMachine autoSoldMachine;

    public SoldGoodState(AutoSoldMachine autoSoldMachine){
        this.autoSoldMachine=autoSoldMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("出货中请勿投币");
    }

    @Override
    public void backMoney() {
        System.out.println("出货中请勿退币");
    }

    @Override
    public void turnCrank() {
        System.out.println("出货中请勿扭动");
    }

    @Override
    public void soldGood() {
        autoSoldMachine.soldGood();

        if (autoSoldMachine.getCount()==0){
            System.out.println("商品已售罄");
            autoSoldMachine.setState(autoSoldMachine.getSoldOutState());
        }else{
            autoSoldMachine.setState(autoSoldMachine.getNoMoneyState());
        }
    }
}
