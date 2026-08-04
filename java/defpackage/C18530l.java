package defpackage;

/* JADX INFO: renamed from: lٍۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18530l {
    public final String loadAd;
    public final String yandex;

    public C18530l(String str, String str2) {
        this.yandex = str;
        this.loadAd = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18530l)) {
            return false;
        }
        C18530l c18530l = (C18530l) obj;
        return AbstractC8576l.yandex(this.yandex, c18530l.yandex) && AbstractC8576l.yandex(this.loadAd, c18530l.loadAd);
    }

    public final int hashCode() {
        String str = this.yandex;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.loadAd;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FirebaseInstallationId(fid=");
        sb.append(this.yandex);
        sb.append(", authToken=");
        return AbstractC2812l.tapsense(sb, this.loadAd, ')');
    }
}
