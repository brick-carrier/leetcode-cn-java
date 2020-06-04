package designpattern.statepattern;

public interface State {
    /**
     * 投币
     */
    public void insertMoney();

    /**
     * 退币
     */
    public void backMoney();

    /**
     * 扭动曲柄
     */
    public void turnCrank();

    /**
     * 出货
     */
    public void soldGood();


}
