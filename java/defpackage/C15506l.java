package defpackage;

/* JADX INFO: renamed from: lؘٕٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C15506l {
    public static final C3507l Companion = new C3507l();
    public final String crashlytics;
    public final long loadAd;
    public final String yandex;

    public /* synthetic */ C15506l(int i, long j, String str, String str2) {
        if (7 != (i & 7)) {
            AbstractC11036l.isPro(i, 7, C4484l.yandex.purchase());
            throw null;
        }
        this.yandex = str;
        this.loadAd = j;
        this.crashlytics = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15506l)) {
            return false;
        }
        C15506l c15506l = (C15506l) obj;
        return AbstractC8576l.yandex(this.yandex, c15506l.yandex) && this.loadAd == c15506l.loadAd && AbstractC8576l.yandex(this.crashlytics, c15506l.crashlytics);
    }

    public final int hashCode() {
        int iHashCode = this.yandex.hashCode() * 31;
        long j = this.loadAd;
        return this.crashlytics.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Y25Playlist(title=");
        sb.append(this.yandex);
        sb.append(", id=");
        sb.append(this.loadAd);
        sb.append(", photoUrl=");
        return AbstractC2812l.tapsense(sb, this.crashlytics, ')');
    }
}
