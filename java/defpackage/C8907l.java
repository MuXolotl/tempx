package defpackage;

/* JADX INFO: renamed from: lٌٛٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8907l implements InterfaceC17472l {
    public final /* synthetic */ long loadAd;

    public C8907l(long j) {
        this.loadAd = j;
    }

    @Override // defpackage.InterfaceC17472l
    public final C16380l loadAd(C9489l c9489l) {
        return c9489l.yandex == 1 ? C16380l.amazon : C16380l.purchase;
    }

    @Override // defpackage.InterfaceC17472l
    public final long yandex() {
        return this.loadAd;
    }
}
