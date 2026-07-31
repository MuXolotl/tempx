package defpackage;

/* JADX INFO: renamed from: lٖٙۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16464l implements InterfaceC0038l {
    public final C13654l loadAd;
    public final C13698l yandex;

    public C16464l(C13698l c13698l, C13654l c13654l) {
        this.yandex = c13698l;
        this.loadAd = c13654l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16464l)) {
            return false;
        }
        C16464l c16464l = (C16464l) obj;
        return AbstractC8576l.yandex(this.yandex, c16464l.yandex) && AbstractC8576l.yandex(this.loadAd, c16464l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        return "IacReadyToTransfer(client=" + this.yandex + ", device=" + this.loadAd + ')';
    }
}
