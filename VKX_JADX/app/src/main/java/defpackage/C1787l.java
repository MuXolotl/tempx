package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lِؓؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1787l implements InterfaceC14371l {
    public final /* synthetic */ C8232l yandex;

    public C1787l(C8232l c8232l) {
        this.yandex = c8232l;
    }

    @Override // defpackage.InterfaceC14371l
    public final int amazon() {
        C8232l c8232l = this.yandex;
        return (-c8232l.mopub().vip) + c8232l.mopub().ads;
    }

    @Override // defpackage.InterfaceC14371l
    public final C11907l billing() {
        return new C11907l(-1, -1);
    }

    @Override // defpackage.InterfaceC14371l
    public final Object crashlytics(int i, C13017l c13017l) {
        C13645l c13645l = C8232l.pro;
        C8232l c8232l = this.yandex;
        c8232l.getClass();
        Object objLoadAd = c8232l.loadAd(EnumC11011l.f22182l, new C8912l(c8232l, i, null, 10), c13017l);
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (objLoadAd != enumC9342l) {
            objLoadAd = Unit.INSTANCE;
        }
        return objLoadAd == enumC9342l ? objLoadAd : Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC14371l
    public final float loadAd() {
        C8232l c8232l = this.yandex;
        return (c8232l.amazon.loadAd.admob() * 500) + c8232l.amazon.crashlytics.admob();
    }

    @Override // defpackage.InterfaceC14371l
    public final float purchase() {
        C8232l c8232l = this.yandex;
        int iAdmob = c8232l.amazon.loadAd.admob();
        int iAdmob2 = c8232l.amazon.crashlytics.admob();
        return c8232l.amazon() ? (iAdmob * 500) + iAdmob2 + 100.0f : (iAdmob * 500) + iAdmob2;
    }

    @Override // defpackage.InterfaceC14371l
    public final int yandex() {
        C8232l c8232l = this.yandex;
        return (int) (c8232l.mopub().adcel == EnumC7283l.f15126l ? c8232l.mopub().subs() & 4294967295L : c8232l.mopub().subs() >> 32);
    }
}
