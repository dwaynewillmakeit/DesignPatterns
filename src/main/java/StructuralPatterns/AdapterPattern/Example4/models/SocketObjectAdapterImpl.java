package StructuralPatterns.AdapterPattern.Example4.models;

import StructuralPatterns.AdapterPattern.Example4.contracts.SocketAdapter;

public class SocketObjectAdapterImpl implements SocketAdapter {

    //****Using Composition for Adapter Pattern*****
    private Socket socket = new Socket();

    @Override
    public Volt get120Volts() {
        return socket.getVolt();
    }

    @Override
    public Volt get12Volts() {
        return convertVolt(socket.getVolt(), 10);
    }

    @Override
    public Volt get3Volts() {
        return convertVolt(socket.getVolt(), 40);
    }

    @Override
    public Volt get1Volt() {
        return convertVolt(socket.getVolt(), 120);
    }

    public Volt convertVolt(Volt volt, int divider){

        return new Volt(volt.getVolts()/divider);
    }
}
