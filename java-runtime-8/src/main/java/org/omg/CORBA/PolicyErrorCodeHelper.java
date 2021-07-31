package org.omg.CORBA;


/**
* org/omg/CORBA/PolicyErrorCodeHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u221/13320/corba/src/share/classes/org/omg/PortableInterceptor/CORBAX.idl
* Thursday, July 4, 2019 4:41:47 AM PDT
*/


/**
   * Encapsulates a reason a Policy may be invalid.
   *
   * @see PolicyError
   */
abstract public class PolicyErrorCodeHelper
{
  private static String  _id = "IDL:omg.org/CORBA/PolicyErrorCode:1.0";

  public static void insert (Any a, short that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static short extract (Any a)
  {
    return read (a.create_input_stream ());
  }

  private static TypeCode __typeCode = null;
  synchronized public static TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = ORB.init ().get_primitive_tc (TCKind.tk_short);
      __typeCode = ORB.init ().create_alias_tc (PolicyErrorCodeHelper.id (), "PolicyErrorCode", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static short read (org.omg.CORBA.portable.InputStream istream)
  {
    short value = (short)0;
    value = istream.read_short ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, short value)
  {
    ostream.write_short (value);
  }

}
