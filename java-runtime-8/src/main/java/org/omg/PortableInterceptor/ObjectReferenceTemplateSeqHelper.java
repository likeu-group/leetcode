package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/ObjectReferenceTemplateSeqHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u221/13320/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Thursday, July 4, 2019 4:41:47 AM PDT
*/


/** Sequence of object reference templates is used for reporting state
   * changes that do not occur on the adapter manager.
   */
abstract public class ObjectReferenceTemplateSeqHelper
{
  private static String  _id = "IDL:omg.org/PortableInterceptor/ObjectReferenceTemplateSeq:1.0";

  public static void insert (org.omg.CORBA.Any a, ObjectReferenceTemplate[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static ObjectReferenceTemplate[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = ObjectReferenceTemplateHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (ObjectReferenceTemplateSeqHelper.id (), "ObjectReferenceTemplateSeq", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static ObjectReferenceTemplate[] read (org.omg.CORBA.portable.InputStream istream)
  {
    ObjectReferenceTemplate value[] = null;
    int _len0 = istream.read_long ();
    value = new ObjectReferenceTemplate[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = ObjectReferenceTemplateHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, ObjectReferenceTemplate[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      ObjectReferenceTemplateHelper.write (ostream, value[_i0]);
  }

}
