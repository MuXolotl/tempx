package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lَۘٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10521l {
    public static final C4685l loadAd;
    public static final C6157l yandex;

    static {
        C6157l c6157l = new C6157l(0);
        yandex = c6157l;
        loadAd = new C4685l(0, 0, 0, EnumC7283l.f15125l, 0, 0, 0, C14823l.f29010l, new C1983l(3), AbstractC11990l.yandex(C17218l.f33421l), c6157l, AbstractC7563l.loadAd(0, 0, 0, 0, 15));
    }

    public static final C2887l loadAd(int i, Function0 function0, C6956l c6956l, int i2, int i3) {
        boolean z = true;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        C13645l c13645l = C2887l.f6287synchronized;
        boolean zAmazon = c6956l.amazon(i) | c6956l.crashlytics(0.0f);
        if ((((i2 & 896) ^ 384) <= 256 || !c6956l.billing(function0)) && (i2 & 384) != 256) {
            z = false;
        }
        boolean z2 = zAmazon | z;
        Object objM2132native = c6956l.m2132native();
        if (z2 || objM2132native == C1867l.yandex) {
            objM2132native = new C8803l(i, function0, 3);
            c6956l.m2147try(objM2132native);
        }
        C2887l c2887l = (C2887l) AbstractC0825l.smaato(objArr, c13645l, (Function0) objM2132native, c6956l, 0);
        c2887l.f6288package.setValue(function0);
        return c2887l;
    }

    public static final long yandex(C4685l c4685l, int i) {
        int i2 = c4685l.crashlytics;
        int i3 = c4685l.loadAd;
        long j = ((long) i) * ((long) (i2 + i3));
        int i4 = -c4685l.billing;
        int i5 = c4685l.amazon;
        long j2 = ((j + ((long) i4)) + ((long) i5)) - ((long) c4685l.crashlytics);
        int iSubs = (int) (c4685l.purchase == EnumC7283l.f15125l ? c4685l.subs() >> 32 : c4685l.subs() & 4294967295L);
        long jPurchase = j2 - ((long) (iSubs - AbstractC8576l.purchase(c4685l.vip.purchase(iSubs, i3, i4, i5), 0, iSubs)));
        if (jPurchase < 0) {
            return 0L;
        }
        return jPurchase;
    }
}
