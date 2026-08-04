package defpackage;

/* JADX INFO: renamed from: lًٕؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7696l implements InterfaceC6950l {
    public final Throwable loadAd;

    public C7696l(Throwable th) {
        this.loadAd = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7696l) && AbstractC8576l.yandex(this.loadAd, ((C7696l) obj).loadAd);
    }

    public final int hashCode() {
        Throwable th = this.loadAd;
        if (th == null) {
            return 0;
        }
        return th.hashCode();
    }

    public final String toString() {
        return "Closed(cause=" + this.loadAd + ')';
    }
}
