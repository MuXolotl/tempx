package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lَؖۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4333l {
    public static final C6096l yandex = new C6096l(11);
    public static final Object loadAd = new Object();

    public static final void loadAd(C2768l c2768l, InterfaceC17242l interfaceC17242l, Function2 function2, C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(-511989831);
        if ((i & 6) == 0) {
            i2 = (c6956l.admob(c2768l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.billing(interfaceC17242l) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.admob(function2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            long j = c6956l.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
            C14112l c14112lMopub = AbstractC8238l.mopub(c6956l);
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242l);
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            C16395l c16395l = C16395l.f32070l;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c2768l, c2768l.crashlytics);
            AbstractC8182l.billing(c6956l, c14112lMopub, c2768l.amazon);
            AbstractC8182l.billing(c6956l, function2, c2768l.purchase);
            InterfaceC8801l.firebase.getClass();
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i3), C3438l.isPro);
            c6956l.startapp(true);
            if (c6956l.isVip()) {
                c6956l.m2123default(-1259187287);
                c6956l.startapp(false);
            } else {
                c6956l.m2123default(-1259245908);
                boolean zAdmob = c6956l.admob(c2768l);
                Object objM2132native = c6956l.m2132native();
                if (zAdmob || objM2132native == C1867l.yandex) {
                    objM2132native = new C11029l(18, c2768l);
                    c6956l.m2147try(objM2132native);
                }
                AbstractC12311l.billing((Function0) objM2132native, c6956l);
                c6956l.startapp(false);
            }
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C12364l(c2768l, interfaceC17242l, function2, i);
        }
    }

    public static final void yandex(InterfaceC17242l interfaceC17242l, Function2 function2, C6956l c6956l, int i, int i2) {
        int i3;
        c6956l.m2133new(-1298353104);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (c6956l.billing(interfaceC17242l) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c6956l.admob(function2) ? 32 : 16;
        }
        if (c6956l.m2127for(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                interfaceC17242l = C4346l.f8873l;
            }
            Object objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                objM2132native = new C2768l(C1083l.f2995l);
                c6956l.m2147try(objM2132native);
            }
            loadAd((C2768l) objM2132native, interfaceC17242l, function2, c6956l, (i3 << 3) & 1008);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C13741l(interfaceC17242l, function2, i, i2);
        }
    }
}
