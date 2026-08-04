package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lُؖۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4373l implements InterfaceC14371l {
    public final /* synthetic */ boolean crashlytics;
    public final /* synthetic */ C5866l loadAd;
    public final C8610l yandex;

    public C4373l(C5866l c5866l, boolean z) {
        this.loadAd = c5866l;
        this.crashlytics = z;
        this.yandex = AbstractC8020l.mopub(new C7730l(17, c5866l));
    }

    @Override // defpackage.InterfaceC14371l
    public final int amazon() {
        C5866l c5866l = this.loadAd;
        return (-c5866l.admob().smaato) + c5866l.admob().startapp;
    }

    @Override // defpackage.InterfaceC14371l
    public final C11907l billing() {
        boolean z = this.crashlytics;
        C8610l c8610l = this.yandex;
        return z ? new C11907l(((Number) c8610l.getValue()).intValue(), 1) : new C11907l(1, ((Number) c8610l.getValue()).intValue());
    }

    @Override // defpackage.InterfaceC14371l
    public final Object crashlytics(int i, C13017l c13017l) {
        Object objIsPro = C5866l.isPro(this.loadAd, i, c13017l);
        return objIsPro == EnumC9342l.f19165l ? objIsPro : Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC14371l
    public final float loadAd() {
        C5866l c5866l = this.loadAd;
        return (c5866l.purchase.loadAd.admob() * 500) + c5866l.purchase.crashlytics.admob();
    }

    @Override // defpackage.InterfaceC14371l
    public final float purchase() {
        C5866l c5866l = this.loadAd;
        int iAdmob = c5866l.purchase.loadAd.admob();
        int iAdmob2 = c5866l.purchase.crashlytics.admob();
        return c5866l.amazon() ? (iAdmob * 500) + iAdmob2 + 100.0f : (iAdmob * 500) + iAdmob2;
    }

    @Override // defpackage.InterfaceC14371l
    public final int yandex() {
        C5866l c5866l = this.loadAd;
        return (int) (c5866l.admob().metrica == EnumC7283l.f15126l ? c5866l.admob().subs() & 4294967295L : c5866l.admob().subs() >> 32);
    }
}
