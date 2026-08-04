package defpackage;

/* JADX INFO: renamed from: lٍؑۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0217l {
    public final float amazon;
    public final float crashlytics;
    public final int loadAd;
    public final boolean purchase;
    public final int yandex;

    public /* synthetic */ C0217l(float f, int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? 0.0f : f, 0.0f, (i3 & 16) == 0);
    }

    public static C0217l yandex(C0217l c0217l, int i, float f) {
        int i2 = c0217l.loadAd;
        float f2 = c0217l.amazon;
        c0217l.getClass();
        return new C0217l(i, i2, f, f2, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0217l)) {
            return false;
        }
        C0217l c0217l = (C0217l) obj;
        return this.yandex == c0217l.yandex && this.loadAd == c0217l.loadAd && Float.compare(this.crashlytics, c0217l.crashlytics) == 0 && Float.compare(this.amazon, c0217l.amazon) == 0 && this.purchase == c0217l.purchase;
    }

    public final int hashCode() {
        return AbstractC9029l.mopub(AbstractC9029l.mopub(((this.yandex * 31) + this.loadAd) * 31, this.crashlytics, 31), this.amazon, 31) + (this.purchase ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Progress(positionSeconds=");
        sb.append(this.yandex);
        sb.append(", durationSeconds=");
        sb.append(this.loadAd);
        sb.append(", playbackProgress=");
        sb.append(this.crashlytics);
        sb.append(", bufferedProgress=");
        sb.append(this.amazon);
        sb.append(", manualChange=");
        return AbstractC0653l.tapsense(sb, this.purchase, ')');
    }

    public C0217l(int i, int i2, float f, float f2, boolean z) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = f;
        this.amazon = f2;
        this.purchase = z;
    }
}
