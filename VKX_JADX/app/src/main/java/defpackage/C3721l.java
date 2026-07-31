package defpackage;

/* JADX INFO: renamed from: lؕۢٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C3721l implements InterfaceC7493l {
    public static final C10142l Companion = new C10142l();
    public final String loadAd;
    public final String yandex;

    public /* synthetic */ C3721l(String str, int i, String str2) {
        if ((i & 1) == 0) {
            this.yandex = "";
        } else {
            this.yandex = str;
        }
        if ((i & 2) == 0) {
            this.loadAd = "";
        } else {
            this.loadAd = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3721l)) {
            return false;
        }
        C3721l c3721l = (C3721l) obj;
        return AbstractC8576l.yandex(this.yandex, c3721l.yandex) && AbstractC8576l.yandex(this.loadAd, c3721l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnknownError(error=");
        sb.append(this.yandex);
        sb.append(", errorDescription=");
        return AbstractC2812l.tapsense(sb, this.loadAd, ')');
    }
}
