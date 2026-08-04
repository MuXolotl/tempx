package defpackage;

/* JADX INFO: renamed from: lٌؒؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0923l implements InterfaceC4277l {
    public final long loadAd;
    public final InterfaceC13490l yandex;

    public C0923l(InterfaceC15847l interfaceC15847l, long j) {
        this.yandex = interfaceC15847l;
        this.loadAd = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0923l)) {
            return false;
        }
        C0923l c0923l = (C0923l) obj;
        return AbstractC8576l.yandex(this.yandex, c0923l.yandex) && C15519l.loadAd(this.loadAd, c0923l.loadAd);
    }

    public final int hashCode() {
        int iHashCode = this.yandex.hashCode() * 31;
        long j = this.loadAd;
        return ((int) (j ^ (j >>> 32))) + iHashCode;
    }

    public final float loadAd() {
        long j = this.loadAd;
        if (!C15519l.amazon(j)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.yandex.mo872static(C15519l.admob(j));
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.yandex + ", constraints=" + C15519l.smaato(this.loadAd) + ")";
    }

    @Override // defpackage.InterfaceC4277l
    public final InterfaceC17242l yandex(InterfaceC17242l interfaceC17242l, C14855l c14855l) {
        return interfaceC17242l.premium(new C10300l(c14855l, false));
    }
}
