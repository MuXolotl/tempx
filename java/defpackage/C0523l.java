package defpackage;

/* JADX INFO: renamed from: lؑۗ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l
public final class C0523l {
    public static final C7107l Companion = new C7107l();
    public final String amazon;
    public final int billing;
    public final String crashlytics;
    public final long loadAd;
    public final String purchase;
    public final int yandex;

    public /* synthetic */ C0523l(int i, int i2, long j, String str, String str2, String str3, int i3) {
        if (3 != (i & 3)) {
            AbstractC11036l.isPro(i, 3, C14095l.yandex.purchase());
            throw null;
        }
        this.yandex = i2;
        this.loadAd = j;
        if ((i & 4) == 0) {
            this.crashlytics = null;
        } else {
            this.crashlytics = str;
        }
        if ((i & 8) == 0) {
            this.amazon = "";
        } else {
            this.amazon = str2;
        }
        if ((i & 16) == 0) {
            this.purchase = "";
        } else {
            this.purchase = str3;
        }
        if ((i & 32) == 0) {
            this.billing = 0;
        } else {
            this.billing = i3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0523l)) {
            return false;
        }
        C0523l c0523l = (C0523l) obj;
        return this.yandex == c0523l.yandex && this.loadAd == c0523l.loadAd && AbstractC8576l.yandex(this.crashlytics, c0523l.crashlytics) && AbstractC8576l.yandex(this.amazon, c0523l.amazon) && AbstractC8576l.yandex(this.purchase, c0523l.purchase) && this.billing == c0523l.billing;
    }

    public final int hashCode() {
        int i = this.yandex * 31;
        long j = this.loadAd;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        String str = this.crashlytics;
        return AbstractC12589l.advert(AbstractC12589l.advert((i2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.amazon), 31, this.purchase) + this.billing;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaylistScreenArgs(id=");
        sb.append(this.yandex);
        sb.append(", ownerId=");
        sb.append(this.loadAd);
        sb.append(", accessKey=");
        sb.append(this.crashlytics);
        sb.append(", artworkUrl=");
        sb.append(this.amazon);
        sb.append(", title=");
        sb.append(this.purchase);
        sb.append(", colorInt=");
        return AbstractC0653l.adcel(sb, this.billing, ')');
    }

    public C0523l(int i, int i2, long j, String str, String str2, String str3) {
        this.yandex = i;
        this.loadAd = j;
        this.crashlytics = str;
        this.amazon = str2;
        this.purchase = str3;
        this.billing = i2;
    }
}
