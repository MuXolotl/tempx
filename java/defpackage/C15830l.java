package defpackage;

/* JADX INFO: renamed from: lٕٝۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15830l {
    public final float amazon;
    public final float crashlytics;
    public final int loadAd;
    public final float yandex;

    public C15830l(float f, float f2, float f3, int i) {
        this.yandex = f;
        this.loadAd = i;
        this.crashlytics = f2;
        this.amazon = f3;
        if (0.0f > f || f > 1.0f) {
            C8339l.metrica("The 'progress' argument must be between 0 and 1 (both inclusive)");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15830l)) {
            return false;
        }
        C15830l c15830l = (C15830l) obj;
        return Float.compare(this.yandex, c15830l.yandex) == 0 && this.loadAd == c15830l.loadAd && Float.compare(this.crashlytics, c15830l.crashlytics) == 0 && Float.compare(this.amazon, c15830l.amazon) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.amazon) + AbstractC9029l.mopub(AbstractC0653l.firebase(this.loadAd, Float.floatToIntBits(this.yandex) * 31, 31), this.crashlytics, 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BackEvent(progress=");
        sb.append(this.yandex);
        sb.append(", swipeEdge=");
        int i = this.loadAd;
        if (i == 1) {
            str = "UNKNOWN";
        } else if (i != 2) {
            str = i != 3 ? "null" : "RIGHT";
        } else {
            str = "LEFT";
        }
        sb.append(str);
        sb.append(", touchX=");
        sb.append(this.crashlytics);
        sb.append(", touchY=");
        sb.append(this.amazon);
        sb.append(')');
        return sb.toString();
    }
}
