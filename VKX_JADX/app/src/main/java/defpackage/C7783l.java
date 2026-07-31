package defpackage;

/* JADX INFO: renamed from: lًؕۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7783l implements InterfaceC1489l {
    public final long loadAd;
    public final InterfaceC1489l yandex;

    public C7783l(InterfaceC17807l interfaceC17807l, long j) {
        this.yandex = interfaceC17807l;
        this.loadAd = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7783l)) {
            return false;
        }
        C7783l c7783l = (C7783l) obj;
        return c7783l.loadAd == this.loadAd && AbstractC8576l.yandex(c7783l.yandex, this.yandex);
    }

    public final int hashCode() {
        int iHashCode = this.yandex.hashCode() * 31;
        long j = this.loadAd;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    @Override // defpackage.InterfaceC1489l
    public final InterfaceC15930l yandex(C0010l c0010l) {
        return new C9149l(this.yandex.yandex(c0010l), this.loadAd);
    }
}
