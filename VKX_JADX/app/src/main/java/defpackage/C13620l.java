package defpackage;

/* JADX INFO: renamed from: lْٕۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13620l {
    public final boolean amazon;
    public final int crashlytics;
    public final long loadAd;
    public final EnumC1826l yandex;

    public C13620l(EnumC1826l enumC1826l, long j, int i, boolean z) {
        this.yandex = enumC1826l;
        this.loadAd = j;
        this.crashlytics = i;
        this.amazon = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13620l)) {
            return false;
        }
        C13620l c13620l = (C13620l) obj;
        return this.yandex == c13620l.yandex && C1187l.loadAd(this.loadAd, c13620l.loadAd) && this.crashlytics == c13620l.crashlytics && this.amazon == c13620l.amazon;
    }

    public final int hashCode() {
        return AbstractC0653l.firebase(this.crashlytics, (C1187l.mopub(this.loadAd) + (this.yandex.hashCode() * 31)) * 31, 31) + (this.amazon ? 1231 : 1237);
    }

    public final String toString() {
        String str;
        String strFirebase = C1187l.firebase(this.loadAd);
        StringBuilder sb = new StringBuilder("SelectionHandleInfo(handle=");
        sb.append(this.yandex);
        sb.append(", position=");
        sb.append(strFirebase);
        sb.append(", anchor=");
        int i = this.crashlytics;
        if (i == 1) {
            str = "Left";
        } else if (i != 2) {
            str = i != 3 ? "null" : "Right";
        } else {
            str = "Middle";
        }
        sb.append(str);
        sb.append(", visible=");
        sb.append(this.amazon);
        sb.append(")");
        return sb.toString();
    }
}
