// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst noctor space 

package com.google.common.collect;

import java.io.*;
import java.util.*;

// Referenced classes of package com.google.common.collect:
//            AbstractBiMap, WellBehavedMap, Maps, EnumBiMap, 
//            Serialization, BiMap

public final class EnumHashBiMap extends AbstractBiMap
{

    private static final long serialVersionUID;
    private transient Class keyType;

    private EnumHashBiMap(Class class1)
    {
        super(WellBehavedMap.wrap(new EnumMap(class1)), Maps.newHashMapWithExpectedSize(((Enum[])class1.getEnumConstants()).length));
        keyType = class1;
    }

    public static EnumHashBiMap create(Class class1)
    {
        return new EnumHashBiMap(class1);
    }

    public static EnumHashBiMap create(Map map)
    {
        EnumHashBiMap enumhashbimap = create(EnumBiMap.inferKeyType(map));
        enumhashbimap.putAll(map);
        return enumhashbimap;
    }

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        objectinputstream.defaultReadObject();
        keyType = (Class)objectinputstream.readObject();
        setDelegates(WellBehavedMap.wrap(new EnumMap(keyType)), new HashMap((3 * ((Enum[])keyType.getEnumConstants()).length) / 2));
        Serialization.populateMap(this, objectinputstream);
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        objectoutputstream.defaultWriteObject();
        objectoutputstream.writeObject(keyType);
        Serialization.writeMap(this, objectoutputstream);
    }

    public volatile void clear()
    {
        super.clear();
    }

    public volatile boolean containsValue(Object obj)
    {
        return super.containsValue(obj);
    }

    public volatile Set entrySet()
    {
        return super.entrySet();
    }

    public Object forcePut(Enum enum, Object obj)
    {
        return super.forcePut(enum, obj);
    }

    public volatile Object forcePut(Object obj, Object obj1)
    {
        return forcePut((Enum)obj, obj1);
    }

    public volatile BiMap inverse()
    {
        return super.inverse();
    }

    public volatile Set keySet()
    {
        return super.keySet();
    }

    public Class keyType()
    {
        return keyType;
    }

    public Object put(Enum enum, Object obj)
    {
        return super.put(enum, obj);
    }

    public volatile Object put(Object obj, Object obj1)
    {
        return put((Enum)obj, obj1);
    }

    public volatile void putAll(Map map)
    {
        super.putAll(map);
    }

    public volatile Object remove(Object obj)
    {
        return super.remove(obj);
    }

    public volatile Set values()
    {
        return super.values();
    }
}
