package defpackage;

/* JADX INFO: renamed from: lۣٕؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5242l implements InterfaceC13751l {
    public final String loadAd;
    public final int yandex;

    public C5242l(int i, String str) {
        this.yandex = i;
        this.loadAd = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5242l)) {
            return false;
        }
        C5242l c5242l = (C5242l) obj;
        return this.yandex == c5242l.yandex && this.loadAd.equals(c5242l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Installed(timeLeft=");
        sb.append(this.yandex);
        sb.append(", timeLeftFormatted=");
        return AbstractC2812l.tapsense(sb, this.loadAd, ')');
    }
}
