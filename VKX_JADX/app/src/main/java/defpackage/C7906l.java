package defpackage;

/* JADX INFO: renamed from: lًَُ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C7906l {
    public static final C16432l Companion = new C16432l();
    public final String amazon;
    public final int crashlytics;
    public final String loadAd;
    public final int yandex;

    public /* synthetic */ C7906l(int i, int i2, int i3, String str, String str2) {
        if (15 != (i & 15)) {
            AbstractC11036l.isPro(i, 15, C3851l.yandex.purchase());
            throw null;
        }
        this.yandex = i2;
        this.loadAd = str;
        this.crashlytics = i3;
        this.amazon = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7906l)) {
            return false;
        }
        C7906l c7906l = (C7906l) obj;
        return this.yandex == c7906l.yandex && AbstractC8576l.yandex(this.loadAd, c7906l.loadAd) && this.crashlytics == c7906l.crashlytics && AbstractC8576l.yandex(this.amazon, c7906l.amazon);
    }

    public final int hashCode() {
        return this.amazon.hashCode() + ((AbstractC12589l.advert(this.yandex * 31, 31, this.loadAd) + this.crashlytics) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EcosystemSendOtpResponseDto(status=");
        sb.append(this.yandex);
        sb.append(", sid=");
        sb.append(this.loadAd);
        sb.append(", codeLength=");
        sb.append(this.crashlytics);
        sb.append(", info=");
        return AbstractC2812l.tapsense(sb, this.amazon, ')');
    }
}
