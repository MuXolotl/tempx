package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٌَؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0956l implements InterfaceC17842l, InterfaceC5289l {
    public final C11919l amazon = new C11919l(C11507l.f23131l);
    public final C7424l crashlytics;
    public final C0783l loadAd;
    public final /* synthetic */ InterfaceC17842l yandex;

    public C0956l(C0783l c0783l, C7424l c7424l, InterfaceC17842l interfaceC17842l) {
        this.yandex = interfaceC17842l;
        this.loadAd = c0783l;
        this.crashlytics = c7424l;
        InterfaceC12356l interfaceC12356lLoadAd = interfaceC17842l.loadAd();
        interfaceC12356lLoadAd.mopub(new C17326l(interfaceC12356lLoadAd, this, 1));
    }

    public final void admob(String str, String str2, Function0 function0, Function0 function1, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        c6956l.m2133new(443213280);
        int i2 = i | (c6956l.billing(str) ? 4 : 2) | (c6956l.billing(str2) ? 32 : 16) | (c6956l.admob(function0) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c6956l.admob(function1) ? 2048 : 1024) | (c6956l.billing(interfaceC17242l) ? 16384 : 8192) | (c6956l.admob(this) ? 131072 : 65536);
        if (c6956l.m2127for(i2 & 1, (74899 & i2) != 74898)) {
            Object objM2132native = c6956l.m2132native();
            Object obj = C1867l.yandex;
            if (objM2132native == obj) {
                objM2132native = AbstractC14814l.isPro(c6956l);
            }
            C2403l c2403l = (C2403l) objM2132native;
            InterfaceC8714l interfaceC8714lLoadAd = AbstractC8317l.loadAd(c2403l, c6956l, 6);
            Boolean bool = (Boolean) interfaceC8714lLoadAd.getValue();
            bool.getClass();
            boolean zBilling = c6956l.billing(interfaceC8714lLoadAd) | ((i2 & 7168) == 2048);
            Object objM2132native2 = c6956l.m2132native();
            if (zBilling || objM2132native2 == obj) {
                objM2132native2 = new C7864l(function1, interfaceC8714lLoadAd, (InterfaceC14029l) null, 15);
                c6956l.m2147try(objM2132native2);
            }
            AbstractC12311l.amazon(c6956l, bool, (Function2) objM2132native2);
            long j = C9735l.isPro;
            AbstractC16291l.loadAd(function0, interfaceC17242l, false, null, AbstractC7439l.crashlytics(j, j, c6956l, 390, 250), null, null, null, c2403l, AbstractC14566l.amazon(1239984481, new C11223l(this, str, str2, interfaceC8714lLoadAd, 20), c6956l), c6956l, ((i2 >> 6) & 14) | ((i2 >> 9) & 112), 54, 956);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C8088l(this, str, str2, function0, function1, interfaceC17242l, i);
        }
    }

    @Override // defpackage.InterfaceC17842l
    public final C10023l amazon() {
        return this.yandex.amazon();
    }

    @Override // defpackage.InterfaceC17842l
    public final C4917l billing() {
        return this.yandex.billing();
    }

    @Override // defpackage.InterfaceC17842l
    public final C6921l crashlytics() {
        return this.yandex.crashlytics();
    }

    @Override // defpackage.InterfaceC17842l
    public final InterfaceC12356l loadAd() {
        return this.yandex.loadAd();
    }

    public final void mopub(String str, boolean z, C6956l c6956l, int i) {
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(-2012954530);
        int i2 = (c6956l2.billing(str) ? 4 : 2) | i | (c6956l2.mopub(z) ? 32 : 16);
        if (c6956l2.m2127for(i2 & 1, (i2 & 19) != 18)) {
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lIsPro = AbstractC0080l.isPro(c4346l, 124.0f);
            C6839l c6839l = AbstractC7497l.yandex;
            InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0019l.crashlytics(interfaceC17242lIsPro, c6839l);
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
            long j = c6956l2.f14595continue;
            int i3 = (int) ((j >>> 32) ^ j);
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lCrashlytics);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon, C3438l.mopub);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l2, Integer.valueOf(i3), C3438l.isPro);
            AbstractC8182l.purchase(c6956l2, C3438l.firebase);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
            AbstractC3308l.amazon(z, null, AbstractC4523l.purchase(null, 3), AbstractC4523l.billing(null, 3), null, AbstractC17551l.loadAd, c6956l, ((i2 >> 3) & 14) | 200064, 18);
            c6956l2 = c6956l;
            C10707l c10707l = AbstractC10689l.yandex;
            AbstractC7741l.purchase(str, null, C16170l.yandex.yandex(AbstractC0019l.crashlytics(AbstractC0080l.isPro(c4346l, 120.0f), c6839l), C18450l.f36043l), new C18627l(((C10936l) c6956l2.isPro(c10707l)).yandex()), new C18627l(((C10936l) c6956l2.isPro(c10707l)).yandex()), null, c6956l2, (i2 & 14) | 36912, 0, 32736);
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C16693l(this, str, z, i);
        }
    }

    @Override // defpackage.InterfaceC17842l
    public final InterfaceC9573l purchase() {
        return this.yandex.purchase();
    }

    @Override // defpackage.InterfaceC5289l
    public final void yandex(InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        C0956l c0956l = this;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(204348019);
        int i2 = i | (c6956l2.admob(c0956l) ? 32 : 16);
        int i3 = 0;
        if (c6956l2.m2127for(i2 & 1, (i2 & 19) != 18)) {
            InterfaceC8714l interfaceC8714lPurchase = AbstractC9637l.purchase(c0956l.amazon, c6956l2, 0);
            boolean zBilling = c6956l2.billing(interfaceC8714lPurchase);
            Object objM2132native = c6956l2.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (zBilling || objM2132native == c13863l) {
                objM2132native = new C18355l(interfaceC8714lPurchase, 3);
                c6956l2.m2147try(objM2132native);
            }
            C2887l c2887lLoadAd = AbstractC10521l.loadAd(0, (Function0) objM2132native, c6956l2, 0, 3);
            Object objM2132native2 = c6956l2.m2132native();
            if (objM2132native2 == c13863l) {
                objM2132native2 = new C6523l();
                c6956l2.m2147try(objM2132native2);
            }
            C6523l c6523l = (C6523l) objM2132native2;
            Object objM2132native3 = c6956l2.m2132native();
            if (objM2132native3 == c13863l) {
                objM2132native3 = new C15308l(0);
                c6956l2.m2147try(objM2132native3);
            }
            C15308l c15308l = (C15308l) objM2132native3;
            Unit unit = Unit.INSTANCE;
            Object objM2132native4 = c6956l2.m2132native();
            InterfaceC14029l interfaceC14029l = null;
            if (objM2132native4 == c13863l) {
                objM2132native4 = new C0915l(c6523l, interfaceC14029l, i3);
                c6956l2.m2147try(objM2132native4);
            }
            AbstractC12311l.amazon(c6956l2, unit, (Function2) objM2132native4);
            Integer numValueOf = Integer.valueOf(c15308l.admob());
            boolean zBilling2 = c6956l2.billing(c2887lLoadAd);
            Object objM2132native5 = c6956l2.m2132native();
            if (zBilling2 || objM2132native5 == c13863l) {
                objM2132native5 = new C7226l(c2887lLoadAd, c15308l, interfaceC14029l, 21);
                c6956l2.m2147try(objM2132native5);
            }
            AbstractC12311l.amazon(c6956l2, numValueOf, (Function2) objM2132native5);
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36043l, false);
            long j = c6956l2.f14595continue;
            int i4 = (int) (j ^ (j >>> 32));
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
            C6415l c6415l = C3438l.mopub;
            AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf2 = Integer.valueOf(i4);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l2, numValueOf2, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l2, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, c6415l4);
            C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(24.0f, true, new C8339l(12)), C18450l.f36034l, c6956l2, 54);
            long j2 = c6956l2.f14595continue;
            int i5 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, c4346l);
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, c1853lYandex, c6415l);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i5, c6956l2, c6415l3, c6956l2, c11192l);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling2, c6415l4);
            AbstractC11282l.loadAd(AbstractC11999l.purchase(c6956l2, R.string.tv_choose_acc), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, ((C9472l) c6956l2.isPro(AbstractC3459l.yandex)).purchase, c6956l, 0, 0, 65534);
            AbstractC11308l.yandex(AbstractC0080l.amazon(c4346l, 1.0f), null, AbstractC14566l.amazon(1499655365, new C18383l(c2887lLoadAd, this, c6523l, interfaceC8714lPurchase, c15308l), c6956l), c6956l, 3078, 6);
            c0956l = this;
            c6956l2 = c6956l;
            AbstractC6419l.yandex(this.crashlytics, null, null, AbstractC14927l.crashlytics, AbstractC17551l.yandex, c6956l2, 0, 3070);
            c6956l2.startapp(true);
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C10848l(c0956l, interfaceC17242l, i, 19);
        }
    }
}
