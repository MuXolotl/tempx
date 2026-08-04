package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٌٍؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8496l {
    static {
        new C3790l(7, 0, 121);
    }

    public static final void yandex(final C10178l c10178l, final InterfaceC17242l interfaceC17242l, boolean z, C11090l c11090l, AbstractC17824l abstractC17824l, final Function2 function2, final Function2 function3, final Function2 function4, final boolean z2, InterfaceC13142l interfaceC13142l, final int i, char c, final C3790l c3790l, final InterfaceC11381l interfaceC11381l, InterfaceC6347l interfaceC6347l, C1351l c1351l, InterfaceC11780l interfaceC11780l, C6956l c6956l, final int i2, final int i3, final int i4) {
        boolean z3;
        int i5;
        Function2 function5;
        InterfaceC13142l interfaceC13142l2;
        int i6;
        C6956l c6956l2;
        final C11090l c11090l2;
        final AbstractC17824l abstractC17824l2;
        final char c2;
        final InterfaceC6347l interfaceC6347l2;
        final InterfaceC11780l interfaceC11780l2;
        final C1351l c1351l2;
        final InterfaceC13142l interfaceC13142l3;
        C11090l c11090l3;
        final AbstractC17824l c15618l;
        final InterfaceC6347l interfaceC6347l3;
        final char c3;
        final InterfaceC13142l interfaceC13142l4;
        final InterfaceC11780l c17253l;
        c6956l.m2133new(-273370384);
        int i7 = i2 | (c6956l.billing(c10178l) ? 4 : 2) | (c6956l.billing(interfaceC17242l) ? 32 : 16);
        int i8 = i4 & 4;
        if (i8 != 0) {
            i5 = i7 | 384;
            z3 = z;
        } else {
            z3 = z;
            i5 = i7 | (c6956l.mopub(z3) ? 256 : 128);
        }
        int i9 = i5 | 12788736;
        if ((i2 & 100663296) == 0) {
            function5 = function3;
            i9 |= c6956l.admob(function5) ? 67108864 : 33554432;
        } else {
            function5 = function3;
        }
        int i10 = i9 | 805306368;
        int i11 = (c6956l.admob(function4) ? 32 : 16) | i3 | 6 | (c6956l.mopub(z2) ? 256 : 128);
        int i12 = i4 & 8192;
        if (i12 != 0) {
            i6 = i11 | 3072;
            interfaceC13142l2 = interfaceC13142l;
        } else {
            interfaceC13142l2 = interfaceC13142l;
            i6 = i11 | (c6956l.billing(interfaceC13142l2) ? 2048 : 1024);
        }
        int i13 = i6 | (c6956l.amazon(i) ? 16384 : 8192) | 196608;
        if ((i3 & 1572864) == 0) {
            i13 |= c6956l.billing(c3790l) ? 1048576 : 524288;
        }
        C1351l c1351lAdmob = c1351l;
        if (c6956l.m2127for(i10 & 1, ((i10 & 306783379) == 306783378 && (((i13 | (c6956l.billing(interfaceC11381l) ? 8388608 : 4194304)) | 369098752) & 306783379) == 306783378 && (((((i4 & 1048576) != 0 || !c6956l.billing(c1351lAdmob)) ? (char) 2 : (char) 4) | 400) & 147) == 146) ? false : true)) {
            c6956l.m2141switch();
            if ((i2 & 1) == 0 || c6956l.ad()) {
                if (i8 != 0) {
                    z3 = true;
                }
                c11090l3 = (C11090l) c6956l.isPro(AbstractC13010l.yandex);
                c15618l = new C15618l(0);
                if (i12 != 0) {
                    interfaceC13142l2 = null;
                }
                InterfaceC6347l interfaceC6347lLoadAd = AbstractC2610l.loadAd(c6956l, 5);
                if ((i4 & 1048576) != 0) {
                    c1351lAdmob = C11140l.admob(c6956l, 6);
                }
                interfaceC6347l3 = interfaceC6347lLoadAd;
                c3 = 8226;
                interfaceC13142l4 = interfaceC13142l2;
                c17253l = new C17253l(16.0f, 16.0f, 16.0f, 16.0f);
            } else {
                c6956l.m2124else();
                c11090l3 = c11090l;
                c15618l = abstractC17824l;
                c3 = c;
                interfaceC6347l3 = interfaceC6347l;
                interfaceC13142l4 = interfaceC13142l2;
                c17253l = interfaceC11780l;
            }
            final C1351l c1351l3 = c1351lAdmob;
            final boolean z4 = z3;
            c6956l.adcel();
            c6956l.m2123default(-717698741);
            Object objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                objM2132native = AbstractC14814l.isPro(c6956l);
            }
            final C2403l c2403l = (C2403l) objM2132native;
            c6956l.startapp(false);
            c6956l.m2123default(-715882774);
            long jCrashlytics = c11090l3.crashlytics();
            if (jCrashlytics == 16) {
                jCrashlytics = c1351l3.purchase(z4, z2, ((Boolean) AbstractC8317l.loadAd(c2403l, c6956l, 0).getValue()).booleanValue());
            }
            long j = jCrashlytics;
            c6956l.startapp(false);
            final C11090l c11090lPurchase = c11090l3.purchase(new C11090l(j, 0L, null, null, 0L, 0L, 0, 0, 0L, 16777214));
            final Function2 function6 = function5;
            c6956l2 = c6956l;
            AbstractC10478l.yandex(AbstractC4524l.yandex.yandex(c1351l3.firebase), AbstractC14566l.amazon(1147500080, new Function2() { // from class: lٟؗٗ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    C6956l c6956l3 = (C6956l) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (c6956l3.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                        InterfaceC17242l interfaceC17242l2 = interfaceC17242l;
                        AbstractC17824l abstractC17824l3 = c15618l;
                        InterfaceC17242l interfaceC17242lAdvert = AbstractC15042l.advert(interfaceC17242l2, false, abstractC17824l3, c6956l3);
                        String strCrashlytics = AbstractC7902l.crashlytics(c6956l3, R.string.default_error_message);
                        boolean z5 = z2;
                        InterfaceC17242l interfaceC17242lYandex = AbstractC0080l.yandex(AbstractC15042l.startapp(interfaceC17242lAdvert, z5, strCrashlytics), 280.0f, 56.0f);
                        C1351l c1351l4 = c1351l3;
                        C8990l c8990l = new C8990l(z5 ? c1351l4.isPro : c1351l4.subs);
                        C11485l c11485l = C11485l.f23084l;
                        boolean z6 = z4;
                        C2403l c2403l2 = c2403l;
                        C15578l c15578lAmazon = AbstractC14566l.amazon(-1406782897, new C0651l(z6, z5, c2403l2, c1351l4, interfaceC6347l3, 2), c6956l3);
                        C10178l c10178l2 = c10178l;
                        AbstractC5889l.yandex(c10178l2, interfaceC17242lYandex, z6, interfaceC13142l4, c11090lPurchase, c3790l, interfaceC11381l, c2403l2, c8990l, new C11013l(c10178l2, abstractC17824l3, c11485l, function2, function6, function4, z6, z5, c2403l2, c17253l, c1351l4, c15578lAmazon), i, c3, null, c6956l3, 0);
                    } else {
                        c6956l3.m2124else();
                    }
                    return Unit.INSTANCE;
                }
            }, c6956l2), c6956l2, 56);
            abstractC17824l2 = c15618l;
            c1351l2 = c1351l3;
            z3 = z4;
            interfaceC13142l3 = interfaceC13142l4;
            c2 = c3;
            interfaceC6347l2 = interfaceC6347l3;
            c11090l2 = c11090l3;
            interfaceC11780l2 = c17253l;
        } else {
            c6956l2 = c6956l;
            c6956l2.m2124else();
            c11090l2 = c11090l;
            abstractC17824l2 = abstractC17824l;
            c2 = c;
            interfaceC6347l2 = interfaceC6347l;
            interfaceC11780l2 = interfaceC11780l;
            c1351l2 = c1351lAdmob;
            interfaceC13142l3 = interfaceC13142l2;
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            final boolean z5 = z3;
            c4224lAds.amazon = new Function2() { // from class: lؙۥٚ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iPurchase = AbstractC0545l.purchase(i2 | 1);
                    int iPurchase2 = AbstractC0545l.purchase(i3);
                    AbstractC8496l.yandex(c10178l, interfaceC17242l, z5, c11090l2, abstractC17824l2, function2, function3, function4, z2, interfaceC13142l3, i, c2, c3790l, interfaceC11381l, interfaceC6347l2, c1351l2, interfaceC11780l2, (C6956l) obj, iPurchase, iPurchase2, i4);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
