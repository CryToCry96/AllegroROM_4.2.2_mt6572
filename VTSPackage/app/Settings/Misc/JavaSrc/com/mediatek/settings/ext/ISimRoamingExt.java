// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst noctor space 

package com.mediatek.settings.ext;

import android.content.Context;
import android.preference.Preference;

public interface ISimRoamingExt
{

    public abstract String getRoamingWarningMsg(Context context, int i);

    public abstract void setSummary(Preference preference);

    public abstract void showDialog(Context context);
}
