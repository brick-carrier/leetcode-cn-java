package DesignPattern.StatePattern;

public class StatePatternTest {

    public static void main(String[] args) {

            AutoSoldMachine autoSoldMachine = new AutoSoldMachine(10);
            autoSoldMachine.insertMoney();
            autoSoldMachine.turnCrank();
            autoSoldMachine.soldGood();
    }
}
