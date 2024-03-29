package org.omg.IOP;


/**
* org/omg/IOP/CodecFactoryOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u221/13320/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Thursday, July 4, 2019 4:41:47 AM PDT
*/


/**
   * <code>Codecs</code> are obtained from the <code>CodecFactory</code>.
   * The <code>CodecFactory</code> is obtained through a call to
   * <code>ORB.resolve_initial_references( "CodecFactory" )</code>.
   */
public interface CodecFactoryOperations
{

  /**
     * Create a <code>Codec</code> of the given encoding.
     * <p>
     * @param enc The encoding for which to create a <code>Codec</code>.
     * @return A <code>Codec</code> obtained with the given encoding.
     * @exception UnknownEncoding thrown if this factory cannot create a
     *     <code>Codec</code> of the given encoding.
     */
  Codec create_codec (Encoding enc) throws org.omg.IOP.CodecFactoryPackage.UnknownEncoding;
} // interface CodecFactoryOperations
