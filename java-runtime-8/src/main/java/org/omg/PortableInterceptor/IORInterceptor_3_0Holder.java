package org.omg.PortableInterceptor;

/**
* org/omg/PortableInterceptor/IORInterceptor_3_0Holder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u221/13320/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Thursday, July 4, 2019 4:41:47 AM PDT
*/

public final class IORInterceptor_3_0Holder implements org.omg.CORBA.portable.Streamable
{
  public IORInterceptor_3_0 value = null;

  public IORInterceptor_3_0Holder ()
  {
  }

  public IORInterceptor_3_0Holder (IORInterceptor_3_0 initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = IORInterceptor_3_0Helper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    IORInterceptor_3_0Helper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return IORInterceptor_3_0Helper.type ();
  }

}
