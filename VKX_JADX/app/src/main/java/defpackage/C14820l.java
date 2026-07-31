package defpackage;

/* JADX INFO: renamed from: lُٔۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14820l {
    public final boolean crashlytics;
    public final boolean loadAd;
    public final EnumC18024l yandex;

    public C14820l(EnumC18024l enumC18024l, boolean z, boolean z2) {
        this.yandex = enumC18024l;
        this.loadAd = z;
        this.crashlytics = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14820l)) {
            return false;
        }
        C14820l c14820l = (C14820l) obj;
        return this.yandex == c14820l.yandex && this.loadAd == c14820l.loadAd && this.crashlytics == c14820l.crashlytics;
    }

    public final int hashCode() {
        return (((this.yandex.hashCode() * 31) + (this.loadAd ? 1231 : 1237)) * 31) + (this.crashlytics ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RowColumnChildSelector(type=");
        sb.append(this.yandex);
        sb.append(", expandWidth=");
        sb.append(this.loadAd);
        sb.append(", expandHeight=");
        return AbstractC0653l.tapsense(sb, this.crashlytics, ')');
    }
}
