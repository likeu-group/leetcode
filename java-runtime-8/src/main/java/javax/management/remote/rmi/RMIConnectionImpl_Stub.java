// Stub class generated by rmic, do not edit.
// Contents subject to change without notice.

package javax.management.remote.rmi;

public final class RMIConnectionImpl_Stub
    extends java.rmi.server.RemoteStub
    implements RMIConnection
{
    private static final long serialVersionUID = 2;

    private static java.lang.reflect.Method $method_addNotificationListener_0;
    private static java.lang.reflect.Method $method_addNotificationListeners_1;
    private static java.lang.reflect.Method $method_close_2;
    private static java.lang.reflect.Method $method_createMBean_3;
    private static java.lang.reflect.Method $method_createMBean_4;
    private static java.lang.reflect.Method $method_createMBean_5;
    private static java.lang.reflect.Method $method_createMBean_6;
    private static java.lang.reflect.Method $method_fetchNotifications_7;
    private static java.lang.reflect.Method $method_getAttribute_8;
    private static java.lang.reflect.Method $method_getAttributes_9;
    private static java.lang.reflect.Method $method_getConnectionId_10;
    private static java.lang.reflect.Method $method_getDefaultDomain_11;
    private static java.lang.reflect.Method $method_getDomains_12;
    private static java.lang.reflect.Method $method_getMBeanCount_13;
    private static java.lang.reflect.Method $method_getMBeanInfo_14;
    private static java.lang.reflect.Method $method_getObjectInstance_15;
    private static java.lang.reflect.Method $method_invoke_16;
    private static java.lang.reflect.Method $method_isInstanceOf_17;
    private static java.lang.reflect.Method $method_isRegistered_18;
    private static java.lang.reflect.Method $method_queryMBeans_19;
    private static java.lang.reflect.Method $method_queryNames_20;
    private static java.lang.reflect.Method $method_removeNotificationListener_21;
    private static java.lang.reflect.Method $method_removeNotificationListener_22;
    private static java.lang.reflect.Method $method_removeNotificationListeners_23;
    private static java.lang.reflect.Method $method_setAttribute_24;
    private static java.lang.reflect.Method $method_setAttributes_25;
    private static java.lang.reflect.Method $method_unregisterMBean_26;

    static {
	try {
	    $method_addNotificationListener_0 = RMIConnection.class.getMethod("addNotificationListener", new Class[] {javax.management.ObjectName.class, javax.management.ObjectName.class, java.rmi.MarshalledObject.class, java.rmi.MarshalledObject.class, javax.security.auth.Subject.class});
	    $method_addNotificationListeners_1 = RMIConnection.class.getMethod("addNotificationListeners", new Class[] {javax.management.ObjectName[].class, java.rmi.MarshalledObject[].class, javax.security.auth.Subject[].class});
	    $method_close_2 = AutoCloseable.class.getMethod("close", new Class[] {});
	    $method_createMBean_3 = RMIConnection.class.getMethod("createMBean", new Class[] {String.class, javax.management.ObjectName.class, java.rmi.MarshalledObject.class, String[].class, javax.security.auth.Subject.class});
	    $method_createMBean_4 = RMIConnection.class.getMethod("createMBean", new Class[] {String.class, javax.management.ObjectName.class, javax.management.ObjectName.class, java.rmi.MarshalledObject.class, String[].class, javax.security.auth.Subject.class});
	    $method_createMBean_5 = RMIConnection.class.getMethod("createMBean", new Class[] {String.class, javax.management.ObjectName.class, javax.management.ObjectName.class, javax.security.auth.Subject.class});
	    $method_createMBean_6 = RMIConnection.class.getMethod("createMBean", new Class[] {String.class, javax.management.ObjectName.class, javax.security.auth.Subject.class});
	    $method_fetchNotifications_7 = RMIConnection.class.getMethod("fetchNotifications", new Class[] {long.class, int.class, long.class});
	    $method_getAttribute_8 = RMIConnection.class.getMethod("getAttribute", new Class[] {javax.management.ObjectName.class, String.class, javax.security.auth.Subject.class});
	    $method_getAttributes_9 = RMIConnection.class.getMethod("getAttributes", new Class[] {javax.management.ObjectName.class, String[].class, javax.security.auth.Subject.class});
	    $method_getConnectionId_10 = RMIConnection.class.getMethod("getConnectionId", new Class[] {});
	    $method_getDefaultDomain_11 = RMIConnection.class.getMethod("getDefaultDomain", new Class[] {javax.security.auth.Subject.class});
	    $method_getDomains_12 = RMIConnection.class.getMethod("getDomains", new Class[] {javax.security.auth.Subject.class});
	    $method_getMBeanCount_13 = RMIConnection.class.getMethod("getMBeanCount", new Class[] {javax.security.auth.Subject.class});
	    $method_getMBeanInfo_14 = RMIConnection.class.getMethod("getMBeanInfo", new Class[] {javax.management.ObjectName.class, javax.security.auth.Subject.class});
	    $method_getObjectInstance_15 = RMIConnection.class.getMethod("getObjectInstance", new Class[] {javax.management.ObjectName.class, javax.security.auth.Subject.class});
	    $method_invoke_16 = RMIConnection.class.getMethod("invoke", new Class[] {javax.management.ObjectName.class, String.class, java.rmi.MarshalledObject.class, String[].class, javax.security.auth.Subject.class});
	    $method_isInstanceOf_17 = RMIConnection.class.getMethod("isInstanceOf", new Class[] {javax.management.ObjectName.class, String.class, javax.security.auth.Subject.class});
	    $method_isRegistered_18 = RMIConnection.class.getMethod("isRegistered", new Class[] {javax.management.ObjectName.class, javax.security.auth.Subject.class});
	    $method_queryMBeans_19 = RMIConnection.class.getMethod("queryMBeans", new Class[] {javax.management.ObjectName.class, java.rmi.MarshalledObject.class, javax.security.auth.Subject.class});
	    $method_queryNames_20 = RMIConnection.class.getMethod("queryNames", new Class[] {javax.management.ObjectName.class, java.rmi.MarshalledObject.class, javax.security.auth.Subject.class});
	    $method_removeNotificationListener_21 = RMIConnection.class.getMethod("removeNotificationListener", new Class[] {javax.management.ObjectName.class, javax.management.ObjectName.class, java.rmi.MarshalledObject.class, java.rmi.MarshalledObject.class, javax.security.auth.Subject.class});
	    $method_removeNotificationListener_22 = RMIConnection.class.getMethod("removeNotificationListener", new Class[] {javax.management.ObjectName.class, javax.management.ObjectName.class, javax.security.auth.Subject.class});
	    $method_removeNotificationListeners_23 = RMIConnection.class.getMethod("removeNotificationListeners", new Class[] {javax.management.ObjectName.class, Integer[].class, javax.security.auth.Subject.class});
	    $method_setAttribute_24 = RMIConnection.class.getMethod("setAttribute", new Class[] {javax.management.ObjectName.class, java.rmi.MarshalledObject.class, javax.security.auth.Subject.class});
	    $method_setAttributes_25 = RMIConnection.class.getMethod("setAttributes", new Class[] {javax.management.ObjectName.class, java.rmi.MarshalledObject.class, javax.security.auth.Subject.class});
	    $method_unregisterMBean_26 = RMIConnection.class.getMethod("unregisterMBean", new Class[] {javax.management.ObjectName.class, javax.security.auth.Subject.class});
	} catch (NoSuchMethodException e) {
	    throw new NoSuchMethodError(
		"stub class initialization failed");
	}
    }

    // constructors
    public RMIConnectionImpl_Stub(java.rmi.server.RemoteRef ref) {
	super(ref);
    }

    // methods from remote interfaces

    // implementation of addNotificationListener(ObjectName, ObjectName, MarshalledObject, MarshalledObject, Subject)
    public void addNotificationListener(javax.management.ObjectName $param_ObjectName_1, javax.management.ObjectName $param_ObjectName_2, java.rmi.MarshalledObject $param_MarshalledObject_3, java.rmi.MarshalledObject $param_MarshalledObject_4, javax.security.auth.Subject $param_Subject_5)
	throws java.io.IOException, javax.management.InstanceNotFoundException
    {
	try {
	    ref.invoke(this, $method_addNotificationListener_0, new Object[] {$param_ObjectName_1, $param_ObjectName_2, $param_MarshalledObject_3, $param_MarshalledObject_4, $param_Subject_5}, -8578317696269497109L);
	} catch (RuntimeException e) {
	    throw e;
	} catch (java.io.IOException e) {
	    throw e;
	} catch (javax.management.InstanceNotFoundException e) {
	    throw e;
	} catch (Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }

    // implementation of addNotificationListeners(ObjectName[], MarshalledObject[], Subject[])
    public Integer[] addNotificationListeners(javax.management.ObjectName[] $param_arrayOf_ObjectName_1, java.rmi.MarshalledObject[] $param_arrayOf_MarshalledObject_2, javax.security.auth.Subject[] $param_arrayOf_Subject_3)
	throws java.io.IOException, javax.management.InstanceNotFoundException
    {
	try {
	    Object $result = ref.invoke(this, $method_addNotificationListeners_1, new Object[] {$param_arrayOf_ObjectName_1, $param_arrayOf_MarshalledObject_2, $param_arrayOf_Subject_3}, -5321691879380783377L);
	    return ((Integer[]) $result);
	} catch (RuntimeException e) {
	    throw e;
	} catch (java.io.IOException e) {
	    throw e;
	} catch (javax.management.InstanceNotFoundException e) {
	    throw e;
	} catch (Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }

    // implementation of close()
    public void close()
	throws java.io.IOException
    {
	try {
	    ref.invoke(this, $method_close_2, null, -4742752445160157748L);
	} catch (RuntimeException e) {
	    throw e;
	} catch (java.io.IOException e) {
	    throw e;
	} catch (Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }

    // implementation of createMBean(String, ObjectName, MarshalledObject, String[], Subject)
    public javax.management.ObjectInstance createMBean(String $param_String_1, javax.management.ObjectName $param_ObjectName_2, java.rmi.MarshalledObject $param_MarshalledObject_3, String[] $param_arrayOf_String_4, javax.security.auth.Subject $param_Subject_5)
	throws java.io.IOException, javax.management.InstanceAlreadyExistsException, javax.management.MBeanException, javax.management.MBeanRegistrationException, javax.management.NotCompliantMBeanException, javax.management.ReflectionException
    {
	try {
	    Object $result = ref.invoke(this, $method_createMBean_3, new Object[] {$param_String_1, $param_ObjectName_2, $param_MarshalledObject_3, $param_arrayOf_String_4, $param_Subject_5}, 4867822117947806114L);
	    return ((javax.management.ObjectInstance) $result);
	} catch (RuntimeException e) {
	    throw e;
	} catch (java.io.IOException e) {
	    throw e;
	} catch (javax.management.InstanceAlreadyExistsException e) {
	    throw e;
	} catch (javax.management.MBeanException e) {
	    throw e;
	} catch (javax.management.NotCompliantMBeanException e) {
	    throw e;
	} catch (javax.management.ReflectionException e) {
	    throw e;
	} catch (Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }

    // implementation of createMBean(String, ObjectName, ObjectName, MarshalledObject, String[], Subject)
    public javax.management.ObjectInstance createMBean(String $param_String_1, javax.management.ObjectName $param_ObjectName_2, javax.management.ObjectName $param_ObjectName_3, java.rmi.MarshalledObject $param_MarshalledObject_4, String[] $param_arrayOf_String_5, javax.security.auth.Subject $param_Subject_6)
	throws java.io.IOException, javax.management.InstanceAlreadyExistsException, javax.management.InstanceNotFoundException, javax.management.MBeanException, javax.management.MBeanRegistrationException, javax.management.NotCompliantMBeanException, javax.management.ReflectionException
    {
	try {
	    Object $result = ref.invoke(this, $method_createMBean_4, new Object[] {$param_String_1, $param_ObjectName_2, $param_ObjectName_3, $param_MarshalledObject_4, $param_arrayOf_String_5, $param_Subject_6}, -6604955182088909937L);
	    return ((javax.management.ObjectInstance) $result);
	} catch (RuntimeException e) {
	    throw e;
	} catch (java.io.IOException e) {
	    throw e;
	} catch (javax.management.InstanceAlreadyExistsException e) {
	    throw e;
	} catch (javax.management.InstanceNotFoundException e) {
	    throw e;
	} catch (javax.management.MBeanException e) {
	    throw e;
	} catch (javax.management.NotCompliantMBeanException e) {
	    throw e;
	} catch (javax.management.ReflectionException e) {
	    throw e;
	} catch (Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }

    // implementation of createMBean(String, ObjectName, ObjectName, Subject)
    public javax.management.ObjectInstance createMBean(String $param_String_1, javax.management.ObjectName $param_ObjectName_2, javax.management.ObjectName $param_ObjectName_3, javax.security.auth.Subject $param_Subject_4)
	throws java.io.IOException, javax.management.InstanceAlreadyExistsException, javax.management.InstanceNotFoundException, javax.management.MBeanException, javax.management.MBeanRegistrationException, javax.management.NotCompliantMBeanException, javax.management.ReflectionException
    {
	try {
	    Object $result = ref.invoke(this, $method_createMBean_5, new Object[] {$param_String_1, $param_ObjectName_2, $param_ObjectName_3, $param_Subject_4}, -8679469989872508324L);
	    return ((javax.management.ObjectInstance) $result);
	} catch (RuntimeException e) {
	    throw e;
	} catch (java.io.IOException e) {
	    throw e;
	} catch (javax.management.InstanceAlreadyExistsException e) {
	    throw e;
	} catch (javax.management.InstanceNotFoundException e) {
	    throw e;
	} catch (javax.management.MBeanException e) {
	    throw e;
	} catch (javax.management.NotCompliantMBeanException e) {
	    throw e;
	} catch (javax.management.ReflectionException e) {
	    throw e;
	} catch (Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }

    // implementation of createMBean(String, ObjectName, Subject)
    public javax.management.ObjectInstance createMBean(String $param_String_1, javax.management.ObjectName $param_ObjectName_2, javax.security.auth.Subject $param_Subject_3)
	throws java.io.IOException, javax.management.InstanceAlreadyExistsException, javax.management.MBeanException, javax.management.MBeanRegistrationException, javax.management.NotCompliantMBeanException, javax.management.ReflectionException
    {
	try {
	    Object $result = ref.invoke(this, $method_createMBean_6, new Object[] {$param_String_1, $param_ObjectName_2, $param_Subject_3}, 2510753813974665446L);
	    return ((javax.management.ObjectInstance) $result);
	} catch (RuntimeException e) {
	    throw e;
	} catch (java.io.IOException e) {
	    throw e;
	} catch (javax.management.InstanceAlreadyExistsException e) {
	    throw e;
	} catch (javax.management.MBeanException e) {
	    throw e;
	} catch (javax.management.NotCompliantMBeanException e) {
	    throw e;
	} catch (javax.management.ReflectionException e) {
	    throw e;
	} catch (Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }

    // implementation of fetchNotifications(long, int, long)
    public javax.management.remote.NotificationResult fetchNotifications(long $param_long_1, int $param_int_2, long $param_long_3)
	throws java.io.IOException
    {
	try {
	    Object $result = ref.invoke(this, $method_fetchNotifications_7, new Object[] {new Long($param_long_1), new Integer($param_int_2), new Long($param_long_3)}, -5037523307973544478L);
	    return ((javax.management.remote.NotificationResult) $result);
	} catch (RuntimeException e) {
	    throw e;
	} catch (java.io.IOException e) {
	    throw e;
	} catch (Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }

    // implementation of getAttribute(ObjectName, String, Subject)
    public Object getAttribute(javax.management.ObjectName $param_ObjectName_1, String $param_String_2, javax.security.auth.Subject $param_Subject_3)
	throws java.io.IOException, javax.management.AttributeNotFoundException, javax.management.InstanceNotFoundException, javax.management.MBeanException, javax.management.ReflectionException
    {
	try {
	    Object $result = ref.invoke(this, $method_getAttribute_8, new Object[] {$param_ObjectName_1, $param_String_2, $param_Subject_3}, -1089783104982388203L);
	    return ((Object) $result);
	} catch (RuntimeException e) {
	    throw e;
	} catch (java.io.IOException e) {
	    throw e;
	} catch (javax.management.AttributeNotFoundException e) {
	    throw e;
	} catch (javax.management.InstanceNotFoundException e) {
	    throw e;
	} catch (javax.management.MBeanException e) {
	    throw e;
	} catch (javax.management.ReflectionException e) {
	    throw e;
	} catch (Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }

    // implementation of getAttributes(ObjectName, String[], Subject)
    public javax.management.AttributeList getAttributes(javax.management.ObjectName $param_ObjectName_1, String[] $param_arrayOf_String_2, javax.security.auth.Subject $param_Subject_3)
	throws java.io.IOException, javax.management.InstanceNotFoundException, javax.management.ReflectionException
    {
	try {
	    Object $result = ref.invoke(this, $method_getAttributes_9, new Object[] {$param_ObjectName_1, $param_arrayOf_String_2, $param_Subject_3}, 6285293806596348999L);
	    return ((javax.management.AttributeList) $result);
	} catch (RuntimeException e) {
	    throw e;
	} catch (java.io.IOException e) {
	    throw e;
	} catch (javax.management.InstanceNotFoundException e) {
	    throw e;
	} catch (javax.management.ReflectionException e) {
	    throw e;
	} catch (Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }

    // implementation of getConnectionId()
    public String getConnectionId()
	throws java.io.IOException
    {
	try {
	    Object $result = ref.invoke(this, $method_getConnectionId_10, null, -67907180346059933L);
	    return ((String) $result);
	} catch (RuntimeException e) {
	    throw e;
	} catch (java.io.IOException e) {
	    throw e;
	} catch (Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }

    // implementation of getDefaultDomain(Subject)
    public String getDefaultDomain(javax.security.auth.Subject $param_Subject_1)
	throws java.io.IOException
    {
	try {
	    Object $result = ref.invoke(this, $method_getDefaultDomain_11, new Object[] {$param_Subject_1}, 6047668923998658472L);
	    return ((String) $result);
	} catch (RuntimeException e) {
	    throw e;
	} catch (java.io.IOException e) {
	    throw e;
	} catch (Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }

    // implementation of getDomains(Subject)
    public String[] getDomains(javax.security.auth.Subject $param_Subject_1)
	throws java.io.IOException
    {
	try {
	    Object $result = ref.invoke(this, $method_getDomains_12, new Object[] {$param_Subject_1}, -6662314179953625551L);
	    return ((String[]) $result);
	} catch (RuntimeException e) {
	    throw e;
	} catch (java.io.IOException e) {
	    throw e;
	} catch (Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }

    // implementation of getMBeanCount(Subject)
    public Integer getMBeanCount(javax.security.auth.Subject $param_Subject_1)
	throws java.io.IOException
    {
	try {
	    Object $result = ref.invoke(this, $method_getMBeanCount_13, new Object[] {$param_Subject_1}, -2042362057335820635L);
	    return ((Integer) $result);
	} catch (RuntimeException e) {
	    throw e;
	} catch (java.io.IOException e) {
	    throw e;
	} catch (Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }

    // implementation of getMBeanInfo(ObjectName, Subject)
    public javax.management.MBeanInfo getMBeanInfo(javax.management.ObjectName $param_ObjectName_1, javax.security.auth.Subject $param_Subject_2)
	throws java.io.IOException, javax.management.InstanceNotFoundException, javax.management.IntrospectionException, javax.management.ReflectionException
    {
	try {
	    Object $result = ref.invoke(this, $method_getMBeanInfo_14, new Object[] {$param_ObjectName_1, $param_Subject_2}, -7404813916326233354L);
	    return ((javax.management.MBeanInfo) $result);
	} catch (RuntimeException e) {
	    throw e;
	} catch (java.io.IOException e) {
	    throw e;
	} catch (javax.management.InstanceNotFoundException e) {
	    throw e;
	} catch (javax.management.IntrospectionException e) {
	    throw e;
	} catch (javax.management.ReflectionException e) {
	    throw e;
	} catch (Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }

    // implementation of getObjectInstance(ObjectName, Subject)
    public javax.management.ObjectInstance getObjectInstance(javax.management.ObjectName $param_ObjectName_1, javax.security.auth.Subject $param_Subject_2)
	throws java.io.IOException, javax.management.InstanceNotFoundException
    {
	try {
	    Object $result = ref.invoke(this, $method_getObjectInstance_15, new Object[] {$param_ObjectName_1, $param_Subject_2}, 6950095694996159938L);
	    return ((javax.management.ObjectInstance) $result);
	} catch (RuntimeException e) {
	    throw e;
	} catch (java.io.IOException e) {
	    throw e;
	} catch (javax.management.InstanceNotFoundException e) {
	    throw e;
	} catch (Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }

    // implementation of invoke(ObjectName, String, MarshalledObject, String[], Subject)
    public Object invoke(javax.management.ObjectName $param_ObjectName_1, String $param_String_2, java.rmi.MarshalledObject $param_MarshalledObject_3, String[] $param_arrayOf_String_4, javax.security.auth.Subject $param_Subject_5)
	throws java.io.IOException, javax.management.InstanceNotFoundException, javax.management.MBeanException, javax.management.ReflectionException
    {
	try {
	    Object $result = ref.invoke(this, $method_invoke_16, new Object[] {$param_ObjectName_1, $param_String_2, $param_MarshalledObject_3, $param_arrayOf_String_4, $param_Subject_5}, 1434350937885235744L);
	    return ((Object) $result);
	} catch (RuntimeException e) {
	    throw e;
	} catch (java.io.IOException e) {
	    throw e;
	} catch (javax.management.InstanceNotFoundException e) {
	    throw e;
	} catch (javax.management.MBeanException e) {
	    throw e;
	} catch (javax.management.ReflectionException e) {
	    throw e;
	} catch (Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }

    // implementation of isInstanceOf(ObjectName, String, Subject)
    public boolean isInstanceOf(javax.management.ObjectName $param_ObjectName_1, String $param_String_2, javax.security.auth.Subject $param_Subject_3)
	throws java.io.IOException, javax.management.InstanceNotFoundException
    {
	try {
	    Object $result = ref.invoke(this, $method_isInstanceOf_17, new Object[] {$param_ObjectName_1, $param_String_2, $param_Subject_3}, -2147516868461740814L);
	    return ((Boolean) $result).booleanValue();
	} catch (RuntimeException e) {
	    throw e;
	} catch (java.io.IOException e) {
	    throw e;
	} catch (javax.management.InstanceNotFoundException e) {
	    throw e;
	} catch (Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }

    // implementation of isRegistered(ObjectName, Subject)
    public boolean isRegistered(javax.management.ObjectName $param_ObjectName_1, javax.security.auth.Subject $param_Subject_2)
	throws java.io.IOException
    {
	try {
	    Object $result = ref.invoke(this, $method_isRegistered_18, new Object[] {$param_ObjectName_1, $param_Subject_2}, 8325683335228268564L);
	    return ((Boolean) $result).booleanValue();
	} catch (RuntimeException e) {
	    throw e;
	} catch (java.io.IOException e) {
	    throw e;
	} catch (Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }

    // implementation of queryMBeans(ObjectName, MarshalledObject, Subject)
    public java.util.Set queryMBeans(javax.management.ObjectName $param_ObjectName_1, java.rmi.MarshalledObject $param_MarshalledObject_2, javax.security.auth.Subject $param_Subject_3)
	throws java.io.IOException
    {
	try {
	    Object $result = ref.invoke(this, $method_queryMBeans_19, new Object[] {$param_ObjectName_1, $param_MarshalledObject_2, $param_Subject_3}, 2915881009400597976L);
	    return ((java.util.Set) $result);
	} catch (RuntimeException e) {
	    throw e;
	} catch (java.io.IOException e) {
	    throw e;
	} catch (Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }

    // implementation of queryNames(ObjectName, MarshalledObject, Subject)
    public java.util.Set queryNames(javax.management.ObjectName $param_ObjectName_1, java.rmi.MarshalledObject $param_MarshalledObject_2, javax.security.auth.Subject $param_Subject_3)
	throws java.io.IOException
    {
	try {
	    Object $result = ref.invoke(this, $method_queryNames_20, new Object[] {$param_ObjectName_1, $param_MarshalledObject_2, $param_Subject_3}, 9152567528369059802L);
	    return ((java.util.Set) $result);
	} catch (RuntimeException e) {
	    throw e;
	} catch (java.io.IOException e) {
	    throw e;
	} catch (Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }

    // implementation of removeNotificationListener(ObjectName, ObjectName, MarshalledObject, MarshalledObject, Subject)
    public void removeNotificationListener(javax.management.ObjectName $param_ObjectName_1, javax.management.ObjectName $param_ObjectName_2, java.rmi.MarshalledObject $param_MarshalledObject_3, java.rmi.MarshalledObject $param_MarshalledObject_4, javax.security.auth.Subject $param_Subject_5)
	throws java.io.IOException, javax.management.InstanceNotFoundException, javax.management.ListenerNotFoundException
    {
	try {
	    ref.invoke(this, $method_removeNotificationListener_21, new Object[] {$param_ObjectName_1, $param_ObjectName_2, $param_MarshalledObject_3, $param_MarshalledObject_4, $param_Subject_5}, 2578029900065214857L);
	} catch (RuntimeException e) {
	    throw e;
	} catch (java.io.IOException e) {
	    throw e;
	} catch (javax.management.InstanceNotFoundException e) {
	    throw e;
	} catch (javax.management.ListenerNotFoundException e) {
	    throw e;
	} catch (Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }

    // implementation of removeNotificationListener(ObjectName, ObjectName, Subject)
    public void removeNotificationListener(javax.management.ObjectName $param_ObjectName_1, javax.management.ObjectName $param_ObjectName_2, javax.security.auth.Subject $param_Subject_3)
	throws java.io.IOException, javax.management.InstanceNotFoundException, javax.management.ListenerNotFoundException
    {
	try {
	    ref.invoke(this, $method_removeNotificationListener_22, new Object[] {$param_ObjectName_1, $param_ObjectName_2, $param_Subject_3}, 6604721169198089513L);
	} catch (RuntimeException e) {
	    throw e;
	} catch (java.io.IOException e) {
	    throw e;
	} catch (javax.management.InstanceNotFoundException e) {
	    throw e;
	} catch (javax.management.ListenerNotFoundException e) {
	    throw e;
	} catch (Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }

    // implementation of removeNotificationListeners(ObjectName, Integer[], Subject)
    public void removeNotificationListeners(javax.management.ObjectName $param_ObjectName_1, Integer[] $param_arrayOf_Integer_2, javax.security.auth.Subject $param_Subject_3)
	throws java.io.IOException, javax.management.InstanceNotFoundException, javax.management.ListenerNotFoundException
    {
	try {
	    ref.invoke(this, $method_removeNotificationListeners_23, new Object[] {$param_ObjectName_1, $param_arrayOf_Integer_2, $param_Subject_3}, 2549120024456183446L);
	} catch (RuntimeException e) {
	    throw e;
	} catch (java.io.IOException e) {
	    throw e;
	} catch (javax.management.InstanceNotFoundException e) {
	    throw e;
	} catch (javax.management.ListenerNotFoundException e) {
	    throw e;
	} catch (Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }

    // implementation of setAttribute(ObjectName, MarshalledObject, Subject)
    public void setAttribute(javax.management.ObjectName $param_ObjectName_1, java.rmi.MarshalledObject $param_MarshalledObject_2, javax.security.auth.Subject $param_Subject_3)
	throws java.io.IOException, javax.management.AttributeNotFoundException, javax.management.InstanceNotFoundException, javax.management.InvalidAttributeValueException, javax.management.MBeanException, javax.management.ReflectionException
    {
	try {
	    ref.invoke(this, $method_setAttribute_24, new Object[] {$param_ObjectName_1, $param_MarshalledObject_2, $param_Subject_3}, 6738606893952597516L);
	} catch (RuntimeException e) {
	    throw e;
	} catch (java.io.IOException e) {
	    throw e;
	} catch (javax.management.AttributeNotFoundException e) {
	    throw e;
	} catch (javax.management.InstanceNotFoundException e) {
	    throw e;
	} catch (javax.management.InvalidAttributeValueException e) {
	    throw e;
	} catch (javax.management.MBeanException e) {
	    throw e;
	} catch (javax.management.ReflectionException e) {
	    throw e;
	} catch (Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }

    // implementation of setAttributes(ObjectName, MarshalledObject, Subject)
    public javax.management.AttributeList setAttributes(javax.management.ObjectName $param_ObjectName_1, java.rmi.MarshalledObject $param_MarshalledObject_2, javax.security.auth.Subject $param_Subject_3)
	throws java.io.IOException, javax.management.InstanceNotFoundException, javax.management.ReflectionException
    {
	try {
	    Object $result = ref.invoke(this, $method_setAttributes_25, new Object[] {$param_ObjectName_1, $param_MarshalledObject_2, $param_Subject_3}, -230470228399681820L);
	    return ((javax.management.AttributeList) $result);
	} catch (RuntimeException e) {
	    throw e;
	} catch (java.io.IOException e) {
	    throw e;
	} catch (javax.management.InstanceNotFoundException e) {
	    throw e;
	} catch (javax.management.ReflectionException e) {
	    throw e;
	} catch (Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }

    // implementation of unregisterMBean(ObjectName, Subject)
    public void unregisterMBean(javax.management.ObjectName $param_ObjectName_1, javax.security.auth.Subject $param_Subject_2)
	throws java.io.IOException, javax.management.InstanceNotFoundException, javax.management.MBeanRegistrationException
    {
	try {
	    ref.invoke(this, $method_unregisterMBean_26, new Object[] {$param_ObjectName_1, $param_Subject_2}, -159498580868721452L);
	} catch (RuntimeException e) {
	    throw e;
	} catch (java.io.IOException e) {
	    throw e;
	} catch (javax.management.InstanceNotFoundException e) {
	    throw e;
	} catch (javax.management.MBeanRegistrationException e) {
	    throw e;
	} catch (Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
}
