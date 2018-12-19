package DesignPattern.CommandPattern;

public class ControlPanel {

    private static final int CTRL_SIZE=9;
    private Command[] commands;

    public  ControlPanel(){
        commands=new Command[CTRL_SIZE];
        for (int i=0;i<CTRL_SIZE;i++){
            commands[i]=new NoCommand();
        }
    }

    public void setCommand(int index,Command command){
        commands[index]=command;
    }

    public void keyPress(int index){
        commands[index].execute();
    }
}
