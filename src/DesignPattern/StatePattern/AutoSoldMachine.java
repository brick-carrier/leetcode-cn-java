package DesignPattern.StatePattern;

public class AutoSoldMachine {
        private State noMoneyState;
        private State hasMoneyState;
        private State rewordState;
        private State soldGoodState;
        private State soldOutState;

        private int count=0;

        private State currentState=noMoneyState;

        public AutoSoldMachine(int count){

            noMoneyState=new NoMoneyState(this);
            hasMoneyState=new HasMoneyState(this);
            rewordState=new RewardState(this);
            soldGoodState=new SoldGoodState(this);
            soldOutState=new SoleOutState(this);

            if (count>0){
                this.count=count;
                currentState=noMoneyState;
            }

        }

        public void insertMoney(){
            currentState.insertMoney();
        }

        public void backMoney(){
            currentState.backMoney();
        }

        public void turnCrank(){
            currentState.turnCrank();
            if(currentState==soldGoodState||currentState==rewordState){
                currentState.soldGood();
            }
        }

        public  void soldGood(){
            System.out.println("发出一件商品");
            if(count!=0){
                count-=1;
            }
        }

        public void setState(State state){
            this.currentState=state;
        }

    public State getNoMoneyState() {
        return noMoneyState;
    }

    public void setNoMoneyState(State noMoneyState) {
        this.noMoneyState = noMoneyState;
    }

    public State getHasMoneyState() {
        return hasMoneyState;
    }

    public void setHasMoneyState(State hasMoneyState) {
        this.hasMoneyState = hasMoneyState;
    }

    public State getRewordState() {
        return rewordState;
    }

    public void setRewordState(State rewordState) {
        this.rewordState = rewordState;
    }

    public State getSoldGoodState() {
        return soldGoodState;
    }

    public void setSoldGoodState(State soldGoodState) {
        this.soldGoodState = soldGoodState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
