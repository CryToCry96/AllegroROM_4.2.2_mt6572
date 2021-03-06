// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst noctor space 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.common.collect:
//            Ordering, ReverseNaturalOrdering, Lists

final class NaturalOrdering extends Ordering
    implements Serializable
{

    static final NaturalOrdering INSTANCE = new NaturalOrdering();
    private static final long serialVersionUID;

    private NaturalOrdering()
    {
    }

    private Object readResolve()
    {
        return INSTANCE;
    }

    public int binarySearch(List list, Comparable comparable)
    {
        return Collections.binarySearch(list, comparable);
    }

    public volatile int binarySearch(List list, Object obj)
    {
        return binarySearch(list, (Comparable)obj);
    }

    public int compare(Comparable comparable, Comparable comparable1)
    {
        Preconditions.checkNotNull(comparable);
        Preconditions.checkNotNull(comparable1);
        if (comparable == comparable1)
            return 0;
        else
            return comparable.compareTo(comparable1);
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((Comparable)obj, (Comparable)obj1);
    }

    public Ordering reverse()
    {
        return ReverseNaturalOrdering.INSTANCE;
    }

    public List sortedCopy(Iterable iterable)
    {
        java.util.ArrayList arraylist = Lists.newArrayList(iterable);
        Collections.sort(arraylist);
        return arraylist;
    }

    public String toString()
    {
        return "Ordering.natural()";
    }

}
