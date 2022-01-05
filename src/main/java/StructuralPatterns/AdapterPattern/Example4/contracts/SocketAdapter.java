package StructuralPatterns.AdapterPattern.Example4.contracts;

import StructuralPatterns.AdapterPattern.Example4.models.Volt;

public interface SocketAdapter {

    Volt get120Volts();
    Volt get12Volts();
    Volt get3Volts();
    Volt get1Volt();
}
