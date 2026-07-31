package defpackage;

/* JADX INFO: renamed from: lؚّٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C7220l {
    public static final C17864l Companion = new C17864l();
    public final String amazon;
    public final long crashlytics;
    public final int loadAd;
    public final int yandex;

    public /* synthetic */ C7220l(int i, int i2, int i3, long j, String str) {
        if (1 != (i & 1)) {
            AbstractC11036l.isPro(i, 1, C8516l.yandex.purchase());
            throw null;
        }
        this.yandex = i2;
        if ((i & 2) == 0) {
            this.loadAd = 0;
        } else {
            this.loadAd = i3;
        }
        if ((i & 4) == 0) {
            this.crashlytics = 0L;
        } else {
            this.crashlytics = j;
        }
        if ((i & 8) == 0) {
            this.amazon = "";
        } else {
            this.amazon = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7220l)) {
            return false;
        }
        C7220l c7220l = (C7220l) obj;
        return this.yandex == c7220l.yandex && this.loadAd == c7220l.loadAd && this.crashlytics == c7220l.crashlytics && AbstractC8576l.yandex(this.amazon, c7220l.amazon);
    }

    public final int hashCode() {
        int i = ((this.yandex * 31) + this.loadAd) * 31;
        long j = this.crashlytics;
        return this.amazon.hashCode() + ((i + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthGetAuthCodeStatusResponseDto(status=");
        sb.append(this.yandex);
        sb.append(", expiresIn=");
        sb.append(this.loadAd);
        sb.append(", userId=");
        sb.append(this.crashlytics);
        sb.append(", accessToken=");
        return AbstractC2812l.tapsense(sb, this.amazon, ')');
    }
}
