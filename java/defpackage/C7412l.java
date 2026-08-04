package defpackage;

/* JADX INFO: renamed from: lؚٖٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C7412l {
    public static final C3063l Companion = new C3063l();
    public final String loadAd;
    public final String yandex;

    public /* synthetic */ C7412l(String str, int i, String str2) {
        if ((i & 1) == 0) {
            this.yandex = null;
        } else {
            this.yandex = str;
        }
        if ((i & 2) == 0) {
            this.loadAd = null;
        } else {
            this.loadAd = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7412l)) {
            return false;
        }
        C7412l c7412l = (C7412l) obj;
        return AbstractC8576l.yandex(this.yandex, c7412l.yandex) && AbstractC8576l.yandex(this.loadAd, c7412l.loadAd);
    }

    public final int hashCode() {
        String str = this.yandex;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.loadAd;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioBooksLegalNoticeDto(title=");
        sb.append(this.yandex);
        sb.append(", text=");
        return AbstractC2812l.tapsense(sb, this.loadAd, ')');
    }
}
