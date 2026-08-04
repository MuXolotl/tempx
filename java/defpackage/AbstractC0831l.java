package defpackage;

import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؒؖؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0831l {
    public static final C17253l yandex = new C17253l(0.0f, 0.0f, 0.0f, 0.0f);
    public static final float loadAd = 64.0f;
    public static final float crashlytics = 64.0f;
    public static final float amazon = 120.0f;
    public static final float purchase = 152.0f;

    public static C14282l amazon(long j, long j2, long j3, C6956l c6956l, int i) {
        long j4 = (i & 2) != 0 ? C9735l.firebase : j2;
        long j5 = C9735l.firebase;
        long j6 = (i & 16) != 0 ? j5 : j3;
        C14282l c14282lLoadAd = loadAd(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex);
        return c14282lLoadAd.yandex(j, j4, j5, j5, j6, c14282lLoadAd.billing);
    }

    public static C14282l billing(long j, long j2, long j3, long j4, long j5, C6956l c6956l, int i) {
        return loadAd(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex).yandex(j, (i & 2) != 0 ? C9735l.firebase : j2, (i & 4) != 0 ? C9735l.firebase : j3, (i & 8) != 0 ? C9735l.firebase : j4, (i & 16) != 0 ? C9735l.firebase : j5, C9735l.firebase);
    }

    public static C1628l crashlytics(C6956l c6956l) {
        WeakHashMap weakHashMap = C12923l.pro;
        return new C1628l(new C18004l(C6760l.smaato(c6956l).mopub, C6760l.smaato(c6956l).loadAd), AbstractC15929l.mopub | 16);
    }

    public static C14282l loadAd(C0764l c0764l) {
        C14282l c14282l = c0764l.f2302instanceof;
        if (c14282l != null) {
            return c14282l;
        }
        C14282l c14282l2 = new C14282l(AbstractC15038l.amazon(c0764l, 35), AbstractC15038l.amazon(c0764l, 37), AbstractC15038l.amazon(c0764l, 18), AbstractC15038l.amazon(c0764l, 18), AbstractC15038l.amazon(c0764l, 19), AbstractC15038l.amazon(c0764l, 19));
        c0764l.f2302instanceof = c14282l2;
        return c14282l2;
    }

    public static C2663l purchase(C6956l c6956l) {
        C6935l c6935lAdmob = AbstractC18079l.admob(c6956l);
        Object objM2132native = c6956l.m2132native();
        Object obj = C1867l.yandex;
        if (objM2132native == obj) {
            objM2132native = new C1712l(12);
            c6956l.m2147try(objM2132native);
        }
        Function0 function0 = (Function0) objM2132native;
        boolean zBilling = c6956l.billing(c6935lAdmob) | c6956l.billing(function0);
        Object objM2132native2 = c6956l.m2132native();
        if (zBilling || objM2132native2 == obj) {
            objM2132native2 = new C2663l(c6935lAdmob, function0);
            c6956l.m2147try(objM2132native2);
        }
        return (C2663l) objM2132native2;
    }

    public static C13072l yandex(C6956l c6956l) {
        C6935l c6935lAdmob = AbstractC18079l.admob(c6956l);
        Object objM2132native = c6956l.m2132native();
        Object obj = C1867l.yandex;
        if (objM2132native == obj) {
            objM2132native = new C1712l(12);
            c6956l.m2147try(objM2132native);
        }
        Function0 function0 = (Function0) objM2132native;
        InterfaceC17807l interfaceC17807lRemoteconfig = C17423l.remoteconfig(c6956l, 4);
        C17308l c17308lYandex = AbstractC0310l.yandex(c6956l);
        boolean zBilling = c6956l.billing(c6935lAdmob) | c6956l.billing(function0) | c6956l.billing(interfaceC17807lRemoteconfig) | c6956l.billing(c17308lYandex);
        Object objM2132native2 = c6956l.m2132native();
        if (zBilling || objM2132native2 == obj) {
            objM2132native2 = new C13072l(c6935lAdmob, interfaceC17807lRemoteconfig, c17308lYandex, function0);
            c6956l.m2147try(objM2132native2);
        }
        return (C13072l) objM2132native2;
    }
}
