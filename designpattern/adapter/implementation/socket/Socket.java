package com.bridgelabz.designpattern.adapter.implementation.socket;

import com.bridgelabz.designpattern.adapter.beans.Volts;

public class Socket {
	public Volts getVolts() {
		return new Volts(240);
	}
}
