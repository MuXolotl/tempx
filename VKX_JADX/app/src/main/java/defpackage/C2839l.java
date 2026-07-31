package defpackage;

/* JADX INFO: renamed from: lؔۗؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C2839l {
    public static final C0256l Companion = new C0256l();
    public final String crashlytics;
    public final long loadAd;
    public final int yandex;

    public /* synthetic */ C2839l(int i, int i2, C10877l c10877l, String str) {
        if (3 != (i & 3)) {
            AbstractC11036l.isPro(i, 3, C12738l.yandex.purchase());
            throw null;
        }
        this.yandex = i2;
        this.loadAd = c10877l.yandex;
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
        if (!(obj instanceof C2839l)) {
            return false;
        }
        C2839l c2839l = (C2839l) obj;
        return this.yandex == c2839l.yandex && C10877l.yandex(this.loadAd, c2839l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c2839l.crashlytics);
    }

    public final int hashCode() {
        int iLoadAd = (C10877l.loadAd(this.loadAd) + (this.yandex * 31)) * 31;
        String str = this.crashlytics;
        return iLoadAd + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioPlaylistOriginalFollowedDto(playlistId=");
        sb.append(this.yandex);
        sb.append(", ownerId=");
        sb.append((Object) String.valueOf(this.loadAd));
        sb.append(", accessKey=");
        return AbstractC2812l.tapsense(sb, this.crashlytics, ')');
    }
}
