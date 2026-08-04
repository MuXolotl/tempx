package defpackage;

/* JADX INFO: renamed from: lٌۧ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9217l {
    public static final C9217l billing = new C9217l(null, false);
    public final boolean amazon;
    public final boolean crashlytics;
    public final EnumC10151l loadAd;
    public final boolean purchase;
    public final EnumC10249l yandex;

    public C9217l(EnumC10249l enumC10249l, EnumC10151l enumC10151l, boolean z, boolean z2, boolean z3) {
        this.yandex = enumC10249l;
        this.loadAd = enumC10151l;
        this.crashlytics = z;
        this.amazon = z2;
        this.purchase = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9217l)) {
            return false;
        }
        C9217l c9217l = (C9217l) obj;
        return this.yandex == c9217l.yandex && this.loadAd == c9217l.loadAd && this.crashlytics == c9217l.crashlytics && this.amazon == c9217l.amazon && this.purchase == c9217l.purchase;
    }

    public final int hashCode() {
        EnumC10249l enumC10249l = this.yandex;
        int iHashCode = (enumC10249l == null ? 0 : enumC10249l.hashCode()) * 31;
        EnumC10151l enumC10151l = this.loadAd;
        return ((((((iHashCode + (enumC10151l != null ? enumC10151l.hashCode() : 0)) * 31) + (this.crashlytics ? 1231 : 1237)) * 31) + (this.amazon ? 1231 : 1237)) * 31) + (this.purchase ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JavaTypeQualifiers(nullability=");
        sb.append(this.yandex);
        sb.append(", mutability=");
        sb.append(this.loadAd);
        sb.append(", definitelyNotNull=");
        sb.append(this.crashlytics);
        sb.append(", isNullabilityQualifierForWarning=");
        sb.append(this.amazon);
        sb.append(", isMutabilityQualifierForWarning=");
        return AbstractC0653l.tapsense(sb, this.purchase, ')');
    }

    public /* synthetic */ C9217l(EnumC10249l enumC10249l, boolean z) {
        this(enumC10249l, null, z, false, false);
    }
}
