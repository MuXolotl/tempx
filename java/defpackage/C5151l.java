package defpackage;

/* JADX INFO: renamed from: lؗۛؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5151l {
    public final String loadAd;
    public final C15113l yandex = C15113l.loadAd;

    public C5151l(String str) {
        this.loadAd = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5151l)) {
            return false;
        }
        C5151l c5151l = (C5151l) obj;
        return this.yandex.equals(c5151l.yandex) && this.loadAd.equals(c5151l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() ^ this.yandex.hashCode();
    }
}
