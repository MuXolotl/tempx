package defpackage;

/* JADX INFO: renamed from: lٌٍؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9415l {
    public final boolean amazon;
    public final boolean crashlytics;
    public final boolean loadAd;
    public final boolean purchase;
    public final boolean yandex;

    public C9415l(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.yandex = z;
        this.loadAd = z2;
        this.crashlytics = z3;
        this.amazon = z4;
        this.purchase = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9415l)) {
            return false;
        }
        C9415l c9415l = (C9415l) obj;
        return this.yandex == c9415l.yandex && this.loadAd == c9415l.loadAd && this.crashlytics == c9415l.crashlytics && this.amazon == c9415l.amazon && this.purchase == c9415l.purchase;
    }

    public final int hashCode() {
        return ((((((((this.yandex ? 1231 : 1237) * 31) + (this.loadAd ? 1231 : 1237)) * 31) + (this.crashlytics ? 1231 : 1237)) * 31) + (this.amazon ? 1231 : 1237)) * 31) + (this.purchase ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkState(isConnected=");
        sb.append(this.yandex);
        sb.append(", isValidated=");
        sb.append(this.loadAd);
        sb.append(", isMetered=");
        sb.append(this.crashlytics);
        sb.append(", isNotRoaming=");
        sb.append(this.amazon);
        sb.append(", isBlocked=");
        return AbstractC0653l.tapsense(sb, this.purchase, ')');
    }
}
