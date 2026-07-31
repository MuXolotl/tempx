package defpackage;

/* JADX INFO: renamed from: lٗۗ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C17346l {
    public static final C5126l Companion = new C5126l();
    public static final InterfaceC1220l[] amazon = {AbstractC9968l.crashlytics(2, new C7703l(11)), AbstractC9968l.crashlytics(2, new C7703l(12)), null};
    public final String crashlytics;
    public final EnumC15420l loadAd;
    public final EnumC6525l yandex;

    public /* synthetic */ C17346l(int i, EnumC6525l enumC6525l, EnumC15420l enumC15420l, String str) {
        if (1 != (i & 1)) {
            AbstractC11036l.isPro(i, 1, C4114l.yandex.purchase());
            throw null;
        }
        this.yandex = enumC6525l;
        if ((i & 2) == 0) {
            this.loadAd = null;
        } else {
            this.loadAd = enumC15420l;
        }
        if ((i & 4) == 0) {
            this.crashlytics = null;
        } else {
            this.crashlytics = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17346l)) {
            return false;
        }
        C17346l c17346l = (C17346l) obj;
        return this.yandex == c17346l.yandex && this.loadAd == c17346l.loadAd && AbstractC8576l.yandex(this.crashlytics, c17346l.crashlytics);
    }

    public final int hashCode() {
        int iHashCode = this.yandex.hashCode() * 31;
        EnumC15420l enumC15420l = this.loadAd;
        int iHashCode2 = (iHashCode + (enumC15420l == null ? 0 : enumC15420l.hashCode())) * 31;
        String str = this.crashlytics;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseLinkButtonActionDto(type=");
        sb.append(this.yandex);
        sb.append(", target=");
        sb.append(this.loadAd);
        sb.append(", url=");
        return AbstractC2812l.tapsense(sb, this.crashlytics, ')');
    }
}
