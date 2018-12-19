package DesignPattern.CommandPattern;

public class CommandPatternTest {

    public static void main(String[] args) {
        ControlPanel controlPanel=new ControlPanel();
        LightOffCommand lightOffCommand=new LightOffCommand(new Light());
        controlPanel.setCommand(1,lightOffCommand);
        controlPanel.keyPress(1);

        OneCtrlAll oneCtrlAll=new OneCtrlAll(new Command[]{new LightOffCommand(new Light()),new TvOffCommand(new Tv()),new FriOffCommand(new Frige())});
        controlPanel.setCommand(0,oneCtrlAll);
        controlPanel.keyPress(0);


    }
}
