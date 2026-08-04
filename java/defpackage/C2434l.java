package defpackage;

import j$.util.Objects;

/* JADX INFO: renamed from: lؘّؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2434l {
    public final int amazon;
    public final boolean crashlytics;
    public final C9173l loadAd;
    public final C15019l yandex;

    public C2434l(C15019l c15019l, C9173l c9173l, boolean z, int i) {
        this.yandex = c15019l;
        this.loadAd = c9173l;
        this.crashlytics = z;
        this.amazon = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2434l)) {
            return false;
        }
        C2434l c2434l = (C2434l) obj;
        return Objects.equals(this.yandex, c2434l.yandex) && Objects.equals(this.loadAd, c2434l.loadAd) && this.crashlytics == c2434l.crashlytics && this.amazon == c2434l.amazon;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.amazon), Boolean.valueOf(this.crashlytics), this.yandex, this.loadAd);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(Playlist mMasterPlaylist=");
        sb.append(this.yandex);
        sb.append(" mMediaPlaylist=");
        sb.append(this.loadAd);
        sb.append(" mIsExtended=");
        sb.append(this.crashlytics);
        sb.append(" mCompatibilityVersion=");
        return AbstractC14814l.remoteconfig(this.amazon, ")", sb);
    }

    public final boolean yandex() {
        return this.yandex != null;
    }
}
