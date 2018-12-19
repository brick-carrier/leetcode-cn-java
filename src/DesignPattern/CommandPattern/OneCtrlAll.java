package DesignPattern.CommandPattern;

public class OneCtrlAll implements Command{

    private Command[] commands;

    public  OneCtrlAll(Command[] commands){
        this.commands=commands;
    }

    @Override
    public void execute() {
        for (int i=0;i<commands.length;i++){
            commands[i].execute();
        }
    }
}
