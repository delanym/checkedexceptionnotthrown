package com.xml.xsd;

public class XsdTraversalHandler {

  public XsdTraversalHandler() throws XsdTraversalHandlerException {
    throw new XsdTraversalHandlerException();
  }

  public void out() throws XsdTraversalHandlerException {

    // dont throw new XsdTraversalHandlerException();
    System.out.println("But do create bytecode");

  }
}
