package defpackage;

/* JADX INFO: renamed from: lؙّٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12434l {
    public InterfaceC12830l loadAd;
    public String yandex;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12434l)) {
            return false;
        }
        C12434l c12434l = (C12434l) obj;
        return this.yandex.equals(c12434l.yandex) && this.loadAd.equals(c12434l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        return "RealmPropertyImpl(name=" + this.yandex + ", type=" + this.loadAd + ")";
    }
}
