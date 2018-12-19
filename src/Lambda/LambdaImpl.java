package Lambda;

public class LambdaImpl implements ILambda{

    @Override
    public boolean testBoolean(String num) {
        return num.equals("10");
    }
}
