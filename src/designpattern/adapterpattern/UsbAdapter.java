package designpattern.adapterpattern;

public class UsbAdapter implements  Usb {

    private Data data;

    public UsbAdapter(Data data){
        this.data=data;
    }

    @Override
    public void transferData() {
            String s=data.provide("这是我提供的数据");
            System.out.println(s);
    }
}
