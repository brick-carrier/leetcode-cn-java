package DesignPattern.AdapterPattern;

public class AdapterPatternTest {
    public static void main(String[] args) {
        Data data=new Data();
        Usb usb=new UsbAdapter(data);
        Computer computer=new Computer();
        computer.useUsb(usb);
    }

}
