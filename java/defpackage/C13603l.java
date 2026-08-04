package defpackage;

/* JADX INFO: renamed from: lْۘؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C13603l {
    public static final C0698l Companion = new C0698l();
    public final String crashlytics;
    public final int loadAd;
    public final int yandex;

    public /* synthetic */ C13603l(int i, int i2, int i3, String str) {
        if (7 != (i & 7)) {
            AbstractC11036l.isPro(i, 7, C4125l.yandex.purchase());
            throw null;
        }
        this.yandex = i2;
        this.loadAd = i3;
        this.crashlytics = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13603l)) {
            return false;
        }
        C13603l c13603l = (C13603l) obj;
        return this.yandex == c13603l.yandex && this.loadAd == c13603l.loadAd && AbstractC8576l.yandex(this.crashlytics, c13603l.crashlytics);
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + (((this.yandex * 31) + this.loadAd) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthRefreshTokenErrorDto(index=");
        sb.append(this.yandex);
        sb.append(", code=");
        sb.append(this.loadAd);
        sb.append(", description=");
        return AbstractC2812l.tapsense(sb, this.crashlytics, ')');
    }
}
