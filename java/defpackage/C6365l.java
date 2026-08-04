package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lَؙؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6365l {
    public ArrayList loadAd;
    public AbstractC14648l yandex;

    public static long loadAd(C7265l c7265l, long j) {
        AbstractC14648l abstractC14648l = c7265l.amazon;
        ArrayList arrayList = c7265l.firebase;
        if (abstractC14648l instanceof C14433l) {
            return j;
        }
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            InterfaceC1419l interfaceC1419l = (InterfaceC1419l) arrayList.get(i);
            if (interfaceC1419l instanceof C7265l) {
                C7265l c7265l2 = (C7265l) interfaceC1419l;
                if (c7265l2.amazon != abstractC14648l) {
                    jMax = Math.max(jMax, loadAd(c7265l2, ((long) c7265l2.billing) + j));
                }
            }
        }
        C7265l c7265l3 = abstractC14648l.admob;
        C7265l c7265l4 = abstractC14648l.subs;
        if (c7265l != c7265l3) {
            return jMax;
        }
        long jIsPro = abstractC14648l.isPro() + j;
        return Math.max(Math.max(jMax, loadAd(c7265l4, jIsPro)), jIsPro - ((long) c7265l4.billing));
    }

    public static long yandex(C7265l c7265l, long j) {
        AbstractC14648l abstractC14648l = c7265l.amazon;
        ArrayList arrayList = c7265l.firebase;
        if (abstractC14648l instanceof C14433l) {
            return j;
        }
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            InterfaceC1419l interfaceC1419l = (InterfaceC1419l) arrayList.get(i);
            if (interfaceC1419l instanceof C7265l) {
                C7265l c7265l2 = (C7265l) interfaceC1419l;
                if (c7265l2.amazon != abstractC14648l) {
                    jMin = Math.min(jMin, yandex(c7265l2, ((long) c7265l2.billing) + j));
                }
            }
        }
        C7265l c7265l3 = abstractC14648l.subs;
        C7265l c7265l4 = abstractC14648l.admob;
        if (c7265l != c7265l3) {
            return jMin;
        }
        long jIsPro = j - abstractC14648l.isPro();
        return Math.min(Math.min(jMin, yandex(c7265l4, jIsPro)), jIsPro - ((long) c7265l4.billing));
    }
}
