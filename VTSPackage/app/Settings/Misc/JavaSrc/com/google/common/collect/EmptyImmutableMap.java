// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst noctor space 

package com.google.common.collect;

import java.util.*;

// Referenced classes of package com.google.common.collect:
//            ImmutableMap, ImmutableSet, ImmutableCollection

final class EmptyImmutableMap extends ImmutableMap
{

    static final EmptyImmutableMap INSTANCE = new EmptyImmutableMap();
    private static final long serialVersionUID;

    private EmptyImmutableMap()
    {
    }

    public boolean containsKey(Object obj)
    {
        return false;
    }

    public boolean containsValue(Object obj)
    {
        return false;
    }

    public ImmutableSet entrySet()
    {
        return ImmutableSet.of();
    }

    public volatile Set entrySet()
    {
        return entrySet();
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof Map)
            return ((Map)obj).isEmpty();
        else
            return false;
    }

    public Object get(Object obj)
    {
        return null;
    }

    public int hashCode()
    {
        return 0;
    }

    public boolean isEmpty()
    {
        return true;
    }

    boolean isPartialView()
    {
        return false;
    }

    public ImmutableSet keySet()
    {
        return ImmutableSet.of();
    }

    public volatile Set keySet()
    {
        return keySet();
    }

    Object readResolve()
    {
        return INSTANCE;
    }

    public int size()
    {
        return 0;
    }

    public String toString()
    {
        return "{}";
    }

    public ImmutableCollection values()
    {
        return ImmutableCollection.EMPTY_IMMUTABLE_COLLECTION;
    }

    public volatile Collection values()
    {
        return values();
    }

}
