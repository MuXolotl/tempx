package defpackage;

/* JADX INFO: renamed from: lؖۜۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4414l implements InterfaceC3525l {
    public final C7455l loadAd;
    public final C16628l yandex;

    public C4414l(C16628l c16628l, C7455l c7455l) {
        this.yandex = c16628l;
        this.loadAd = c7455l;
    }

    @Override // defpackage.InterfaceC3525l
    public final InterfaceC3773l yandex(C6669l c6669l, C15106l c15106l) {
        return new C13533l(c6669l.yandex, c15106l, this.yandex, this.loadAd);
    }
}
