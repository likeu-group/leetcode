package org.omg.CosNaming.NamingContextPackage;

/**
* org/omg/CosNaming/NamingContextPackage/NotEmptyHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u221/13320/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* Thursday, July 4, 2019 4:41:44 AM PDT
*/

public final class NotEmptyHolder implements org.omg.CORBA.portable.Streamable
{
  public NotEmpty value = null;

  public NotEmptyHolder ()
  {
  }

  public NotEmptyHolder (NotEmpty initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = NotEmptyHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    NotEmptyHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return NotEmptyHelper.type ();
  }

}
