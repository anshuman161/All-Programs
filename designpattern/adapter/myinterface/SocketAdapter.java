package com.bridgelabz.designpattern.adapter.myinterface;

import com.bridgelabz.designpattern.adapter.beans.Volts;

public interface SocketAdapter 
{
  public Volts get240volt();
  public Volts get12volt();
  public Volts get3volt();
  
}
