package DesignPattern.CommandPattern;

public class FriOffCommand implements  Command {

    private  Frige frige;

    public  FriOffCommand(Frige frige){
        this.frige=frige;
    }

    @Override
    public void execute() {
        frige.offFri();
    }
}
