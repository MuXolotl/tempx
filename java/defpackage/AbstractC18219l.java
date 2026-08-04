package defpackage;

import java.nio.ByteBuffer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: l٘ۜٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC18219l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final C15578l f35663l = new C15578l(-936257117, false, new C13881l(11));

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C15578l f35662l = new C15578l(-437700315, false, new C13881l(12));

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C15578l f35659l = new C15578l(1693205673, false, new C1590l(17));

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C15578l f35665l = new C15578l(1942484074, false, new C1590l(18));

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C15578l f35664l = new C15578l(1713254055, false, new C1590l(19));

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C15578l f35666l = new C15578l(527729574, false, new C1590l(20));

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C15578l f35660l = new C15578l(1305086891, false, new C1590l(21));

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C15578l f35661l = new C15578l(902075527, false, new C13881l(13));

    public static final void adcel(String str, EnumC3830l enumC3830l, Function0 function0, InterfaceC17242l interfaceC17242l, long j, long j2, long j3, long j4, C6956l c6956l, int i) {
        long j5;
        long j6;
        long j7;
        long j8;
        int i2;
        long j9;
        long j10;
        long j11;
        c6956l.m2133new(-45557092);
        int i3 = i | (c6956l.billing(str) ? 4 : 2) | (c6956l.amazon(enumC3830l.ordinal()) ? 32 : 16) | (c6956l.admob(function0) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | 4792320;
        if (c6956l.m2127for(i3 & 1, (4793491 & i3) != 4793490)) {
            c6956l.m2141switch();
            if ((i & 1) == 0 || c6956l.ad()) {
                AbstractC5189l abstractC5189l = AbstractC16964l.yandex;
                long jLoadAd = C9735l.loadAd(0.12f, ((C14370l) c6956l.isPro(abstractC5189l)).yandex.adcel);
                long j12 = ((C14370l) c6956l.isPro(abstractC5189l)).yandex.yandex;
                long jLoadAd2 = C9735l.loadAd(0.38f, ((C14370l) c6956l.isPro(abstractC5189l)).yandex.adcel);
                j = jLoadAd;
                i2 = i3 & (-33546241);
                j9 = ((C14370l) c6956l.isPro(abstractC5189l)).yandex.loadAd;
                j10 = j12;
                j11 = jLoadAd2;
            } else {
                c6956l.m2124else();
                i2 = i3 & (-33546241);
                j10 = j2;
                j11 = j3;
                j9 = j4;
            }
            long j13 = j;
            c6956l.adcel();
            int iAdmob = AbstractC6363l.admob(0, 1, c6956l);
            EnumC3830l enumC3830l2 = EnumC3830l.f7943l;
            InterfaceC12244l interfaceC12244lYandex = AbstractC0703l.yandex(enumC3830l == enumC3830l2 ? j13 : j10, null, "", null, c6956l, 384, 10);
            InterfaceC12244l interfaceC12244lYandex2 = AbstractC0703l.yandex(enumC3830l == enumC3830l2 ? j11 : j9, null, "", null, c6956l, 384, 10);
            AbstractC5189l abstractC5189l2 = AbstractC16964l.yandex;
            InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0019l.crashlytics(interfaceC17242l, ((C14370l) c6956l.isPro(abstractC5189l2)).crashlytics.crashlytics);
            boolean zBilling = c6956l.billing(interfaceC12244lYandex);
            Object objM2132native = c6956l.m2132native();
            if (zBilling || objM2132native == C1867l.yandex) {
                objM2132native = new C2116l(interfaceC12244lYandex, 7);
                c6956l.m2147try(objM2132native);
            }
            InterfaceC17242l interfaceC17242lIsPro = AbstractC14289l.isPro(interfaceC17242lCrashlytics, (Function1) objM2132native);
            C17253l c17253l = C12719l.yandex;
            long j14 = C9735l.isPro;
            C13412l c13412lYandex = C12719l.yandex(j14, 0L, j14, 0L, c6956l, 10);
            AbstractC17457l.loadAd(function0, interfaceC17242lIsPro, enumC3830l == EnumC3830l.f7942l, ((C14370l) c6956l.isPro(abstractC5189l2)).crashlytics.crashlytics, c13412lYandex, null, null, new C17253l(16.0f, 16.0f, 16.0f, 16.0f), AbstractC14566l.amazon(-523548500, new C5173l(str, enumC3830l, iAdmob, interfaceC12244lYandex2, 3), c6956l), c6956l, ((i2 >> 6) & 14) | 817889280, 352);
            j5 = j13;
            j6 = j10;
            j7 = j11;
            j8 = j9;
        } else {
            c6956l.m2124else();
            j5 = j;
            j6 = j2;
            j7 = j3;
            j8 = j4;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C15162l(str, enumC3830l, function0, interfaceC17242l, j5, j6, j7, j8, i);
        }
    }

    public static final void ads(int i, C6956l c6956l, boolean z) {
        c6956l.m2133new(-1694957548);
        int i2 = (c6956l.mopub(z) ? 4 : 2) | i;
        C15578l c15578l = AbstractC17824l.isPro;
        int i3 = i2 | (c6956l.admob(c15578l) ? 32 : 16);
        if (c6956l.m2127for(i3 & 1, (i3 & 19) != 18)) {
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lLoadAd = AbstractC8532l.loadAd(c4346l, null, 3);
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
            long j = c6956l.f14595continue;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lLoadAd);
            InterfaceC8801l.firebase.getClass();
            Function0 function0 = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(function0);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i4), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            if (z) {
                c6956l.m2123default(2024016229);
                AbstractC16888l.yandex(c4346l, ((C9735l) c6956l.isPro(AbstractC12502l.yandex)).yandex, 2.0f, 24.0f, c6956l, 3462, 0);
                c6956l.startapp(false);
            } else {
                c6956l.m2123default(2024241351);
                AbstractC2812l.pro((i3 >> 3) & 14, c15578l, c6956l, false);
            }
            c6956l.startapp(true);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4584l(i, 9, z);
        }
    }

    public static final void subscription(Function0 function0, boolean z, InterfaceC17242l interfaceC17242l, InterfaceC6347l interfaceC6347l, boolean z2, C6956l c6956l, int i) {
        InterfaceC17242l interfaceC17242l2;
        InterfaceC6347l interfaceC6347l2;
        int i2;
        InterfaceC6347l interfaceC6347l3;
        c6956l.m2133new(849069330);
        int i3 = 2;
        int i4 = i | (c6956l.admob(function0) ? 4 : 2) | (c6956l.mopub(z) ? 32 : 16) | 1408 | (c6956l.mopub(z2) ? 16384 : 8192);
        if (c6956l.m2127for(i4 & 1, (74899 & i4) != 74898)) {
            c6956l.m2141switch();
            if ((i & 1) == 0 || c6956l.ad()) {
                i2 = i4 & (-7169);
                interfaceC6347l3 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.purchase;
                interfaceC17242l = C4346l.f8873l;
            } else {
                c6956l.m2124else();
                i2 = i4 & (-7169);
                interfaceC6347l3 = interfaceC6347l;
            }
            c6956l.adcel();
            boolean z3 = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object objM2132native = c6956l.m2132native();
            if (z3 || objM2132native == C1867l.yandex) {
                objM2132native = new C5023l(z, function0, 3);
                c6956l.m2147try(objM2132native);
            }
            InterfaceC17242l interfaceC17242l3 = interfaceC17242l;
            AbstractC17457l.mopub((Function0) objM2132native, interfaceC17242l3, z2, interfaceC6347l3, null, null, AbstractC14566l.amazon(-495626865, new C0849l(z, i3), c6956l), c6956l, 805306416 | ((i2 >> 6) & 896), 496);
            interfaceC17242l2 = interfaceC17242l3;
            interfaceC6347l2 = interfaceC6347l3;
        } else {
            c6956l.m2124else();
            interfaceC17242l2 = interfaceC17242l;
            interfaceC6347l2 = interfaceC6347l;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C5322l(function0, z, interfaceC17242l2, interfaceC6347l2, z2, i);
        }
    }

    public static double tapsense(C14997l c14997l, double[] dArr, double[] dArr2) {
        double d;
        int iMin = Math.min(dArr.length - 1, dArr2.length);
        double d2 = c14997l.loadAd;
        int i = 0;
        while (true) {
            if (i >= iMin) {
                d = d2;
                break;
            }
            if (d2 >= dArr[i] && d2 < dArr[i + 1]) {
                d = dArr2[i] % 360.0d;
                if (d >= 0.0d) {
                    break;
                }
                d += 360.0d;
                break;
            }
            i++;
        }
        if (Math.min(dArr.length - 1, dArr2.length) <= 0) {
            d = 0.0d;
        }
        double d3 = (d2 + d) % 360.0d;
        return d3 < 0.0d ? d3 + 360.0d : d3;
    }

    public abstract int getSize();

    public abstract void read(ByteBuffer byteBuffer);
}
