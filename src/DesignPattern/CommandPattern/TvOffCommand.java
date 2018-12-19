package DesignPattern.CommandPattern;

public class TvOffCommand implements  Command {

    private  Tv tv;
    public TvOffCommand(Tv tv){
        this.tv=tv;
    }
    @Override
    public void execute() {
        tv.offTv();
    }
}
