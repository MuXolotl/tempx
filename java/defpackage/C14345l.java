package defpackage;

import java.util.Locale;

/* JADX INFO: renamed from: lؘٓۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14345l {
    public final String loadAd;
    public final String yandex;

    public C14345l(String str, String str2) {
        this.yandex = str;
        this.loadAd = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14345l)) {
            return false;
        }
        C14345l c14345l = (C14345l) obj;
        return AbstractC16648l.license(c14345l.yandex, this.yandex, true) && AbstractC16648l.license(c14345l.loadAd, this.loadAd, true);
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        int iHashCode = this.yandex.toLowerCase(locale).hashCode();
        return this.loadAd.toLowerCase(locale).hashCode() + (iHashCode * 31) + iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeaderValueParam(name=");
        sb.append(this.yandex);
        sb.append(", value=");
        return AbstractC0653l.ads(sb, this.loadAd, ", escapeValue=false)");
    }
}
