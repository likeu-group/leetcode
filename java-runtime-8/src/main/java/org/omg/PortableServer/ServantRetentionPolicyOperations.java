package org.omg.PortableServer;


/**
* org/omg/PortableServer/ServantRetentionPolicyOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u221/13320/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Thursday, July 4, 2019 4:41:49 AM PDT
*/


/**
	 * This policy specifies whether the created POA retains
	 * active servants in an Active Object Map.
	 */
public interface ServantRetentionPolicyOperations  extends org.omg.CORBA.PolicyOperations
{

  /**
	 * specifies the policy value
	 */
  ServantRetentionPolicyValue value ();
} // interface ServantRetentionPolicyOperations
