package defpackage;

/* JADX INFO: renamed from: lِٕؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3337l implements InterfaceC9876l {
    public final C2350l loadAd;
    public final C16382l yandex;

    public C3337l(C16382l c16382l, C2350l c2350l) {
        this.yandex = c16382l;
        this.loadAd = c2350l;
    }

    @Override // defpackage.InterfaceC9876l
    public final boolean loadAd(C16745l c16745l) {
        if (c16745l.loadAd == 4 && !this.yandex.yandex(c16745l)) {
            String str = c16745l.crashlytics;
            if (str != null) {
                this.loadAd.loadAd(new C5204l(str, c16745l.purchase, c16745l.billing));
                return true;
            }
            C6541l.subs("Null token");
        }
        return false;
    }

    @Override // defpackage.InterfaceC9876l
    public final boolean yandex(Exception exc) {
        this.loadAd.crashlytics(exc);
        return true;
    }
}
