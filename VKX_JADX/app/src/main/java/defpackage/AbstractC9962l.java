package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٍۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9962l {
    public static final C6839l yandex = AbstractC7497l.yandex;
    public static final float loadAd = 7.5f;
    public static final float crashlytics = 2.5f;
    public static final float amazon = 10.0f;
    public static final float purchase = 5.0f;
    public static final float billing = 6.0f;
    public static final C4776l mopub = AbstractC0532l.subs(300, 2, AbstractC5341l.amazon);

    public static final void crashlytics(InterfaceC13349l interfaceC13349l, C9902l c9902l, C8896l c8896l, long j, float f, C4033l c4033l) {
        c9902l.admob();
        c9902l.billing(0.0f, 0.0f);
        float f2 = amazon;
        float fMo868instanceof = interfaceC13349l.mo868instanceof(f2);
        float f3 = c4033l.f8313l;
        c9902l.purchase(fMo868instanceof * f3, 0.0f);
        c9902l.purchase((interfaceC13349l.mo868instanceof(f2) * f3) / 2.0f, interfaceC13349l.mo868instanceof(purchase) * f3);
        float fMin = Math.min(c8896l.crashlytics - c8896l.yandex, c8896l.amazon - c8896l.loadAd) / 2.0f;
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (c8896l.billing() >> 32)) + fMin) - ((interfaceC13349l.mo868instanceof(f2) * f3) / 2.0f);
        float fMo868instanceof2 = (interfaceC13349l.mo868instanceof(crashlytics) / 2.0f) + Float.intBitsToFloat((int) (c8896l.billing() & 4294967295L));
        c9902l.smaato((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fMo868instanceof2)) & 4294967295L));
        c9902l.loadAd();
        float f4 = c4033l.f8314l;
        long jMo2070l = interfaceC13349l.mo2070l();
        C18449l c18449lMo2065break = interfaceC13349l.mo2065break();
        long jM4551private = c18449lMo2065break.m4551private();
        c18449lMo2065break.m4555synchronized().mopub();
        try {
            ((C16543l) c18449lMo2065break.f36010l).advert(f4, jMo2070l);
            AbstractC9361l.remoteconfig(interfaceC13349l, c9902l, j, f, null, 56);
        } finally {
            AbstractC0653l.license(c18449lMo2065break, jM4551private);
        }
    }

    public static final void loadAd(final boolean z, final C7473l c7473l, final InterfaceC17242l interfaceC17242l, long j, long j2, C6956l c6956l, final int i) {
        final long j3;
        final long j4;
        int i2;
        long j5;
        long jYandex;
        long jFirebase;
        C9735l c9735l;
        c6956l.m2133new(308716636);
        int i3 = i | (c6956l.mopub(z) ? 4 : 2) | (c6956l.admob(c7473l) ? 32 : 16) | (c6956l.billing(interfaceC17242l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | 205824;
        if (c6956l.m2127for(i3 & 1, (74899 & i3) != 74898)) {
            c6956l.m2141switch();
            if ((i & 1) == 0 || c6956l.ad()) {
                long j6 = ((C9735l) ((C10236l) c6956l.isPro(AbstractC17200l.yandex)).billing.getValue()).yandex;
                i2 = i3 & (-64513);
                j5 = j6;
                jYandex = AbstractC17200l.yandex(j6, c6956l);
            } else {
                c6956l.m2124else();
                i2 = i3 & (-64513);
                j5 = j;
                jYandex = j2;
            }
            c6956l.adcel();
            int i4 = i2 & 14;
            boolean zBilling = (i4 == 4) | c6956l.billing(c7473l);
            Object objM2132native = c6956l.m2132native();
            if (zBilling || objM2132native == C1867l.yandex) {
                objM2132native = AbstractC8020l.mopub(new C10041l(z, c7473l, 3));
                c6956l.m2147try(objM2132native);
            }
            InterfaceC12244l interfaceC12244l = (InterfaceC12244l) objM2132native;
            C3118l c3118l = (C3118l) c6956l.isPro(AbstractC15020l.yandex);
            float f = billing;
            if (c3118l == null) {
                c6956l.m2123default(1453038224);
                c6956l.startapp(false);
                c9735l = null;
            } else {
                c6956l.m2123default(323966865);
                c6956l.m2123default(-1687113661);
                C10236l c10236l = (C10236l) c6956l.isPro(AbstractC17200l.yandex);
                if (C14467l.yandex(f, 0.0f) <= 0 || c10236l.yandex()) {
                    c6956l.m2123default(-1095489470);
                    c6956l.startapp(false);
                    jFirebase = j5;
                } else {
                    c6956l.m2123default(-1095627978);
                    jFirebase = AbstractC12953l.firebase(C9735l.loadAd(((((float) Math.log(1.0f + f)) * 4.5f) + 2.0f) / 100.0f, AbstractC17200l.yandex(j5, c6956l)), j5);
                    c6956l.startapp(false);
                }
                c6956l.startapp(false);
                c6956l.startapp(false);
                c9735l = new C9735l(jFirebase);
            }
            long j7 = c9735l != null ? c9735l.yandex : j5;
            InterfaceC17242l interfaceC17242lLoadAd = AbstractC7477l.loadAd(AbstractC14289l.smaato(AbstractC0080l.isPro(interfaceC17242l, 40.0f), new C9673l(16)), new C16931l(0, c7473l));
            if (!((Boolean) interfaceC12244l.getValue()).booleanValue()) {
                f = 0.0f;
            }
            C6839l c6839l = yandex;
            InterfaceC17242l interfaceC17242lAmazon = AbstractC4927l.amazon(AbstractC6660l.subs(interfaceC17242lLoadAd, f, c6839l, true, 24), j7, c6839l);
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
            int iLoadAd = AbstractC8238l.loadAd(c6956l);
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lAmazon);
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
            C6415l c6415l = C3438l.isPro;
            if (c6956l.f14603switch || !AbstractC8576l.yandex(c6956l.m2132native(), Integer.valueOf(iLoadAd))) {
                c6956l.m2147try(Integer.valueOf(iLoadAd));
                c6956l.loadAd(Integer.valueOf(iLoadAd), c6415l);
            }
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            AbstractC18037l.crashlytics(Boolean.valueOf(z), null, AbstractC0532l.subs(100, 6, null), null, AbstractC14566l.amazon(1853731063, new C5853l(jYandex, c7473l, 1), c6956l), c6956l, i4 | 24960, 10);
            c6956l.startapp(true);
            j3 = j5;
            j4 = jYandex;
        } else {
            c6956l.m2124else();
            j3 = j;
            j4 = j2;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2(z, c7473l, interfaceC17242l, j3, j4, i) { // from class: lًؙْ

                /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC17242l f13445l;

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ C7473l f13446l;

                /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
                public final /* synthetic */ boolean f13447l;

                /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
                public final /* synthetic */ long f13448l;

                /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
                public final /* synthetic */ long f13449l;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iPurchase = AbstractC0545l.purchase(65);
                    AbstractC9962l.loadAd(this.f13447l, this.f13446l, this.f13445l, this.f13449l, this.f13448l, (C6956l) obj, iPurchase);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void yandex(C7473l c7473l, long j, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        InterfaceC17242l interfaceC17242l2;
        C6956l c6956l2;
        Object obj;
        c6956l.m2133new(-486016981);
        int i2 = i | (c6956l.admob(c7473l) ? 4 : 2) | (c6956l.purchase(j) ? 32 : 16);
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                obj = objM2132native;
                C9902l c9902lYandex = AbstractC3478l.yandex();
                c9902lYandex.isPro(1);
                c6956l.m2147try(c9902lYandex);
                obj = c9902lYandex;
            }
            obj = objM2132native;
            C9902l c9902l = (C9902l) obj;
            boolean zBilling = c6956l.billing(c7473l);
            Object objM2132native2 = c6956l.m2132native();
            if (zBilling || objM2132native2 == c13863l) {
                objM2132native2 = AbstractC8020l.mopub(new C6387l(c7473l, 0));
                c6956l.m2147try(objM2132native2);
            }
            InterfaceC12244l interfaceC12244lLoadAd = AbstractC16245l.loadAd(((Number) ((InterfaceC12244l) objM2132native2).getValue()).floatValue(), mopub, null, null, c6956l, 48, 28);
            C6956l c6956l3 = c6956l;
            Object objM2132native3 = c6956l3.m2132native();
            if (objM2132native3 == c13863l) {
                objM2132native3 = new C9673l(15);
                c6956l3.m2147try(objM2132native3);
            }
            interfaceC17242l2 = interfaceC17242l;
            InterfaceC17242l interfaceC17242lYandex = AbstractC4962l.yandex(interfaceC17242l2, false, (Function1) objM2132native3);
            boolean zAdmob = c6956l3.admob(c7473l) | c6956l3.billing(interfaceC12244lLoadAd) | ((i2 & 112) == 32) | c6956l3.admob(c9902l);
            Object objM2132native4 = c6956l3.m2132native();
            if (zAdmob || objM2132native4 == c13863l) {
                C1040l c1040l = new C1040l(c7473l, interfaceC12244lLoadAd, j, c9902l, 5);
                c6956l3.m2147try(c1040l);
                objM2132native4 = c1040l;
            }
            AbstractC12155l.yandex(interfaceC17242lYandex, (Function1) objM2132native4, c6956l3, 0);
            c6956l2 = c6956l3;
        } else {
            interfaceC17242l2 = interfaceC17242l;
            C6956l c6956l4 = c6956l;
            c6956l4.m2124else();
            c6956l2 = c6956l4;
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C2050l(c7473l, j, interfaceC17242l2, i, 2);
        }
    }
}
