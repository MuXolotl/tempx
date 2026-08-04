package defpackage;

/* JADX INFO: renamed from: lؔۚٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C2895l implements InterfaceC17709l {
    public static final C6545l Companion = new C6545l();
    public final long amazon;
    public final int crashlytics;
    public final String loadAd;
    public final int yandex;

    public /* synthetic */ C2895l(int i, int i2, int i3, long j, String str) {
        if (15 != (i & 15)) {
            AbstractC11036l.isPro(i, 15, C3413l.yandex.purchase());
            throw null;
        }
        this.yandex = i2;
        this.loadAd = str;
        this.crashlytics = i3;
        this.amazon = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2895l)) {
            return false;
        }
        C2895l c2895l = (C2895l) obj;
        return this.yandex == c2895l.yandex && AbstractC8576l.yandex(this.loadAd, c2895l.loadAd) && this.crashlytics == c2895l.crashlytics && this.amazon == c2895l.amazon;
    }

    public final int hashCode() {
        int iAdvert = (AbstractC12589l.advert(this.yandex * 31, 31, this.loadAd) + this.crashlytics) * 31;
        long j = this.amazon;
        return iAdvert + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Handshake(appVersionCode=");
        sb.append(this.yandex);
        sb.append(", appVersionName=");
        sb.append(this.loadAd);
        sb.append(", fileCount=");
        sb.append(this.crashlytics);
        sb.append(", fileTotalSize=");
        return AbstractC12900l.smaato(sb, this.amazon, ')');
    }

    public C2895l(int i, long j) {
        this.yandex = 100136;
        this.loadAd = "8.14.1_pub";
        this.crashlytics = i;
        this.amazon = j;
    }
}
