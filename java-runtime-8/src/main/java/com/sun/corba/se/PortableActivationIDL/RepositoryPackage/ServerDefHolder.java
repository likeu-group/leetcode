package com.sun.corba.se.PortableActivationIDL.RepositoryPackage;

/**
* com/sun/corba/se/PortableActivationIDL/RepositoryPackage/ServerDefHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u221/13320/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Thursday, July 4, 2019 4:41:44 AM PDT
*/

public final class ServerDefHolder implements org.omg.CORBA.portable.Streamable
{
  public ServerDef value = null;

  public ServerDefHolder ()
  {
  }

  public ServerDefHolder (ServerDef initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ServerDefHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ServerDefHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ServerDefHelper.type ();
  }

}
