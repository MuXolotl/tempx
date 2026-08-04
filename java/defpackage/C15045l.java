package defpackage;

import android.util.Log;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: renamed from: lٔٞؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15045l {
    public final void yandex(InterfaceC12493l interfaceC12493l, int i, String str, Object... objArr) {
        int iMin;
        int iInmobi = AbstractC5020l.inmobi(i);
        LinkedHashMap linkedHashMap = AbstractC1303l.yandex;
        String strAdcel = (str == null || AbstractC12024l.m3315catch(str)) ? null : AbstractC14814l.adcel("[", interfaceC12493l.getName(), "] ", str);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        if (strAdcel == null || strAdcel.length() == 0) {
            strAdcel = "";
        } else if (objArrCopyOf.length != 0) {
            Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length);
            Locale locale = Locale.US;
            Object[] objArrCopyOf3 = Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length);
            strAdcel = String.format(locale, strAdcel, Arrays.copyOf(objArrCopyOf3, objArrCopyOf3.length));
        }
        if (strAdcel.length() < 4000) {
            if (iInmobi <= 1) {
                Log.v("REALM", strAdcel);
                return;
            }
            if (iInmobi == 2) {
                Log.d("REALM", strAdcel);
                return;
            } else if (iInmobi == 6) {
                Log.wtf("REALM", strAdcel);
                return;
            } else {
                Log.println(iInmobi, "REALM", strAdcel);
                return;
            }
        }
        int length = strAdcel.length();
        int i2 = 0;
        while (i2 < length) {
            int iM3321extends = AbstractC12024l.m3321extends(strAdcel, '\n', i2, 4);
            if (iM3321extends == -1) {
                iM3321extends = length;
            }
            while (true) {
                iMin = Math.min(iM3321extends, i2 + 4000);
                String strSubstring = strAdcel.substring(i2, iMin);
                if (iInmobi <= 1) {
                    Log.v("REALM", strSubstring);
                } else if (iInmobi == 2) {
                    Log.d("REALM", strSubstring);
                } else if (iInmobi == 6) {
                    Log.wtf("REALM", strSubstring);
                } else {
                    Log.println(iInmobi, "REALM", strSubstring);
                }
                if (iMin >= iM3321extends) {
                    break;
                } else {
                    i2 = iMin;
                }
            }
            i2 = iMin + 1;
        }
    }
}
