package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؚؖؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7038l {
    public static final C7038l yandex = new C7038l();

    static {
        new C17253l(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public static C1351l loadAd(C6956l c6956l, int i) {
        long jPurchase = AbstractC15038l.purchase(c6956l, 18);
        long jPurchase2 = AbstractC15038l.purchase(c6956l, 18);
        long jLoadAd = C9735l.loadAd(0.38f, AbstractC15038l.purchase(c6956l, 18));
        long jPurchase3 = AbstractC15038l.purchase(c6956l, 26);
        C8620l c8620l = (C8620l) c6956l.isPro(AbstractC4524l.yandex);
        long jPurchase4 = AbstractC15038l.purchase(c6956l, 18);
        long jPurchase5 = AbstractC15038l.purchase(c6956l, 18);
        long jLoadAd2 = C9735l.loadAd(0.38f, AbstractC15038l.purchase(c6956l, 18));
        long jPurchase6 = AbstractC15038l.purchase(c6956l, 19);
        long jPurchase7 = AbstractC15038l.purchase(c6956l, 19);
        long jLoadAd3 = C9735l.loadAd(0.38f, AbstractC15038l.purchase(c6956l, 18));
        long jPurchase8 = AbstractC15038l.purchase(c6956l, 19);
        long jPurchase9 = AbstractC15038l.purchase(c6956l, 19);
        long jLoadAd4 = C9735l.loadAd(0.38f, AbstractC15038l.purchase(c6956l, 18));
        long jPurchase10 = AbstractC15038l.purchase(c6956l, 19);
        long jPurchase11 = AbstractC15038l.purchase(c6956l, 19);
        long jLoadAd5 = C9735l.loadAd(0.38f, AbstractC15038l.purchase(c6956l, 19));
        long jPurchase12 = AbstractC15038l.purchase(c6956l, 19);
        long jPurchase13 = AbstractC15038l.purchase(c6956l, 19);
        long jLoadAd6 = C9735l.loadAd(0.38f, AbstractC15038l.purchase(c6956l, 19));
        long j = C9735l.isPro;
        return C8565l.remoteconfig(jPurchase, jPurchase2, jLoadAd, j, j, j, jPurchase3, c8620l, jPurchase4, jPurchase5, jLoadAd2, jPurchase6, jPurchase7, jLoadAd3, jPurchase8, jPurchase9, jLoadAd4, jPurchase10, jPurchase11, jLoadAd5, jPurchase12, jPurchase13, jLoadAd6, c6956l, 1204058760, 2191);
    }

    public final void yandex(final Function1 function1, final Function1 function2, final Function1 function3, InterfaceC17242l interfaceC17242l, boolean z, C1351l c1351l, C6956l c6956l, final int i) {
        final InterfaceC17242l interfaceC17242l2;
        final boolean z2;
        final C1351l c1351l2;
        C1351l c1351lLoadAd;
        InterfaceC17242l interfaceC17242l3;
        c6956l.m2133new(748018311);
        int i2 = i | 920322048;
        int i3 = (c6956l.billing(this) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | 50;
        boolean z3 = true;
        if (c6956l.m2127for(i2 & 1, ((306783379 & i2) == 306783378 && (i3 & 147) == 146) ? false : true)) {
            c6956l.m2141switch();
            if ((i & 1) == 0 || c6956l.ad()) {
                c1351lLoadAd = loadAd(c6956l, (i3 << 3) & 7168);
                interfaceC17242l3 = C4346l.f8873l;
            } else {
                c6956l.m2124else();
                interfaceC17242l3 = interfaceC17242l;
                z3 = z;
                c1351lLoadAd = c1351l;
            }
            c6956l.adcel();
            c6956l.m2123default(1923805460);
            Object objM2132native = c6956l.m2132native();
            Object obj = C1867l.yandex;
            if (objM2132native == obj) {
                objM2132native = AbstractC14814l.isPro(c6956l);
            }
            C2403l c2403l = (C2403l) objM2132native;
            c6956l.startapp(false);
            boolean zBooleanValue = ((Boolean) AbstractC8317l.loadAd(c2403l, c6956l, 0).getValue()).booleanValue();
            Object objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == obj) {
                objM2132native2 = new C6523l();
                c6956l.m2147try(objM2132native2);
            }
            C6523l c6523l = (C6523l) objM2132native2;
            Object obj2 = (InterfaceC6497l) c6956l.isPro(AbstractC4751l.subs);
            String strCrashlytics = AbstractC7902l.crashlytics(c6956l, R.string.m3c_search_bar_search);
            String strCrashlytics2 = AbstractC7902l.crashlytics(c6956l, R.string.m3c_suggestions_available);
            AbstractC5189l abstractC5189l = AbstractC13010l.yandex;
            long jCrashlytics = ((C11090l) c6956l.isPro(abstractC5189l)).crashlytics();
            if (jCrashlytics == 16) {
                jCrashlytics = c1351lLoadAd.purchase(z3, false, zBooleanValue);
            }
            long j = jCrashlytics;
            InterfaceC17242l interfaceC17242l4 = interfaceC17242l3;
            InterfaceC17242l interfaceC17242lBilling = AbstractC9966l.billing(AbstractC0080l.remoteconfig(interfaceC17242l3, AbstractC14890l.loadAd, 56.0f, AbstractC14890l.crashlytics, 0.0f, 8), c6523l);
            Object objM2132native3 = c6956l.m2132native();
            if (objM2132native3 == obj) {
                objM2132native3 = new C0786l(8, function3);
                c6956l.m2147try(objM2132native3);
            }
            InterfaceC17242l interfaceC17242lVip = AbstractC8576l.vip(interfaceC17242lBilling, (Function1) objM2132native3);
            boolean zBilling = c6956l.billing(strCrashlytics) | c6956l.billing(strCrashlytics2);
            Object objM2132native4 = c6956l.m2132native();
            if (zBilling || objM2132native4 == obj) {
                objM2132native4 = new C6908l(strCrashlytics, strCrashlytics2);
                c6956l.m2147try(objM2132native4);
            }
            InterfaceC17242l interfaceC17242lYandex = AbstractC4962l.yandex(interfaceC17242lVip, false, (Function1) objM2132native4);
            C11090l c11090lPurchase = ((C11090l) c6956l.isPro(abstractC5189l)).purchase(new C11090l(j, 0L, null, null, 0L, 0L, 0, 0, 0L, 16777214));
            C8990l c8990l = new C8990l(c1351lLoadAd.subs);
            C3790l c3790l = new C3790l(0, 3, 119);
            Object objM2132native5 = c6956l.m2132native();
            if (objM2132native5 == obj) {
                objM2132native5 = new C0786l(9, function2);
                c6956l.m2147try(objM2132native5);
            }
            C1351l c1351l3 = c1351lLoadAd;
            boolean z4 = z3;
            AbstractC16363l.amazon("", function1, interfaceC17242lYandex, z4, c11090lPurchase, c3790l, new C6973l(null, (Function1) objM2132native5, 47), true, 0, 0, null, null, c2403l, c8990l, AbstractC14566l.amazon(-813926844, new C5742l(z3, c2403l, c1351lLoadAd, zBooleanValue), c6956l), c6956l, 102239286, 196608, 7696);
            Boolean bool = Boolean.FALSE;
            boolean zMopub = c6956l.mopub(zBooleanValue) | c6956l.admob(obj2);
            Object objM2132native6 = c6956l.m2132native();
            if (zMopub || objM2132native6 == obj) {
                objM2132native6 = new C10291l(zBooleanValue, obj2, (InterfaceC14029l) null, 6);
                c6956l.m2147try(objM2132native6);
            }
            AbstractC12311l.amazon(c6956l, bool, (Function2) objM2132native6);
            z2 = z4;
            c1351l2 = c1351l3;
            interfaceC17242l2 = interfaceC17242l4;
        } else {
            c6956l.m2124else();
            interfaceC17242l2 = interfaceC17242l;
            z2 = z;
            c1351l2 = c1351l;
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2(function1, function2, function3, interfaceC17242l2, z2, c1351l2, i) { // from class: lٌّۚ

                /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
                public final /* synthetic */ Function1 f25235l;

                /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
                public final /* synthetic */ C1351l f25236l;

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ Function1 f25237l;

                /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC17242l f25239l;

                /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
                public final /* synthetic */ Function1 f25240l;

                /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
                public final /* synthetic */ boolean f25241l;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iPurchase = AbstractC0545l.purchase(28087);
                    this.f25238l.yandex(this.f25237l, this.f25235l, this.f25240l, this.f25239l, this.f25241l, this.f25236l, (C6956l) obj3, iPurchase);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
