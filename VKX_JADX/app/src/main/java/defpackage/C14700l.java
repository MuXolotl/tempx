package defpackage;

/* JADX INFO: renamed from: lٔؗۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14700l {
    public final int loadAd;
    public final C3624l yandex;

    public C14700l(C3624l c3624l, int i) {
        this.yandex = c3624l;
        this.loadAd = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14700l)) {
            return false;
        }
        C14700l c14700l = (C14700l) obj;
        return this.yandex.equals(c14700l.yandex) && this.loadAd == c14700l.loadAd;
    }

    public final int hashCode() {
        return (this.yandex.hashCode() * 31) + this.loadAd;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            i = this.loadAd;
            if (i2 >= i) {
                break;
            }
            sb.append("kotlin/Array<");
            i2++;
        }
        sb.append(this.yandex);
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(">");
        }
        return sb.toString();
    }
}
