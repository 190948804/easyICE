package com.ice.server;

public class PrinterI implements demo.Printer {
	public void printString(String s, com.zeroc.Ice.Current current)
    {
        System.out.println(s);
    }
}
