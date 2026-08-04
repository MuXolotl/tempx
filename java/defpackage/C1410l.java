package defpackage;

/* JADX INFO: renamed from: lؒۡۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1410l {
    public final boolean amazon;
    public final int crashlytics;
    public final int loadAd;
    public final String yandex;

    public C1410l(int i, int i2, String str, boolean z) {
        this.yandex = str;
        this.loadAd = i;
        this.crashlytics = i2;
        this.amazon = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1410l)) {
            return false;
        }
        C1410l c1410l = (C1410l) obj;
        return this.yandex.equals(c1410l.yandex) && this.loadAd == c1410l.loadAd && this.crashlytics == c1410l.crashlytics && this.amazon == c1410l.amazon;
    }

    public final int hashCode() {
        return (((((this.yandex.hashCode() * 31) + this.loadAd) * 31) + this.crashlytics) * 31) + (this.amazon ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessDetails(processName=");
        sb.append(this.yandex);
        sb.append(", pid=");
        sb.append(this.loadAd);
        sb.append(", importance=");
        sb.append(this.crashlytics);
        sb.append(", isDefaultProcess=");
        return AbstractC0653l.tapsense(sb, this.amazon, ')');
    }
}
