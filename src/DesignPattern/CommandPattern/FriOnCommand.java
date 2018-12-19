package DesignPattern.CommandPattern;

public class FriOnCommand implements  Command {
    private  Frige frige;

    public FriOnCommand(Frige frige){
        this.frige=frige;
    }

    @Override
    public void execute() {
        frige.openFri();
    }
}
