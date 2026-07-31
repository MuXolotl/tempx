package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؚّؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7209l {
    public static final C15578l yandex = new C15578l(1918588340, false, new C1590l(15));

    public static final C3624l admob(C3624l c3624l) {
        C2312l c2312l = C18098l.yandex;
        return new C3624l(C18098l.yandex, C3498l.purchase("U".concat(c3624l.billing().crashlytics())));
    }

    public static final C3624l amazon(String str) {
        C2312l c2312l = C18098l.yandex;
        return new C3624l(C18098l.crashlytics, C3498l.purchase(str));
    }

    public static final C3624l billing(C3498l c3498l) {
        C2312l c2312l = C18098l.yandex;
        C3624l c3624l = C18098l.subs;
        return new C3624l(c3624l.yandex, C3498l.purchase(c3498l.crashlytics().concat(c3624l.billing().crashlytics())));
    }

    public static final C3624l crashlytics(String str) {
        C2312l c2312l = C18098l.yandex;
        return new C3624l(C18098l.yandex, C3498l.purchase(str));
    }

    public static boolean firebase(InterfaceC14555l interfaceC14555l, InterfaceC13789l interfaceC13789l, InterfaceC13789l interfaceC13789l2) {
        if (interfaceC13789l == interfaceC13789l2) {
            return true;
        }
        InterfaceC0583l interfaceC0583lMo1163const = interfaceC14555l.mo1163const(interfaceC13789l);
        InterfaceC0583l interfaceC0583lMo1163const2 = interfaceC14555l.mo1163const(interfaceC13789l2);
        if (interfaceC0583lMo1163const != null && interfaceC0583lMo1163const2 != null) {
            return isPro(interfaceC14555l, interfaceC0583lMo1163const, interfaceC0583lMo1163const2);
        }
        InterfaceC5272l interfaceC5272lMo1166finally = interfaceC14555l.mo1166finally(interfaceC13789l);
        InterfaceC5272l interfaceC5272lMo1166finally2 = interfaceC14555l.mo1166finally(interfaceC13789l2);
        return interfaceC5272lMo1166finally != null && interfaceC5272lMo1166finally2 != null && isPro(interfaceC14555l, interfaceC14555l.smaato(interfaceC5272lMo1166finally), interfaceC14555l.smaato(interfaceC5272lMo1166finally2)) && isPro(interfaceC14555l, interfaceC14555l.firebase(interfaceC5272lMo1166finally), interfaceC14555l.firebase(interfaceC5272lMo1166finally2));
    }

    public static boolean isPro(InterfaceC14555l interfaceC14555l, InterfaceC0583l interfaceC0583l, InterfaceC0583l interfaceC0583l2) {
        if (interfaceC14555l.mopub(interfaceC0583l) == interfaceC14555l.mopub(interfaceC0583l2) && interfaceC14555l.mo1173l(interfaceC0583l) == interfaceC14555l.mo1173l(interfaceC0583l2) && interfaceC14555l.mo1210private(interfaceC0583l) == interfaceC14555l.mo1210private(interfaceC0583l2) && interfaceC14555l.mo1169import(interfaceC14555l.mo1209package(interfaceC0583l), interfaceC14555l.mo1209package(interfaceC0583l2))) {
            if (interfaceC14555l.mo1168goto(interfaceC0583l, interfaceC0583l2)) {
                return true;
            }
            int iMopub = interfaceC14555l.mopub(interfaceC0583l);
            for (int i = 0; i < iMopub; i++) {
                InterfaceC0218l interfaceC0218lMo1199l = interfaceC14555l.mo1199l(interfaceC0583l, i);
                InterfaceC0218l interfaceC0218lMo1199l2 = interfaceC14555l.mo1199l(interfaceC0583l2, i);
                if (interfaceC14555l.vip(interfaceC0218lMo1199l) == interfaceC14555l.vip(interfaceC0218lMo1199l2) && (interfaceC14555l.vip(interfaceC0218lMo1199l) || (interfaceC14555l.startapp(interfaceC0218lMo1199l) == interfaceC14555l.startapp(interfaceC0218lMo1199l2) && firebase(interfaceC14555l, interfaceC14555l.ads(interfaceC0218lMo1199l), interfaceC14555l.ads(interfaceC0218lMo1199l2))))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final C3624l loadAd(String str) {
        C2312l c2312l = C18098l.yandex;
        return new C3624l(C18098l.purchase, C3498l.purchase(str));
    }

    public static final C3624l mopub(String str) {
        C2312l c2312l = C18098l.yandex;
        return new C3624l(C18098l.loadAd, C3498l.purchase(str));
    }

    public static final void purchase(LinkedHashMap linkedHashMap) {
        Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
        int iFirebase = AbstractC2200l.firebase(AbstractC14055l.billing(setEntrySet, 10));
        if (iFirebase < 16) {
            iFirebase = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iFirebase);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap2.put(entry.getValue(), entry.getKey());
        }
    }

    public static C3417l subs(C3417l c3417l, EnumC9931l enumC9931l, C11090l c11090l, InterfaceC13490l interfaceC13490l, InterfaceC16061l interfaceC16061l) {
        if (c3417l != null && enumC9931l == c3417l.yandex && AbstractC7709l.crashlytics(c11090l, enumC9931l).equals(c3417l.loadAd) && interfaceC13490l.loadAd() == c3417l.crashlytics.f29893l && interfaceC16061l == c3417l.amazon) {
            return c3417l;
        }
        C3417l c3417l2 = C3417l.admob;
        if (c3417l2 != null && enumC9931l == c3417l2.yandex && AbstractC7709l.crashlytics(c11090l, enumC9931l).equals(c3417l2.loadAd) && interfaceC13490l.loadAd() == c3417l2.crashlytics.f29893l && interfaceC16061l == c3417l2.amazon) {
            return c3417l2;
        }
        C3417l c3417l3 = new C3417l(enumC9931l, AbstractC7709l.crashlytics(c11090l, enumC9931l), new C15294l(interfaceC13490l.loadAd(), interfaceC13490l.mo873super()), interfaceC16061l);
        C3417l.admob = c3417l3;
        return c3417l3;
    }

    public static final void yandex(InterfaceC17242l interfaceC17242l, boolean z, long j, C6956l c6956l, final int i, final int i2) {
        final InterfaceC17242l interfaceC17242l2;
        int i3;
        long j2;
        final boolean z2;
        final long j3;
        boolean z3;
        c6956l.m2133new(-86674598);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            interfaceC17242l2 = interfaceC17242l;
        } else if ((i & 6) == 0) {
            interfaceC17242l2 = interfaceC17242l;
            i3 = (c6956l.billing(interfaceC17242l2) ? 4 : 2) | i;
        } else {
            interfaceC17242l2 = interfaceC17242l;
            i3 = i;
        }
        if ((i & 384) == 0) {
            j2 = j;
            i3 |= ((i2 & 4) == 0 && c6956l.purchase(j2)) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        } else {
            j2 = j;
        }
        if (c6956l.m2127for(i3 & 1, (i3 & 131) != 130)) {
            c6956l.m2141switch();
            int i5 = i & 1;
            C4346l c4346l = C4346l.f8873l;
            if (i5 == 0 || c6956l.ad()) {
                if (i4 != 0) {
                    interfaceC17242l2 = c4346l;
                }
                boolean z4 = (i2 & 2) != 0 ? false : z;
                if ((i2 & 4) != 0) {
                    j2 = ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.yandex;
                    i3 &= -897;
                }
                z3 = z4;
            } else {
                c6956l.m2124else();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                z3 = z;
            }
            InterfaceC17242l interfaceC17242l3 = interfaceC17242l2;
            int i6 = i3;
            long j4 = j2;
            c6956l.adcel();
            InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0080l.crashlytics(interfaceC17242l3, 1.0f);
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
            long j5 = c6956l.f14595continue;
            int i7 = (int) (j5 ^ (j5 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lCrashlytics);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i7), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            AbstractC8960l.loadAd(C16170l.yandex.yandex(c4346l, C18450l.f36043l), j4, null, c6956l, (i6 >> 3) & 112, 4);
            c6956l.startapp(true);
            j3 = j4;
            interfaceC17242l2 = interfaceC17242l3;
            z2 = z3;
        } else {
            c6956l.m2124else();
            z2 = z;
            j3 = j2;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lًۧۚ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC7209l.yandex(interfaceC17242l2, z2, j3, (C6956l) obj, AbstractC0545l.purchase(i | 1), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
