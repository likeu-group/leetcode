package com.sun.corba.se.spi.activation;

/**
* com/sun/corba/se/spi/activation/RepositoryHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u221/13320/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Thursday, July 4, 2019 4:41:45 AM PDT
*/

public final class RepositoryHolder implements org.omg.CORBA.portable.Streamable
{
  public Repository value = null;

  public RepositoryHolder ()
  {
  }

  public RepositoryHolder (Repository initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RepositoryHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RepositoryHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RepositoryHelper.type ();
  }

}
