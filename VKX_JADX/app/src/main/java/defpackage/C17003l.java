package defpackage;

import java.util.Arrays;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylistLibrary;

/* JADX INFO: renamed from: lٍؚٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17003l extends AbstractC11801l {

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final InterfaceC6942l f33132l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C4910l f33133l;

    public C17003l() {
        InterfaceC6942l interfaceC6942lMetrica;
        super(0);
        C5198l c5198lM3161l = C6336l.loadAd.m3161l();
        this.f33132l = (c5198lM3161l == null || (interfaceC6942lMetrica = AbstractC0622l.metrica(new C14970l(11, new C14194l(AbstractC4338l.startapp(c5198lM3161l.m1735l(AbstractC18202l.yandex.loadAd(CachedPlaylistLibrary.class), "TRUEPREDICATE", Arrays.copyOf(new Object[0], 0)).purchase()), 5)), AbstractC11463l.yandex)) == null) ? new C14970l(5, C11507l.f23131l) : interfaceC6942lMetrica;
        this.f33133l = AbstractC8618l.yandex();
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final void m4252import(CachedPlaylist cachedPlaylist, C15578l c15578l, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        Function2 function2;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(-171885930);
        int i2 = i | (c6956l2.billing(cachedPlaylist) ? 4 : 2) | (c6956l2.billing(interfaceC17242l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c6956l2.m2127for(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 14) == 4;
            Object objM2132native = c6956l2.m2132native();
            if (z || objM2132native == C1867l.yandex) {
                objM2132native = AbstractC9769l.loadAd(cachedPlaylist);
                c6956l2.m2147try(objM2132native);
            }
            String str = (String) objM2132native;
            C0086l c0086l = C18450l.f36040l;
            C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(16.0f, true, new C8339l(12)), c0086l, c6956l2, 54);
            long j = c6956l2.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
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
            AbstractC8182l.billing(c6956l2, c5062lYandex, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf = Integer.valueOf(i3);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l2, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l2, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, c6415l4);
            C4346l c4346l = C4346l.f8873l;
            AbstractC7741l.amazon(cachedPlaylist, null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(c4346l, 64.0f), AbstractC13106l.billing(c6956l2).crashlytics), null, null, c6956l2, 48, 2040);
            C9247l c9247l = new C9247l(1.0f, true);
            C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l2, 0);
            long j2 = c6956l2.f14595continue;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, c9247l);
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, c1853lYandex, c6415l);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i4, c6956l2, c6415l3, c6956l2, c11192l);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling2, c6415l4);
            C5062l c5062lYandex2 = AbstractC7001l.yandex(new C7537l(2.0f, true, new C8339l(12)), c0086l, c6956l2, 54);
            long j3 = c6956l2.f14595continue;
            int i5 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato3 = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l2, c4346l);
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, c5062lYandex2, c6415l);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato3, c6415l2);
            AbstractC11043l.isPro(i5, c6956l2, c6415l3, c6956l2, c11192l);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling3, c6415l4);
            String strInmobi = cachedPlaylist.inmobi();
            C11090l c11090l = AbstractC13106l.admob(c6956l2).remoteconfig;
            long j4 = AbstractC13106l.purchase(c6956l2).adcel;
            C6886l c6886l = C6886l.f14425l;
            AbstractC13010l.loadAd(strInmobi, null, j4, 0L, null, c6886l, null, 0L, null, 0L, 2, false, 1, 0, c11090l, c6956l, 1572864, 24960, 110522);
            C6956l c6956l3 = c6956l;
            if (cachedPlaylist.m4621volatile()) {
                c6956l3.m2123default(699965735);
                AbstractC5889l.amazon(AbstractC0080l.isPro(c4346l, 16.0f), 0L, c6956l, 6, 2);
                c6956l3 = c6956l;
            } else {
                c6956l3.m2123default(689770734);
            }
            c6956l3.startapp(false);
            c6956l3.startapp(true);
            String strIsVip = cachedPlaylist.isVip();
            if (strIsVip == null) {
                strIsVip = "";
            }
            AbstractC13010l.loadAd(strIsVip, null, AbstractC13106l.purchase(c6956l3).subscription, 0L, null, c6886l, null, 0L, null, 0L, 2, false, 1, 0, AbstractC13106l.admob(c6956l3).remoteconfig, c6956l, 1572864, 24960, 110522);
            c6956l2 = c6956l;
            if (str.length() > 0) {
                c6956l2.m2123default(562073951);
                AbstractC13010l.loadAd(str, null, AbstractC13106l.purchase(c6956l2).subscription, 0L, null, c6886l, null, 0L, null, 0L, 2, false, 1, 0, AbstractC13106l.admob(c6956l2).remoteconfig, c6956l, 1572864, 24960, 110522);
                c6956l2 = c6956l;
            } else {
                c6956l2.m2123default(551326034);
            }
            c6956l2.startapp(false);
            c6956l2.startapp(true);
            function2 = c15578l;
            function2.invoke(c6956l2, 6);
            c6956l2.startapp(true);
        } else {
            function2 = c15578l;
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C2104l(this, cachedPlaylist, function2, interfaceC17242l, i, 22);
        }
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        c6956l.m2133new(536581201);
        int i2 = (c6956l.admob(this) ? 4 : 2) | i;
        byte b = 0;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            InterfaceC1234l interfaceC1234l = (InterfaceC1234l) c6956l.isPro(AbstractC4751l.smaato);
            InterfaceC8714l interfaceC8714lLoadAd = AbstractC8020l.loadAd(this.f33132l, C11507l.f23131l, c6956l, 48);
            C5866l c5866lYandex = AbstractC11598l.yandex(0, 3, c6956l);
            boolean zAdmob = c6956l.admob(interfaceC1234l) | c6956l.admob(this);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C15818l(interfaceC1234l, this, null);
                c6956l.m2147try(objM2132native);
            }
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(411058709, new C4928l(this, b, b), c6956l), null, null, null, 0, 0L, 0L, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).amazon(c6956l), AbstractC14566l.amazon(-357834336, new C18383l(c5866lYandex, interfaceC8714lLoadAd, AbstractC12953l.metrica(c5866lYandex, (Function4) objM2132native, c6956l), this, interfaceC1234l, 5), c6956l), c6956l, 805306416, 253);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4928l(this, i);
        }
    }
}
