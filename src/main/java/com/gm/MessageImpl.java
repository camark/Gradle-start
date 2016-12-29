package com.gm;

import org.apache.log4j.Logger;

public class MessageImpl implements IMessage{
  private static final Logger LOGGER = Logger.getLogger(MessageImpl.class);
  public String sayHello(){
    String ret="Hello gm";
    LOGGER.debug("This is a debug msg");
    return ret;
  }
}
