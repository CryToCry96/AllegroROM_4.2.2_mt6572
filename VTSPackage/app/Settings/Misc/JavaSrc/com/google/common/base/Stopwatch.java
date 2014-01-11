// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst noctor space 

package com.google.common.base;

import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.common.base:
//            Ticker, Preconditions

public final class Stopwatch
{

    private long elapsedNanos;
    private boolean isRunning;
    private long startTick;
    private final Ticker ticker;

    public Stopwatch()
    {
        this(Ticker.systemTicker());
    }

    public Stopwatch(Ticker ticker1)
    {
        ticker = (Ticker)Preconditions.checkNotNull(ticker1);
    }

    private static String abbreviate(TimeUnit timeunit)
    {
        static class _cls1
        {

            static final int $SwitchMap$java$util$concurrent$TimeUnit[];

            static 
            {
                $SwitchMap$java$util$concurrent$TimeUnit = new int[TimeUnit.values().length];
                try
                {
                    $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.NANOSECONDS.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror) { }
                try
                {
                    $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.MICROSECONDS.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.MILLISECONDS.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.SECONDS.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.java.util.concurrent.TimeUnit[timeunit.ordinal()])
        {
        case 4: // '\004'
            return "s";

        case 3: // '\003'
            return "ms";

        case 2: // '\002'
            return "\u03BCs";

        case 1: // '\001'
            return "ns";
        }
        throw new AssertionError();
    }

    private static TimeUnit chooseUnit(long l)
    {
        if (TimeUnit.SECONDS.convert(l, TimeUnit.NANOSECONDS) > 0L)
            return TimeUnit.SECONDS;
        if (TimeUnit.MILLISECONDS.convert(l, TimeUnit.NANOSECONDS) > 0L)
            return TimeUnit.MILLISECONDS;
        if (TimeUnit.MICROSECONDS.convert(l, TimeUnit.NANOSECONDS) > 0L)
            return TimeUnit.MICROSECONDS;
        else
            return TimeUnit.NANOSECONDS;
    }

    private long elapsedNanos()
    {
        if (isRunning)
            return (ticker.read() - startTick) + elapsedNanos;
        else
            return elapsedNanos;
    }

    public long elapsedMillis()
    {
        return elapsedTime(TimeUnit.MILLISECONDS);
    }

    public long elapsedTime(TimeUnit timeunit)
    {
        return timeunit.convert(elapsedNanos(), TimeUnit.NANOSECONDS);
    }

    public boolean isRunning()
    {
        return isRunning;
    }

    public Stopwatch reset()
    {
        elapsedNanos = 0L;
        isRunning = false;
        return this;
    }

    public Stopwatch start()
    {
        boolean flag;
        if (!isRunning)
            flag = true;
        else
            flag = false;
        Preconditions.checkState(flag);
        isRunning = true;
        startTick = ticker.read();
        return this;
    }

    public Stopwatch stop()
    {
        long l = ticker.read();
        Preconditions.checkState(isRunning);
        isRunning = false;
        elapsedNanos = elapsedNanos + (l - startTick);
        return this;
    }

    public String toString()
    {
        return toString(4);
    }

    public String toString(int i)
    {
        long l = elapsedNanos();
        TimeUnit timeunit = chooseUnit(l);
        double d = (double)l / (double)TimeUnit.NANOSECONDS.convert(1L, timeunit);
        String s = (new StringBuilder()).append("%.").append(i).append("g %s").toString();
        Object aobj[] = new Object[2];
        aobj[0] = Double.valueOf(d);
        aobj[1] = abbreviate(timeunit);
        return String.format(s, aobj);
    }
}
