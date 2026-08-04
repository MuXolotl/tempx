package defpackage;

import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؘِ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17723l implements InterfaceC5289l, InterfaceC17842l {
    public final Function1 amazon;
    public final C18662l billing;
    public final Function1 crashlytics;
    public final Function0 loadAd;
    public final C14965l mopub;
    public final C8424l purchase;
    public final /* synthetic */ InterfaceC17842l yandex;

    public C17723l(Function0 function0, Function1 function1, Function1 function2, InterfaceC17842l interfaceC17842l) {
        this.yandex = interfaceC17842l;
        this.loadAd = function0;
        this.crashlytics = function1;
        this.amazon = function2;
        C6921l c6921lCrashlytics = interfaceC17842l.crashlytics();
        InterfaceC13012l interfaceC13012lYandex = AbstractC18202l.yandex(C8424l.class);
        InterfaceC0896l c8424l = (InterfaceC0896l) ((HashMap) c6921lCrashlytics.f14493l).get(interfaceC13012lYandex);
        if (c8424l == null) {
            c8424l = new C8424l();
            c6921lCrashlytics.ad(interfaceC13012lYandex, c8424l);
        }
        this.purchase = (C8424l) c8424l;
        this.billing = AbstractC18263l.purchase(this);
        InterfaceC12356l interfaceC12356lLoadAd = interfaceC17842l.loadAd();
        interfaceC12356lLoadAd.mopub(new C17326l(interfaceC12356lLoadAd, this, 2));
        this.mopub = new C14965l(13);
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

    @Override // defpackage.InterfaceC17842l
    public final InterfaceC9573l purchase() {
        return this.yandex.purchase();
    }

    @Override // defpackage.InterfaceC5289l
    public final void yandex(InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        c6956l.m2133new(128163128);
        int i2 = (c6956l.admob(this) ? 32 : 16) | i;
        int i3 = 0;
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            C8424l c8424l = this.purchase;
            InterfaceC8714l interfaceC8714lPurchase = AbstractC9637l.purchase(c8424l.crashlytics, c6956l, 0);
            InterfaceC8714l interfaceC8714lPurchase2 = AbstractC9637l.purchase(c8424l.purchase, c6956l, 0);
            C5866l c5866lYandex = AbstractC11598l.yandex(0, 3, c6956l);
            Object objM2132native = c6956l.m2132native();
            Object obj = C1867l.yandex;
            if (objM2132native == obj) {
                C6523l c6523l = C6523l.loadAd;
                objM2132native = C7122l.yandex;
                c6956l.m2147try(objM2132native);
            }
            ((C7122l) objM2132native).getClass();
            C6523l c6523l2 = new C6523l();
            C6523l c6523l3 = new C6523l();
            C10707l c10707l = AbstractC12821l.yandex;
            boolean zBilling = c6956l.billing(c6523l2) | c6956l.admob(this);
            Object objM2132native2 = c6956l.m2132native();
            if (zBilling || objM2132native2 == obj) {
                objM2132native2 = new C15575l(c6523l2, this, i3);
                c6956l.m2147try(objM2132native2);
            }
            AbstractC10478l.yandex(c10707l.yandex((Function1) objM2132native2), AbstractC14566l.amazon(975245432, new C11191l(interfaceC17242l, this, interfaceC8714lPurchase, c6523l2, c6523l3, c5866lYandex, interfaceC8714lPurchase2), c6956l), c6956l, 56);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C2736l(this, interfaceC17242l, i, 23);
        }
    }
}
