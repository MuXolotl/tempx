package defpackage;

/* JADX INFO: renamed from: lَّۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12802l implements InterfaceC17472l {
    public final InterfaceC17472l crashlytics;
    public final long loadAd;

    public C12802l(long j, InterfaceC17472l interfaceC17472l) {
        AbstractC5641l.loadAd(j >= 0, "Timeout must be non-negative.");
        this.loadAd = j;
        this.crashlytics = interfaceC17472l;
    }

    @Override // defpackage.InterfaceC17472l
    public final C16380l loadAd(C9489l c9489l) {
        C16380l c16380lLoadAd = this.crashlytics.loadAd(c9489l);
        long j = this.loadAd;
        return (j <= 0 || c9489l.loadAd < j - c16380lLoadAd.yandex) ? c16380lLoadAd : C16380l.amazon;
    }

    @Override // defpackage.InterfaceC17472l
    public final long yandex() {
        return this.loadAd;
    }
}
