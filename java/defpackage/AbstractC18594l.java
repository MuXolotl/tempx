package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lٕۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC18594l {
    public static final C3797l yandex = C3797l.appmetrica("k");

    public static void loadAd(ArrayList arrayList) {
        int i;
        Object obj;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            C4529l c4529l = (C4529l) arrayList.get(i2);
            i2++;
            C4529l c4529l2 = (C4529l) arrayList.get(i2);
            c4529l.admob = Float.valueOf(c4529l2.mopub);
            if (c4529l.crashlytics == null && (obj = c4529l2.loadAd) != null) {
                c4529l.crashlytics = obj;
                if (c4529l instanceof C12786l) {
                    ((C12786l) c4529l).amazon();
                }
            }
        }
        C4529l c4529l3 = (C4529l) arrayList.get(i);
        if ((c4529l3.loadAd == null || c4529l3.crashlytics == null) && arrayList.size() > 1) {
            arrayList.remove(c4529l3);
        }
    }

    public static ArrayList yandex(AbstractC9542l abstractC9542l, C10712l c10712l, float f, InterfaceC12702l interfaceC12702l, boolean z) {
        AbstractC9542l abstractC9542l2;
        C10712l c10712l2;
        float f2;
        InterfaceC12702l interfaceC12702l2;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        if (abstractC9542l.mo1287synchronized() == 6) {
            c10712l.yandex("Lottie doesn't support expressions.");
            return arrayList;
        }
        abstractC9542l.billing();
        while (abstractC9542l.ads()) {
            if (abstractC9542l.mo1288throw(yandex) != 0) {
                abstractC9542l.mo1275continue();
            } else if (abstractC9542l.mo1287synchronized() == 1) {
                abstractC9542l.yandex();
                if (abstractC9542l.mo1287synchronized() == 7) {
                    AbstractC9542l abstractC9542l3 = abstractC9542l;
                    C10712l c10712l3 = c10712l;
                    float f3 = f;
                    InterfaceC12702l interfaceC12702l3 = interfaceC12702l;
                    boolean z3 = z;
                    C4529l c4529lLoadAd = AbstractC7844l.loadAd(abstractC9542l3, c10712l3, f3, interfaceC12702l3, false, z3);
                    abstractC9542l2 = abstractC9542l3;
                    c10712l2 = c10712l3;
                    f2 = f3;
                    interfaceC12702l2 = interfaceC12702l3;
                    z2 = z3;
                    arrayList.add(c4529lLoadAd);
                } else {
                    abstractC9542l2 = abstractC9542l;
                    c10712l2 = c10712l;
                    f2 = f;
                    interfaceC12702l2 = interfaceC12702l;
                    z2 = z;
                    while (abstractC9542l2.ads()) {
                        arrayList.add(AbstractC7844l.loadAd(abstractC9542l2, c10712l2, f2, interfaceC12702l2, true, z2));
                    }
                }
                abstractC9542l2.mopub();
                abstractC9542l = abstractC9542l2;
                c10712l = c10712l2;
                f = f2;
                interfaceC12702l = interfaceC12702l2;
                z = z2;
            } else {
                AbstractC9542l abstractC9542l4 = abstractC9542l;
                arrayList.add(AbstractC7844l.loadAd(abstractC9542l4, c10712l, f, interfaceC12702l, false, z));
                abstractC9542l = abstractC9542l4;
            }
        }
        abstractC9542l.vip();
        loadAd(arrayList);
        return arrayList;
    }
}
