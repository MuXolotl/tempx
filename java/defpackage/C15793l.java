package defpackage;

/* JADX INFO: renamed from: lٕٛۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C15793l {
    public static final C4824l Companion = new C4824l();
    public final String crashlytics;
    public final int loadAd;
    public final String yandex;

    public /* synthetic */ C15793l(int i, int i2, String str, String str2) {
        if (7 != (i & 7)) {
            AbstractC11036l.isPro(i, 7, C9727l.yandex.purchase());
            throw null;
        }
        this.yandex = str;
        this.loadAd = i2;
        this.crashlytics = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15793l)) {
            return false;
        }
        C15793l c15793l = (C15793l) obj;
        return AbstractC8576l.yandex(this.yandex, c15793l.yandex) && this.loadAd == c15793l.loadAd && AbstractC8576l.yandex(this.crashlytics, c15793l.crashlytics);
    }

    public final int hashCode() {
        return this.crashlytics.hashCode() + (((this.yandex.hashCode() * 31) + this.loadAd) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthRefreshSilentTokenDto(token=");
        sb.append(this.yandex);
        sb.append(", expiresIn=");
        sb.append(this.loadAd);
        sb.append(", uuid=");
        return AbstractC2812l.tapsense(sb, this.crashlytics, ')');
    }
}
