package com.sun.corba.se.spi.activation;

/**
* com/sun/corba/se/spi/activation/ServerNotRegisteredHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u221/13320/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Thursday, July 4, 2019 4:41:44 AM PDT
*/

public final class ServerNotRegisteredHolder implements org.omg.CORBA.portable.Streamable
{
  public ServerNotRegistered value = null;

  public ServerNotRegisteredHolder ()
  {
  }

  public ServerNotRegisteredHolder (ServerNotRegistered initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ServerNotRegisteredHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ServerNotRegisteredHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ServerNotRegisteredHelper.type ();
  }

}
