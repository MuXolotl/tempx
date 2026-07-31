package defpackage;

import android.os.Build;
import java.math.BigInteger;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lُٜٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11173l {
    public static final C15578l yandex = new C15578l(-1097846179, false, new C8918l(11));
    public static final C15578l loadAd = new C15578l(-842556484, false, new C12851l(9));
    public static final C15578l crashlytics = new C15578l(1024767892, false, new C12851l(10));
    public static final C15578l amazon = new C15578l(1465358618, false, new C12851l(11));

    public static final boolean amazon(int i) {
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i == 1) {
            i2 = 23;
        } else if (i == 2) {
            i2 = 28;
        } else if (i == 3) {
            i2 = 26;
        } else if (i == 4) {
            i2 = 29;
        } else {
            if (i != 5) {
                throw null;
            }
            i2 = 30;
        }
        return i3 >= i2;
    }

    public static final C1343l billing(C2566l c2566l) {
        C1257l c1257l = c2566l.f5583l;
        if (c1257l != null) {
            return new C1343l(new C1257l(c1257l, false), c2566l.f5577l.length());
        }
        return null;
    }

    public static final boolean crashlytics() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static final List loadAd(C12814l c12814l, C17893l c17893l) {
        if (c17893l != null && c17893l.f34846l != 0) {
            return AbstractC16901l.m4213const(c17893l.admob());
        }
        if (c12814l != null) {
            long j = c12814l.yandex;
            if (!C12814l.amazon(j)) {
                return Collections.singletonList(new C15012l(new C14264l(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, C9867l.crashlytics, null, 61439), C12814l.mopub(j), C12814l.billing(j)));
            }
        }
        return C2580l.f5619l;
    }

    public static final C10178l mopub(String str, C6956l c6956l, int i) {
        if ((i & 1) != 0) {
            str = "";
        }
        int length = str.length();
        long jLoadAd = AbstractC2296l.loadAd(length, length);
        Object[] objArr = new Object[0];
        C15718l c15718l = C15718l.f30880l;
        boolean zBilling = c6956l.billing(str) | c6956l.purchase(jLoadAd);
        Object objM2132native = c6956l.m2132native();
        if (zBilling || objM2132native == C1867l.yandex) {
            objM2132native = new C8771l(str, jLoadAd, 2);
            c6956l.m2147try(objM2132native);
        }
        return (C10178l) AbstractC0825l.smaato(objArr, c15718l, (Function0) objM2132native, c6956l, 48);
    }

    public static int purchase(AbstractC11918l abstractC11918l) {
        BigInteger bigInteger = abstractC11918l.amazon;
        return bigInteger == null ? abstractC11918l.smaato() + 1 : bigInteger.bitLength();
    }

    public static final void yandex(int i, int i2, Function0 function0, Function1 function1, Function0 function2, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i3) {
        int i4;
        Function0 function3;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(243997362);
        if ((i3 & 6) == 0) {
            i4 = (c6956l2.amazon(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= c6956l2.amazon(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            function3 = function0;
            i4 |= c6956l2.admob(function3) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        } else {
            function3 = function0;
        }
        if ((i3 & 3072) == 0) {
            i4 |= c6956l2.admob(function1) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= c6956l2.admob(function2) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= c6956l2.billing(interfaceC17242l) ? 131072 : 65536;
        }
        if (c6956l2.m2127for(i4 & 1, (74899 & i4) != 74898)) {
            boolean z = (i4 & 14) == 4;
            Object objM2132native = c6956l2.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (z || objM2132native == c13863l) {
                objM2132native = new C13765l(i);
                c6956l2.m2147try(objM2132native);
            }
            C13765l c13765l = (C13765l) objM2132native;
            C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.yandex, C18450l.f36040l, c6956l2, 48);
            long j = c6956l2.f14595continue;
            int i5 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242l);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, c5062lYandex, C3438l.mopub);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l2, Integer.valueOf(i5), C3438l.isPro);
            AbstractC8182l.purchase(c6956l2, C3438l.firebase);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
            AbstractC7470l.billing(function3, null, false, null, null, null, AbstractC7076l.yandex, c6956l2, ((i4 >> 6) & 14) | 1572864, 62);
            float fAdmob = c13765l.admob();
            C12015l c12015l = new C12015l(0.0f, i2);
            int i6 = i2 - 1;
            C8540l c8540l = AbstractC12502l.yandex;
            long j2 = ((C9735l) c6956l2.isPro(c8540l)).yandex;
            long j3 = ((C9735l) c6956l2.isPro(c8540l)).yandex;
            long j4 = ((C18718l) c6956l2.isPro(AbstractC5992l.yandex)).crashlytics;
            long j5 = C9735l.isPro;
            C10164l c10164lCrashlytics = AbstractC1068l.crashlytics(j2, j3, j4, j5, j5, c6956l, 14155776, 818);
            C9247l c9247l = new C9247l(1.0f, true);
            boolean zBilling = c6956l.billing(c13765l);
            Object objM2132native2 = c6956l.m2132native();
            if (zBilling || objM2132native2 == c13863l) {
                objM2132native2 = new C15708l(c13765l, 5);
                c6956l.m2147try(objM2132native2);
            }
            Function1 function4 = (Function1) objM2132native2;
            boolean zBilling2 = ((i4 & 7168) == 2048) | c6956l.billing(c13765l);
            Object objM2132native3 = c6956l.m2132native();
            if (zBilling2 || objM2132native3 == c13863l) {
                objM2132native3 = new C9810l(function1, c13765l, 22);
                c6956l.m2147try(objM2132native3);
            }
            AbstractC11840l.loadAd(fAdmob, function4, c9247l, false, c12015l, i6, (Function0) objM2132native3, null, c10164lCrashlytics, c6956l, 0, 136);
            c6956l2 = c6956l;
            AbstractC7470l.billing(function2, null, false, null, null, null, AbstractC7076l.loadAd, c6956l2, ((i4 >> 12) & 14) | 1572864, 62);
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C7753l(i, i2, function0, function1, function2, interfaceC17242l, i3);
        }
    }
}
