package defpackage;

/* JADX INFO: renamed from: lّٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12648l {
    public final String loadAd;
    public final Object yandex;

    public C12648l(Object obj, String str) {
        this.yandex = obj;
        this.loadAd = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12648l)) {
            return false;
        }
        C12648l c12648l = (C12648l) obj;
        return this.yandex == c12648l.yandex && this.loadAd.equals(c12648l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (System.identityHashCode(this.yandex) * 31);
    }
}
