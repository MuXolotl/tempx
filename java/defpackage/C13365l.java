package defpackage;

/* JADX INFO: renamed from: lْٔؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13365l extends AbstractC0724l {
    public final String crashlytics;
    public final String loadAd;
    public final String yandex;

    public C13365l(String str, String str2, String str3) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0724l) {
            C13365l c13365l = (C13365l) ((AbstractC0724l) obj);
            if (this.yandex.equals(c13365l.yandex) && this.loadAd.equals(c13365l.loadAd) && this.crashlytics.equals(c13365l.crashlytics)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() ^ ((((this.yandex.hashCode() ^ 1000003) * 1000003) ^ this.loadAd.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuildIdMappingForArch{arch=");
        sb.append(this.yandex);
        sb.append(", libraryName=");
        sb.append(this.loadAd);
        sb.append(", buildId=");
        return AbstractC0653l.ads(sb, this.crashlytics, "}");
    }
}
