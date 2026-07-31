package org.bouncycastle.jcajce.provider.asymmetric.util;

import defpackage.AbstractC9008l;
import defpackage.InterfaceC0543l;
import defpackage.InterfaceC4502l;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class DESUtil {
    private static final Set<String> des;

    static {
        HashSet hashSet = new HashSet();
        des = hashSet;
        hashSet.add("DES");
        hashSet.add("DESEDE");
        hashSet.add(InterfaceC4502l.loadAd.inmobi());
        hashSet.add(InterfaceC0543l.f1872implements.inmobi());
        hashSet.add(InterfaceC0543l.f1891l.inmobi());
    }

    public static boolean isDES(String str) {
        return des.contains(AbstractC9008l.mopub(str));
    }

    public static void setOddParity(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            bArr[i] = (byte) (((((b >> 7) ^ ((((((b >> 1) ^ (b >> 2)) ^ (b >> 3)) ^ (b >> 4)) ^ (b >> 5)) ^ (b >> 6))) ^ 1) & 1) | (b & 254));
        }
    }
}
