package defpackage;

/* JADX INFO: renamed from: lٍّؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1006l extends AbstractC17613l {
    public final boolean amazon;
    public final String crashlytics;
    public final String loadAd;
    public final int yandex;

    public C1006l(int i, String str, String str2, boolean z) {
        this.yandex = i;
        this.loadAd = str;
        this.crashlytics = str2;
        this.amazon = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC17613l) {
            C1006l c1006l = (C1006l) ((AbstractC17613l) obj);
            if (this.yandex == c1006l.yandex && this.loadAd.equals(c1006l.loadAd) && this.crashlytics.equals(c1006l.crashlytics) && this.amazon == c1006l.amazon) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.amazon ? 1231 : 1237) ^ ((((((this.yandex ^ 1000003) * 1000003) ^ this.loadAd.hashCode()) * 1000003) ^ this.crashlytics.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OperatingSystem{platform=");
        sb.append(this.yandex);
        sb.append(", version=");
        sb.append(this.loadAd);
        sb.append(", buildVersion=");
        sb.append(this.crashlytics);
        sb.append(", jailbroken=");
        return AbstractC5020l.Signature(sb, this.amazon, "}");
    }
}
