// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) fieldsfirst noctor space 

package com.android.bluetooth.pbap;

import java.util.HashMap;
import java.util.Map;

class JapaneseUtils
{

    private static final Map HALF_WIDTH_MAP;


    public static CharSequence tryGetHalfWidthText(char c)
    {
        if (HALF_WIDTH_MAP.containsKey(Character.valueOf(c)))
            return (CharSequence)HALF_WIDTH_MAP.get(Character.valueOf(c));
        else
            return null;
    }

    static 
    {
        HALF_WIDTH_MAP = new HashMap();
        HALF_WIDTH_MAP.put(Character.valueOf('\u3001'), "\uFF64");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3002'), "\uFF61");
        HALF_WIDTH_MAP.put(Character.valueOf('\u300C'), "\uFF62");
        HALF_WIDTH_MAP.put(Character.valueOf('\u300D'), "\uFF63");
        HALF_WIDTH_MAP.put(Character.valueOf('\u301C'), "~");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3041'), "\uFF67");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3042'), "\uFF71");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3043'), "\uFF68");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3044'), "\uFF72");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3045'), "\uFF69");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3046'), "\uFF73");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3047'), "\uFF6A");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3048'), "\uFF74");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3049'), "\uFF6B");
        HALF_WIDTH_MAP.put(Character.valueOf('\u304A'), "\uFF75");
        HALF_WIDTH_MAP.put(Character.valueOf('\u304B'), "\uFF76");
        HALF_WIDTH_MAP.put(Character.valueOf('\u304C'), "\uFF76\uFF9E");
        HALF_WIDTH_MAP.put(Character.valueOf('\u304D'), "\uFF77");
        HALF_WIDTH_MAP.put(Character.valueOf('\u304E'), "\uFF77\uFF9E");
        HALF_WIDTH_MAP.put(Character.valueOf('\u304F'), "\uFF78");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3050'), "\uFF78\uFF9E");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3051'), "\uFF79");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3052'), "\uFF79\uFF9E");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3053'), "\uFF7A");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3054'), "\uFF7A\uFF9E");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3055'), "\uFF7B");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3056'), "\uFF7B\uFF9E");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3057'), "\uFF7C");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3058'), "\uFF7C\uFF9E");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3059'), "\uFF7D");
        HALF_WIDTH_MAP.put(Character.valueOf('\u305A'), "\uFF7D\uFF9E");
        HALF_WIDTH_MAP.put(Character.valueOf('\u305B'), "\uFF7E");
        HALF_WIDTH_MAP.put(Character.valueOf('\u305C'), "\uFF7E\uFF9E");
        HALF_WIDTH_MAP.put(Character.valueOf('\u305D'), "\uFF7F");
        HALF_WIDTH_MAP.put(Character.valueOf('\u305E'), "\uFF7F\uFF9E");
        HALF_WIDTH_MAP.put(Character.valueOf('\u305F'), "\uFF80");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3060'), "\uFF80\uFF9E");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3061'), "\uFF81");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3062'), "\uFF81\uFF9E");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3063'), "\uFF6F");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3064'), "\uFF82");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3065'), "\uFF82\uFF9E");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3066'), "\uFF83");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3067'), "\uFF83\uFF9E");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3068'), "\uFF84");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3069'), "\uFF84\uFF9E");
        HALF_WIDTH_MAP.put(Character.valueOf('\u306A'), "\uFF85");
        HALF_WIDTH_MAP.put(Character.valueOf('\u306B'), "\uFF86");
        HALF_WIDTH_MAP.put(Character.valueOf('\u306C'), "\uFF87");
        HALF_WIDTH_MAP.put(Character.valueOf('\u306D'), "\uFF88");
        HALF_WIDTH_MAP.put(Character.valueOf('\u306E'), "\uFF89");
        HALF_WIDTH_MAP.put(Character.valueOf('\u306F'), "\uFF8A");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3070'), "\uFF8A\uFF9E");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3071'), "\uFF8A\uFF9F");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3072'), "\uFF8B");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3073'), "\uFF8B\uFF9E");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3074'), "\uFF8B\uFF9F");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3075'), "\uFF8C");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3076'), "\uFF8C\uFF9E");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3077'), "\uFF8C\uFF9F");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3078'), "\uFF8D");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3079'), "\uFF8D\uFF9E");
        HALF_WIDTH_MAP.put(Character.valueOf('\u307A'), "\uFF8D\uFF9F");
        HALF_WIDTH_MAP.put(Character.valueOf('\u307B'), "\uFF8E");
        HALF_WIDTH_MAP.put(Character.valueOf('\u307C'), "\uFF8E\uFF9E");
        HALF_WIDTH_MAP.put(Character.valueOf('\u307D'), "\uFF8E\uFF9F");
        HALF_WIDTH_MAP.put(Character.valueOf('\u307E'), "\uFF8F");
        HALF_WIDTH_MAP.put(Character.valueOf('\u307F'), "\uFF90");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3080'), "\uFF91");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3081'), "\uFF92");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3082'), "\uFF93");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3083'), "\uFF6C");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3084'), "\uFF94");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3085'), "\uFF6D");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3086'), "\uFF95");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3087'), "\uFF6E");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3088'), "\uFF96");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3089'), "\uFF97");
        HALF_WIDTH_MAP.put(Character.valueOf('\u308A'), "\uFF98");
        HALF_WIDTH_MAP.put(Character.valueOf('\u308B'), "\uFF99");
        HALF_WIDTH_MAP.put(Character.valueOf('\u308C'), "\uFF9A");
        HALF_WIDTH_MAP.put(Character.valueOf('\u308D'), "\uFF9B");
        HALF_WIDTH_MAP.put(Character.valueOf('\u308E'), "\uFF9C");
        HALF_WIDTH_MAP.put(Character.valueOf('\u308F'), "\uFF9C");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3090'), "\uFF72");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3091'), "\uFF74");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3092'), "\uFF66");
        HALF_WIDTH_MAP.put(Character.valueOf('\u3093'), "\uFF9D");
        HALF_WIDTH_MAP.put(Character.valueOf('\u309B'), "\uFF9E");
        HALF_WIDTH_MAP.put(Character.valueOf('\u309C'), "\uFF9F");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30A1'), "\uFF67");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30A2'), "\uFF71");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30A3'), "\uFF68");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30A4'), "\uFF72");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30A5'), "\uFF69");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30A6'), "\uFF73");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30A7'), "\uFF6A");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30A8'), "\uFF74");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30A9'), "\uFF6B");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30AA'), "\uFF75");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30AB'), "\uFF76");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30AC'), "\uFF76\uFF9E");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30AD'), "\uFF77");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30AE'), "\uFF77\uFF9E");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30AF'), "\uFF78");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30B0'), "\uFF78\uFF9E");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30B1'), "\uFF79");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30B2'), "\uFF79\uFF9E");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30B3'), "\uFF7A");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30B4'), "\uFF7A\uFF9E");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30B5'), "\uFF7B");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30B6'), "\uFF7B\uFF9E");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30B7'), "\uFF7C");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30B8'), "\uFF7C\uFF9E");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30B9'), "\uFF7D");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30BA'), "\uFF7D\uFF9E");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30BB'), "\uFF7E");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30BC'), "\uFF7E\uFF9E");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30BD'), "\uFF7F");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30BE'), "\uFF7F\uFF9E");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30BF'), "\uFF80");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30C0'), "\uFF80\uFF9E");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30C1'), "\uFF81");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30C2'), "\uFF81\uFF9E");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30C3'), "\uFF6F");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30C4'), "\uFF82");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30C5'), "\uFF82\uFF9E");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30C6'), "\uFF83");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30C7'), "\uFF83\uFF9E");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30C8'), "\uFF84");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30C9'), "\uFF84\uFF9E");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30CA'), "\uFF85");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30CB'), "\uFF86");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30CC'), "\uFF87");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30CD'), "\uFF88");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30CE'), "\uFF89");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30CF'), "\uFF8A");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30D0'), "\uFF8A\uFF9E");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30D1'), "\uFF8A\uFF9F");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30D2'), "\uFF8B");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30D3'), "\uFF8B\uFF9E");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30D4'), "\uFF8B\uFF9F");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30D5'), "\uFF8C");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30D6'), "\uFF8C\uFF9E");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30D7'), "\uFF8C\uFF9F");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30D8'), "\uFF8D");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30D9'), "\uFF8D\uFF9E");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30DA'), "\uFF8D\uFF9F");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30DB'), "\uFF8E");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30DC'), "\uFF8E\uFF9E");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30DD'), "\uFF8E\uFF9F");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30DE'), "\uFF8F");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30DF'), "\uFF90");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30E0'), "\uFF91");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30E1'), "\uFF92");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30E2'), "\uFF93");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30E3'), "\uFF6C");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30E4'), "\uFF94");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30E5'), "\uFF6D");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30E6'), "\uFF95");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30E7'), "\uFF6E");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30E8'), "\uFF96");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30E9'), "\uFF97");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30EA'), "\uFF98");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30EB'), "\uFF99");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30EC'), "\uFF9A");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30ED'), "\uFF9B");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30EE'), "\uFF9C");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30EF'), "\uFF9C");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30F0'), "\uFF72");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30F1'), "\uFF74");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30F2'), "\uFF66");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30F3'), "\uFF9D");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30F4'), "\uFF73\uFF9E");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30F5'), "\uFF76");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30F6'), "\uFF79");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30FB'), "\uFF65");
        HALF_WIDTH_MAP.put(Character.valueOf('\u30FC'), "\uFF70");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF01'), "!");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF02'), "\"");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF03'), "#");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF04'), "$");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF05'), "%");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF06'), "&");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF07'), "'");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF08'), "(");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF09'), ")");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF0A'), "*");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF0B'), "+");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF0C'), ",");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF0D'), "-");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF0E'), ".");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF0F'), "/");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF10'), "0");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF11'), "1");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF12'), "2");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF13'), "3");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF14'), "4");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF15'), "5");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF16'), "6");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF17'), "7");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF18'), "8");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF19'), "9");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF1A'), ":");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF1B'), ";");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF1C'), "<");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF1D'), "=");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF1E'), ">");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF1F'), "?");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF20'), "@");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF21'), "A");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF22'), "B");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF23'), "C");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF24'), "D");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF25'), "E");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF26'), "F");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF27'), "G");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF28'), "H");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF29'), "I");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF2A'), "J");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF2B'), "K");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF2C'), "L");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF2D'), "M");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF2E'), "N");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF2F'), "O");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF30'), "P");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF31'), "Q");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF32'), "R");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF33'), "S");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF34'), "T");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF35'), "U");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF36'), "V");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF37'), "W");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF38'), "X");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF39'), "Y");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF3A'), "Z");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF3B'), "[");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF3C'), "\\");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF3D'), "]");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF3E'), "^");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF3F'), "_");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF41'), "a");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF42'), "b");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF43'), "c");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF44'), "d");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF45'), "e");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF46'), "f");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF47'), "g");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF48'), "h");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF49'), "i");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF4A'), "j");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF4B'), "k");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF4C'), "l");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF4D'), "m");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF4E'), "n");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF4F'), "o");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF50'), "p");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF51'), "q");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF52'), "r");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF53'), "s");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF54'), "t");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF55'), "u");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF56'), "v");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF57'), "w");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF58'), "x");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF59'), "y");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF5A'), "z");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF5B'), "{");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF5C'), "|");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF5D'), "}");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF5E'), "~");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF61'), "\uFF61");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF62'), "\uFF62");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF63'), "\uFF63");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF64'), "\uFF64");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF65'), "\uFF65");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF66'), "\uFF66");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF67'), "\uFF67");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF68'), "\uFF68");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF69'), "\uFF69");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF6A'), "\uFF6A");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF6B'), "\uFF6B");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF6C'), "\uFF6C");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF6D'), "\uFF6D");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF6E'), "\uFF6E");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF6F'), "\uFF6F");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF70'), "\uFF70");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF71'), "\uFF71");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF72'), "\uFF72");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF73'), "\uFF73");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF74'), "\uFF74");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF75'), "\uFF75");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF76'), "\uFF76");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF77'), "\uFF77");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF78'), "\uFF78");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF79'), "\uFF79");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF7A'), "\uFF7A");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF7B'), "\uFF7B");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF7C'), "\uFF7C");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF7D'), "\uFF7D");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF7E'), "\uFF7E");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF7F'), "\uFF7F");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF80'), "\uFF80");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF81'), "\uFF81");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF82'), "\uFF82");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF83'), "\uFF83");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF84'), "\uFF84");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF85'), "\uFF85");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF86'), "\uFF86");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF87'), "\uFF87");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF88'), "\uFF88");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF89'), "\uFF89");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF8A'), "\uFF8A");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF8B'), "\uFF8B");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF8C'), "\uFF8C");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF8D'), "\uFF8D");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF8E'), "\uFF8E");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF8F'), "\uFF8F");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF90'), "\uFF90");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF91'), "\uFF91");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF92'), "\uFF92");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF93'), "\uFF93");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF94'), "\uFF94");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF95'), "\uFF95");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF96'), "\uFF96");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF97'), "\uFF97");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF98'), "\uFF98");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF99'), "\uFF99");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF9A'), "\uFF9A");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF9B'), "\uFF9B");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF9C'), "\uFF9C");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF9D'), "\uFF9D");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF9E'), "\uFF9E");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFF9F'), "\uFF9F");
        HALF_WIDTH_MAP.put(Character.valueOf('\uFFE5'), "\\");
    }
}
