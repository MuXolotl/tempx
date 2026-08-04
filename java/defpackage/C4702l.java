package defpackage;

/* JADX INFO: renamed from: lؘؗٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4702l extends AbstractC1431l {
    public final boolean amazon;
    public final int crashlytics;
    public final int loadAd;
    public final String yandex;

    public C4702l(int i, int i2, String str, boolean z) {
        this.yandex = str;
        this.loadAd = i;
        this.crashlytics = i2;
        this.amazon = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1431l) {
            C4702l c4702l = (C4702l) ((AbstractC1431l) obj);
            if (this.yandex.equals(c4702l.yandex) && this.loadAd == c4702l.loadAd && this.crashlytics == c4702l.crashlytics && this.amazon == c4702l.amazon) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.amazon ? 1231 : 1237) ^ ((((((this.yandex.hashCode() ^ 1000003) * 1000003) ^ this.loadAd) * 1000003) ^ this.crashlytics) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessDetails{processName=");
        sb.append(this.yandex);
        sb.append(", pid=");
        sb.append(this.loadAd);
        sb.append(", importance=");
        sb.append(this.crashlytics);
        sb.append(", defaultProcess=");
        return AbstractC5020l.Signature(sb, this.amazon, "}");
    }
}
