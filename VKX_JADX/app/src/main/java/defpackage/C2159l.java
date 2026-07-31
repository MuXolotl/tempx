package defpackage;

/* JADX INFO: renamed from: lْؓ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2159l implements InterfaceC9988l {
    public final C3242l amazon;
    public final int crashlytics;
    public final int loadAd;
    public final C3737l purchase;
    public final boolean yandex;

    public C2159l(boolean z, int i, int i2, C3242l c3242l, C3737l c3737l) {
        this.yandex = z;
        this.loadAd = i;
        this.crashlytics = i2;
        this.amazon = c3242l;
        this.purchase = c3737l;
    }

    @Override // defpackage.InterfaceC9988l
    public final C3737l admob() {
        return this.purchase;
    }

    @Override // defpackage.InterfaceC9988l
    public final C3242l amazon() {
        return this.amazon;
    }

    @Override // defpackage.InterfaceC9988l
    public final int billing() {
        return this.crashlytics;
    }

    @Override // defpackage.InterfaceC9988l
    public final C3737l crashlytics(long j) {
        C3737l c3737l = this.purchase;
        if (j == c3737l.yandex) {
            return c3737l;
        }
        return null;
    }

    @Override // defpackage.InterfaceC9988l
    public final int firebase() {
        return this.loadAd;
    }

    @Override // defpackage.InterfaceC9988l
    public final C3737l isPro() {
        return this.purchase;
    }

    @Override // defpackage.InterfaceC9988l
    public final C3737l loadAd() {
        return this.purchase;
    }

    @Override // defpackage.InterfaceC9988l
    public final int mopub() {
        return 1;
    }

    @Override // defpackage.InterfaceC9988l
    public final C3737l purchase() {
        return this.purchase;
    }

    @Override // defpackage.InterfaceC9988l
    public final boolean remoteconfig(InterfaceC9988l interfaceC9988l) {
        if (this.amazon == null || interfaceC9988l == null || !(interfaceC9988l instanceof C2159l)) {
            return true;
        }
        C2159l c2159l = (C2159l) interfaceC9988l;
        if (this.loadAd != c2159l.loadAd || this.crashlytics != c2159l.crashlytics || this.yandex != c2159l.yandex) {
            return true;
        }
        C3737l c3737l = c2159l.purchase;
        C3737l c3737l2 = this.purchase;
        return (c3737l2.yandex == c3737l.yandex && c3737l2.crashlytics == c3737l.crashlytics && c3737l2.amazon == c3737l.amazon) ? false : true;
    }

    @Override // defpackage.InterfaceC9988l
    public final int subs() {
        int i = this.loadAd;
        int i2 = this.crashlytics;
        if (i < i2) {
            return 2;
        }
        if (i > i2) {
            return 1;
        }
        return this.purchase.loadAd();
    }

    public final String toString() {
        return "SingleSelectionLayout(isStartHandle=" + this.yandex + ", crossed=" + AbstractC11043l.pro(subs()) + ", info=\n\t" + this.purchase + ")";
    }

    @Override // defpackage.InterfaceC9988l
    public final C18730l vip(C3242l c3242l) {
        boolean z = c3242l.crashlytics;
        C15812l c15812l = c3242l.loadAd;
        C15812l c15812l2 = c3242l.yandex;
        if ((!z && c15812l2.loadAd > c15812l.loadAd) || (z && c15812l2.loadAd <= c15812l.loadAd)) {
            c3242l = C3242l.yandex(c3242l, null, null, !z, 3);
        }
        long j = this.purchase.yandex;
        C18730l c18730l = AbstractC17774l.yandex;
        C18730l c18730l2 = new C18730l();
        c18730l2.subs(j, c3242l);
        return c18730l2;
    }

    @Override // defpackage.InterfaceC9988l
    public final boolean yandex() {
        return this.yandex;
    }

    @Override // defpackage.InterfaceC9988l
    public final void smaato(C16931l c16931l) {
    }
}
