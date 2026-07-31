package defpackage;

import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٍٙؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9637l {
    public static final C15578l yandex = new C15578l(-1282073367, false, new C13982l(21));
    public static final C15578l loadAd = new C15578l(1815061864, false, new C13982l(22));
    public static final C15578l crashlytics = new C15578l(715283417, false, new C13982l(23));

    public static final int amazon(long j, C0327l c0327l) {
        int i = (int) (4294967295L & j);
        if (Float.intBitsToFloat(i) <= 0.0f) {
            return 0;
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        C6222l c6222l = c0327l.loadAd;
        return fIntBitsToFloat >= c6222l.purchase ? c0327l.yandex.yandex.f7563l.length() : c6222l.mopub(j);
    }

    public static final InterfaceC8714l purchase(C11919l c11919l, C6956l c6956l, int i) {
        c6956l.m2123default(-220138742);
        C7472l c7472l = C7472l.f15463l;
        c6956l.m2123default(644836070);
        boolean zBilling = c6956l.billing(c11919l) | c6956l.billing(c7472l);
        Object objM2132native = c6956l.m2132native();
        Object obj = C1867l.yandex;
        if (zBilling || objM2132native == obj) {
            objM2132native = new C10086l(c11919l.admob(), c7472l);
            c6956l.m2147try(objM2132native);
        }
        InterfaceC8714l interfaceC8714l = (InterfaceC8714l) objM2132native;
        c6956l.startapp(false);
        c6956l.m2123default(644838839);
        boolean zAdmob = c6956l.admob(c11919l) | c6956l.billing(interfaceC8714l);
        Object objM2132native2 = c6956l.m2132native();
        if (zAdmob || objM2132native2 == obj) {
            objM2132native2 = new C10207l(c11919l, interfaceC8714l, 17);
            c6956l.m2147try(objM2132native2);
        }
        c6956l.startapp(false);
        AbstractC12311l.loadAd(c11919l, (Function1) objM2132native2, c6956l);
        c6956l.startapp(false);
        return interfaceC8714l;
    }

    public static final int yandex(int i, int i2, C6218l c6218l, long j, C15812l c15812l) {
        if (c15812l == null) {
            return AbstractC15450l.amazon(i, i2);
        }
        int iCompare = c6218l.mopub.compare(Long.valueOf(c15812l.crashlytics), Long.valueOf(j));
        if (iCompare < 0) {
            return 1;
        }
        return iCompare > 0 ? 3 : 2;
    }

    public abstract int crashlytics(C8911l c8911l);

    public abstract void loadAd(C8911l c8911l, Set set);
}
