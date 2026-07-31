package defpackage;

/* JADX INFO: renamed from: lؙِّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12543l {
    public static final C12543l amazon = new C12543l(EnumC5244l.f11320l, 6);
    public final EnumC5244l crashlytics;
    public final C8855l loadAd;
    public final EnumC5244l yandex;

    public C12543l(EnumC5244l enumC5244l, int i) {
        this(enumC5244l, (i & 2) != 0 ? new C8855l(1, 0, 0) : null, enumC5244l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12543l)) {
            return false;
        }
        C12543l c12543l = (C12543l) obj;
        return this.yandex == c12543l.yandex && AbstractC8576l.yandex(this.loadAd, c12543l.loadAd) && this.crashlytics == c12543l.crashlytics;
    }

    public final int hashCode() {
        int iHashCode = this.yandex.hashCode() * 31;
        C8855l c8855l = this.loadAd;
        return this.crashlytics.hashCode() + ((iHashCode + (c8855l == null ? 0 : c8855l.f18206l)) * 31);
    }

    public final String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.yandex + ", sinceVersion=" + this.loadAd + ", reportLevelAfter=" + this.crashlytics + ')';
    }

    public C12543l(EnumC5244l enumC5244l, C8855l c8855l, EnumC5244l enumC5244l2) {
        this.yandex = enumC5244l;
        this.loadAd = c8855l;
        this.crashlytics = enumC5244l2;
    }
}
