package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٍؑٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9256l {
    public static final /* synthetic */ int yandex = 0;

    static {
        List list = AbstractC15854l.yandex;
    }

    public static final void crashlytics(InterfaceC13349l interfaceC13349l, C9902l c9902l, C8896l c8896l, long j, float f, C4033l c4033l) {
        c9902l.admob();
        c9902l.billing(0.0f, 0.0f);
        float fMo868instanceof = interfaceC13349l.mo868instanceof(10.0f);
        float f2 = c4033l.f8313l;
        c9902l.purchase((fMo868instanceof * f2) / 2.0f, interfaceC13349l.mo868instanceof(5.0f) * f2);
        c9902l.purchase(interfaceC13349l.mo868instanceof(10.0f) * f2, 0.0f);
        float fMin = Math.min(c8896l.crashlytics - c8896l.yandex, c8896l.amazon - c8896l.loadAd) / 2.0f;
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (c8896l.billing() >> 32)) + fMin) - ((interfaceC13349l.mo868instanceof(10.0f) * f2) / 2.0f);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c8896l.billing() & 4294967295L)) - interfaceC13349l.mo868instanceof(2.5f);
        c9902l.smaato((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
        float fMo868instanceof2 = c4033l.f8314l - interfaceC13349l.mo868instanceof(2.5f);
        long jMo2070l = interfaceC13349l.mo2070l();
        C18449l c18449lMo2065break = interfaceC13349l.mo2065break();
        long jM4551private = c18449lMo2065break.m4551private();
        c18449lMo2065break.m4555synchronized().mopub();
        try {
            ((C16543l) c18449lMo2065break.f36010l).advert(fMo868instanceof2, jMo2070l);
            AbstractC9361l.remoteconfig(interfaceC13349l, c9902l, j, f, new C0404l(interfaceC13349l.mo868instanceof(2.5f), 0.0f, 0, 0, null, 30), 48);
        } finally {
            AbstractC0653l.license(c18449lMo2065break, jM4551private);
        }
    }

    public static final void loadAd(final boolean z, final Function0 function0, InterfaceC17242l interfaceC17242l, C7806l c7806l, InterfaceC13460l interfaceC13460l, Function3 function3, boolean z2, float f, final C15578l c15578l, C6956l c6956l, final int i, final int i2) {
        InterfaceC17242l interfaceC17242l2;
        int i3;
        final C7806l c7806l2;
        final InterfaceC13460l interfaceC13460l2;
        final Function3 function4;
        final boolean z3;
        final float f2;
        C7806l c7806l3;
        InterfaceC13460l interfaceC13460l3;
        Function3 function3Amazon;
        float f3;
        boolean z4;
        c6956l.m2133new(492221845);
        int i4 = 4;
        int i5 = i | (c6956l.mopub(z) ? 4 : 2) | (c6956l.admob(function0) ? 32 : 16);
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 = i5 | 384;
            interfaceC17242l2 = interfaceC17242l;
        } else {
            interfaceC17242l2 = interfaceC17242l;
            i3 = i5 | (c6956l.billing(interfaceC17242l2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        }
        int i7 = i3 | 14377984;
        if (c6956l.m2127for(i7 & 1, (38347923 & i7) != 38347922)) {
            c6956l.m2141switch();
            if ((i & 1) == 0 || c6956l.ad()) {
                if (i6 != 0) {
                    interfaceC17242l2 = C4346l.f8873l;
                }
                Object[] objArr = new Object[0];
                Object objM2132native = c6956l.m2132native();
                if (objM2132native == C1867l.yandex) {
                    objM2132native = new C3342l(18);
                    c6956l.m2147try(objM2132native);
                }
                c7806l3 = (C7806l) AbstractC0825l.smaato(objArr, C7806l.loadAd, (Function0) objM2132native, c6956l, 384);
                interfaceC13460l3 = C18450l.f36026l;
                function3Amazon = AbstractC14566l.amazon(419143791, new C8985l(c7806l3, z, i4), c6956l);
                f3 = C3856l.crashlytics;
                z4 = true;
            } else {
                c6956l.m2124else();
                c7806l3 = c7806l;
                interfaceC13460l3 = interfaceC13460l;
                function3Amazon = function3;
                z4 = z2;
                f3 = f;
            }
            c6956l.adcel();
            boolean z5 = z4;
            float f4 = f3;
            f2 = f4;
            InterfaceC17242l interfaceC17242lPremium = interfaceC17242l2.premium(new C9418l(z, function0, z5, c7806l3, f4));
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(interfaceC13460l3, false);
            long j = c6956l.f14595continue;
            int i8 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lPremium);
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
            AbstractC8182l.billing(c6956l, Integer.valueOf(i8), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            C16170l c16170l = C16170l.yandex;
            c15578l.invoke(c16170l, c6956l, 54);
            function3Amazon.invoke(c16170l, c6956l, 54);
            c6956l.startapp(true);
            z3 = z5;
            interfaceC13460l2 = interfaceC13460l3;
            function4 = function3Amazon;
            c7806l2 = c7806l3;
        } else {
            c6956l.m2124else();
            c7806l2 = c7806l;
            interfaceC13460l2 = interfaceC13460l;
            function4 = function3;
            z3 = z2;
            f2 = f;
        }
        final InterfaceC17242l interfaceC17242l3 = interfaceC17242l2;
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2(z, function0, interfaceC17242l3, c7806l2, interfaceC13460l2, function4, z3, f2, c15578l, i, i2) { // from class: lًۣۣ

                /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC17242l f17322l;

                /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
                public final /* synthetic */ boolean f17323l;

                /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
                public final /* synthetic */ float f17324l;

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ Function0 f17325l;

                /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
                public final /* synthetic */ boolean f17326l;

                /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
                public final /* synthetic */ int f17327l;

                /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC13460l f17328l;

                /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
                public final /* synthetic */ C7806l f17329l;

                /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
                public final /* synthetic */ C15578l f17330l;

                /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
                public final /* synthetic */ Function3 f17331l;

                {
                    this.f17327l = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iPurchase = AbstractC0545l.purchase(100663297);
                    AbstractC9256l.loadAd(this.f17326l, this.f17325l, this.f17322l, this.f17329l, this.f17328l, this.f17331l, this.f17323l, this.f17324l, this.f17330l, (C6956l) obj, iPurchase, this.f17327l);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void yandex(InterfaceC6477l interfaceC6477l, long j, C6956l c6956l, int i) {
        C6956l c6956l2;
        Object obj;
        c6956l.m2133new(-1353562852);
        int i2 = i | (c6956l.billing(interfaceC6477l) ? 4 : 2) | (c6956l.purchase(j) ? 32 : 16);
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
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
            Object objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == c13863l) {
                objM2132native2 = AbstractC8020l.mopub(new C10740l(22, interfaceC6477l));
                c6956l.m2147try(objM2132native2);
            }
            InterfaceC12244l interfaceC12244lLoadAd = AbstractC16245l.loadAd(((Number) ((InterfaceC12244l) objM2132native2).getValue()).floatValue(), C17423l.remoteconfig(c6956l, 4), null, null, c6956l, 0, 28);
            C6956l c6956l3 = c6956l;
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objM2132native3 = c6956l3.m2132native();
            if (z || objM2132native3 == c13863l) {
                objM2132native3 = new C16931l(1, interfaceC6477l);
                c6956l3.m2147try(objM2132native3);
            }
            InterfaceC17242l interfaceC17242lIsPro = AbstractC0080l.isPro(new C7186l((Function1) objM2132native3), 16.0f);
            boolean zBilling = (i3 == 4) | c6956l3.billing(interfaceC12244lLoadAd) | ((i2 & 112) == 32) | c6956l3.admob(c9902l);
            Object objM2132native4 = c6956l3.m2132native();
            if (zBilling || objM2132native4 == c13863l) {
                C1040l c1040l = new C1040l(interfaceC6477l, interfaceC12244lLoadAd, j, c9902l, 6);
                c6956l3.m2147try(c1040l);
                objM2132native4 = c1040l;
            }
            AbstractC12155l.yandex(interfaceC17242lIsPro, (Function1) objM2132native4, c6956l3, 0);
            c6956l2 = c6956l3;
        } else {
            C6956l c6956l4 = c6956l;
            c6956l4.m2124else();
            c6956l2 = c6956l4;
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C1714l(interfaceC6477l, j, i, 2);
        }
    }
}
