package defpackage;

import java.util.HashMap;

/* JADX INFO: renamed from: lٍؔٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2515l {
    public static final C13975l yandex;

    static {
        int i = AbstractC15690l.yandex;
        int i2 = C17500l.yandex;
        yandex = new C13975l(4);
    }

    public static boolean loadAd(C7313l c7313l) {
        long jYandex = yandex(c7313l);
        if (jYandex == -1) {
            EnumC8711l[] enumC8711lArr = EnumC8711l.f17925l;
            yandex.getClass();
            int i = C17500l.yandex;
            return false;
        }
        boolean z = false;
        for (C2047l c2047l : c7313l.f15163l) {
            if (z) {
                String str = c2047l.yandex;
                HashMap map = EnumC2086l.f4674l;
                if (str.equals("id3 ") || str.equals("LIST") || str.equals("INFO")) {
                }
            } else if (c2047l.loadAd == jYandex) {
                z = true;
            }
        }
        return z;
    }

    public static long yandex(C7313l c7313l) {
        C5368l c5368l = c7313l.f15164l;
        if (c5368l != null) {
            long jLongValue = c5368l.f11506l.longValue();
            return (c7313l.f15166l == null || c7313l.startapp() >= jLongValue) ? jLongValue : c7313l.startapp();
        }
        if (c7313l.f15166l != null) {
            return c7313l.startapp();
        }
        return -1L;
    }
}
