package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lَۚٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10554l {
    public final C13660l crashlytics;
    public final C0289l loadAd;
    public final InterfaceC17865l yandex;

    public C10554l(InterfaceC17865l interfaceC17865l, C0289l c0289l) {
        this.yandex = interfaceC17865l;
        this.loadAd = c0289l;
        long[] jArr = AbstractC12154l.yandex;
        this.crashlytics = new C13660l();
    }

    public final Object loadAd(Object obj) {
        if (obj == null) {
            return null;
        }
        C4947l c4947l = (C4947l) this.crashlytics.mopub(obj);
        if (c4947l != null) {
            return c4947l.loadAd;
        }
        InterfaceC3074l interfaceC3074l = (InterfaceC3074l) this.loadAd.invoke();
        int iPurchase = interfaceC3074l.purchase(obj);
        if (iPurchase != -1) {
            return interfaceC3074l.crashlytics(iPurchase);
        }
        return null;
    }

    public final Function2 yandex(int i, Object obj, Object obj2) {
        C13660l c13660l = this.crashlytics;
        C4947l c4947l = (C4947l) c13660l.mopub(obj);
        int i2 = 17;
        if (c4947l != null && c4947l.crashlytics == i && AbstractC8576l.yandex(c4947l.loadAd, obj2)) {
            C15578l c15578l = c4947l.amazon;
            if (c15578l != null) {
                return c15578l;
            }
            C15578l c15578l2 = new C15578l(818252804, true, new C14601l(c4947l.purchase, c4947l, i2));
            c4947l.amazon = c15578l2;
            return c15578l2;
        }
        C4947l c4947l2 = new C4947l(this, i, obj, obj2);
        c13660l.vip(obj, c4947l2);
        C15578l c15578l3 = c4947l2.amazon;
        if (c15578l3 != null) {
            return c15578l3;
        }
        C15578l c15578l4 = new C15578l(818252804, true, new C14601l(this, c4947l2, i2));
        c4947l2.amazon = c15578l4;
        return c15578l4;
    }
}
