package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٌؗ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8585l implements InterfaceC17842l, InterfaceC5289l {
    public final C5501l amazon;
    public final List billing;
    public final C3151l crashlytics;
    public final C3151l loadAd;
    public final C11919l mopub;
    public final AbstractC18082l purchase;
    public final /* synthetic */ InterfaceC17842l yandex;

    public C8585l(InterfaceC17842l interfaceC17842l, C3151l c3151l, C3151l c3151l2) {
        this.yandex = interfaceC17842l;
        this.loadAd = c3151l;
        this.crashlytics = c3151l2;
        C5501l c5501l = new C5501l(8);
        this.amazon = c5501l;
        this.purchase = AbstractC0509l.crashlytics(new C6155l(R.drawable.ic_search_outline_28), new C5822l(R.string.tv_nav_home), new C5822l(R.string.tv_nav_library), new C5822l(R.string.tv_nav_now), new C6155l(R.drawable.ic_settings_outline_28));
        this.billing = AbstractC14055l.remoteconfig(EnumC9157l.f18807l, EnumC9157l.f18805l, EnumC9157l.f18810l, EnumC9157l.f18809l, EnumC9157l.f18811l);
        InterfaceC16588l interfaceC16588lSerializer = EnumC9157l.Companion.serializer();
        C14959l c14959l = new C14959l(2, this, C8585l.class, "childFactory", "childFactory(Lua/itaysonlab/vkxtv/components/main/TvMainNavigationComponent$NavigationPage;Lcom/arkivanov/decompose/ComponentContext;)Lua/itaysonlab/vkxtv/core/ComposeComponent;", 0, 0, 12);
        C13932l c13932l = new C13932l(2, this);
        C14813l c14813l = new C14813l((byte) 0, 28);
        this.mopub = AbstractC11174l.purchase(this, c5501l, "DefaultChildPages", new C12242l(c13932l, c14813l, 2), new C1412l(28, new C12986l(interfaceC16588lSerializer, 0)), new C0464l(new C12986l(interfaceC16588lSerializer, 1), c14813l, 29), new C13393l(c14813l, 4, (byte) 0), new C3755l(8), new C2039l(5), new C8864l(6), c14959l);
    }

    public final void admob(int i, int i2, C6956l c6956l, InterfaceC17242l interfaceC17242l, Function1 function1) {
        int i3;
        InterfaceC17242l interfaceC17242l2;
        c6956l.m2133new(-286424268);
        if ((i2 & 6) == 0) {
            i3 = (c6956l.billing(interfaceC17242l) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c6956l.amazon(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= c6956l.admob(function1) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= c6956l.admob(this) ? 2048 : 1024;
        }
        if (c6956l.m2127for(i3 & 1, (i3 & 1171) != 1170)) {
            Object objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                objM2132native = new C6523l();
                c6956l.m2147try(objM2132native);
            }
            C6523l c6523l = (C6523l) objM2132native;
            interfaceC17242l2 = interfaceC17242l;
            AbstractC3292l.yandex(i, AbstractC6745l.purchase(interfaceC17242l2, c6523l), C9735l.isPro, 0L, null, null, AbstractC14566l.amazon(1409056141, new C5173l(this, i, function1, c6523l), c6956l), c6956l, ((i3 >> 3) & 14) | 1573248);
        } else {
            interfaceC17242l2 = interfaceC17242l;
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C0056l(this, interfaceC17242l2, i, function1, i2, 1);
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

    public final void mopub(int i, int i2, C6956l c6956l, InterfaceC17242l interfaceC17242l, Function1 function1) {
        C8585l c8585l;
        InterfaceC17242l interfaceC17242l2;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(-1038567256);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= c6956l2.amazon(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= c6956l2.admob(function1) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i2 & 3072) == 0) {
            c8585l = this;
            i3 |= c6956l2.admob(c8585l) ? 2048 : 1024;
        } else {
            c8585l = this;
        }
        if (c6956l2.m2127for(i3 & 1, (i3 & 1171) != 1170)) {
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lAmazon = AbstractC4927l.amazon(AbstractC3605l.remoteconfig(AbstractC0080l.amazon(c4346l, 1.0f), 32.0f, 24.0f), ((C10936l) c6956l2.isPro(AbstractC10689l.yandex)).subs(), AbstractC16837l.yandex);
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
            long j = c6956l2.f14595continue;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lAmazon);
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
            AbstractC8182l.billing(c6956l2, Integer.valueOf(i4), C3438l.isPro);
            AbstractC8182l.purchase(c6956l2, C3438l.firebase);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
            c8585l.admob(i, (i3 & 112) | 6 | (i3 & 896) | (i3 & 7168), c6956l2, AbstractC0080l.amazon(c4346l, 1.0f), function1);
            c6956l2 = c6956l2;
            AbstractC11477l.yandex(AbstractC16759l.crashlytics(R.drawable.logo_vkx_32, 0, c6956l2), AbstractC0080l.isPro(C16170l.yandex.yandex(c4346l, C18450l.f36035l), 24.0f), C9735l.purchase, c6956l2, 3128, 0);
            c6956l2.startapp(true);
            interfaceC17242l2 = c4346l;
        } else {
            c6956l2.m2124else();
            interfaceC17242l2 = interfaceC17242l;
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C0056l(this, interfaceC17242l2, i, function1, i2, 0);
        }
    }

    @Override // defpackage.InterfaceC17842l
    public final InterfaceC9573l purchase() {
        return this.yandex.purchase();
    }

    @Override // defpackage.InterfaceC5289l
    public final void yandex(InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(-1223312072);
        int i3 = i | (c6956l.admob(this) ? 32 : 16);
        if (c6956l.m2127for(i3 & 1, (i3 & 19) != 18)) {
            InterfaceC8714l interfaceC8714lPurchase = AbstractC9637l.purchase(this.mopub, c6956l, 0);
            int iAdmob = AbstractC6363l.admob(0, 1, c6956l);
            C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l, 0);
            long j = c6956l.f14595continue;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242l);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c1853lYandex, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i4), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            int i5 = ((C17848l) interfaceC8714lPurchase.getValue()).loadAd;
            boolean zAdmob = c6956l.admob(this);
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (zAdmob || objM2132native == c13863l) {
                objM2132native = new C0783l(15, this);
                c6956l.m2147try(objM2132native);
            }
            mopub(i5, (i3 << 6) & 7168, c6956l, null, (Function1) objM2132native);
            Object obj = ((C17848l) interfaceC8714lPurchase.getValue()).yandex.get(((C17848l) interfaceC8714lPurchase.getValue()).loadAd);
            InterfaceC17242l interfaceC17242lPremium = AbstractC0080l.amazon(C4346l.f8873l, 1.0f).premium(new C9247l(1.0f, true));
            boolean zAmazon = c6956l.amazon(iAdmob);
            Object objM2132native2 = c6956l.m2132native();
            if (zAmazon || objM2132native2 == c13863l) {
                objM2132native2 = new C4119l(iAdmob, 2);
                c6956l.m2147try(objM2132native2);
            }
            i2 = 2;
            AbstractC7741l.loadAd(obj, interfaceC17242lPremium, (Function1) objM2132native2, null, null, null, AbstractC9592l.yandex, c6956l, 1572864, 56);
            c6956l.startapp(true);
        } else {
            i2 = 2;
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3666l(this, interfaceC17242l, i, i2);
        }
    }
}
