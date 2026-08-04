package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lؔٚۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2732l implements InterfaceC14371l {
    public final /* synthetic */ C7583l yandex;

    public C2732l(C7583l c7583l) {
        this.yandex = c7583l;
    }

    @Override // defpackage.InterfaceC14371l
    public final int amazon() {
        C7583l c7583l = this.yandex;
        return c7583l.mopub().adcel + c7583l.mopub().ads;
    }

    @Override // defpackage.InterfaceC14371l
    public final C11907l billing() {
        return new C11907l(-1, -1);
    }

    @Override // defpackage.InterfaceC14371l
    public final Object crashlytics(int i, C13017l c13017l) {
        C13645l c13645l = C7583l.ad;
        C7583l c7583l = this.yandex;
        c7583l.getClass();
        Object objLoadAd = c7583l.loadAd(EnumC11011l.f22182l, new C8912l(c7583l, i, null, 12), c13017l);
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (objLoadAd != enumC9342l) {
            objLoadAd = Unit.INSTANCE;
        }
        return objLoadAd == enumC9342l ? objLoadAd : Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC14371l
    public final float loadAd() {
        C7583l c7583l = this.yandex;
        return (((C15308l) c7583l.crashlytics.f15343l).admob() * 500) + ((C15308l) c7583l.crashlytics.f15336l).admob();
    }

    @Override // defpackage.InterfaceC14371l
    public final float purchase() {
        C7583l c7583l = this.yandex;
        int iAdmob = ((C15308l) c7583l.crashlytics.f15343l).admob();
        int iAdmob2 = ((C15308l) c7583l.crashlytics.f15336l).admob();
        return c7583l.amazon() ? (iAdmob * 500) + iAdmob2 + 100.0f : (iAdmob * 500) + iAdmob2;
    }

    @Override // defpackage.InterfaceC14371l
    public final int yandex() {
        C7583l c7583l = this.yandex;
        return (int) (c7583l.mopub().license == EnumC7283l.f15126l ? c7583l.mopub().vip & 4294967295L : c7583l.mopub().vip >> 32);
    }
}
