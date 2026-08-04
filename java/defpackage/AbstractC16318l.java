package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lُٖؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16318l {
    public static final C12349l yandex = new C12349l(3, null, 0);
    public static final C12349l loadAd = new C12349l(3, null, 1);

    public static final long crashlytics(long j) {
        return AbstractC12311l.mopub(Float.isNaN(C12121l.loadAd(j)) ? 0.0f : C12121l.loadAd(j), Float.isNaN(C12121l.crashlytics(j)) ? 0.0f : C12121l.crashlytics(j));
    }

    public static final InterfaceC6940l loadAd(C6956l c6956l, Function1 function1) {
        InterfaceC8714l interfaceC8714lVip = AbstractC8020l.vip(function1, c6956l);
        Object objM2132native = c6956l.m2132native();
        if (objM2132native == C1867l.yandex) {
            C10251l c10251l = new C10251l(new C9922l(interfaceC8714lVip, 12));
            c6956l.m2147try(c10251l);
            objM2132native = c10251l;
        }
        return (InterfaceC6940l) objM2132native;
    }

    public static InterfaceC17242l yandex(InterfaceC6940l interfaceC6940l, boolean z, C2403l c2403l, boolean z2, Function3 function3, boolean z3) {
        return new C18422l(interfaceC6940l, EnumC7283l.f15125l, z, c2403l, z2, yandex, function3, z3);
    }
}
