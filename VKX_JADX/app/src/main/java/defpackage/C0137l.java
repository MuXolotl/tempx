package defpackage;

/* JADX INFO: renamed from: lٌؘؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C0137l {
    public static final C7513l Companion = new C7513l();
    public static final InterfaceC1220l[] amazon = {AbstractC9968l.crashlytics(2, new C7282l(20)), null, null};
    public final String crashlytics;
    public final String loadAd;
    public final EnumC18732l yandex;

    public /* synthetic */ C0137l(int i, EnumC18732l enumC18732l, String str, String str2) {
        if (1 != (i & 1)) {
            AbstractC11036l.isPro(i, 1, C15072l.yandex.purchase());
            throw null;
        }
        this.yandex = enumC18732l;
        if ((i & 2) == 0) {
            this.loadAd = null;
        } else {
            this.loadAd = str;
        }
        if ((i & 4) == 0) {
            this.crashlytics = null;
        } else {
            this.crashlytics = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0137l)) {
            return false;
        }
        C0137l c0137l = (C0137l) obj;
        return this.yandex == c0137l.yandex && AbstractC8576l.yandex(this.loadAd, c0137l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c0137l.crashlytics);
    }

    public final int hashCode() {
        int iHashCode = this.yandex.hashCode() * 31;
        String str = this.loadAd;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.crashlytics;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsScopeDto(name=");
        sb.append(this.yandex);
        sb.append(", title=");
        sb.append(this.loadAd);
        sb.append(", description=");
        return AbstractC2812l.tapsense(sb, this.crashlytics, ')');
    }
}
