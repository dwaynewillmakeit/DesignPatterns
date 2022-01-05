package StructuralPatterns.AdapterPattern.Example4.models;

import StructuralPatterns.AdapterPattern.Example4.contracts.SocketAdapter;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter {

    //****Using Class Inheritance for Adapter Pattern*****
        @Override
        public Volt get120Volts() {
            return getVolt();
        }

        @Override
        public Volt get12Volts() {
            Volt volt = getVolt();

            return convertVolt(volt,10);
        }

        @Override
        public Volt get3Volts() {
            Volt volt = getVolt();

            return convertVolt(volt,40);
        }

        @Override
        public Volt get1Volt() {

            return convertVolt(getVolt(),120);
        }

        public Volt convertVolt(Volt volt, int divider){

            return new Volt(volt.getVolts()/divider);
        }
}
